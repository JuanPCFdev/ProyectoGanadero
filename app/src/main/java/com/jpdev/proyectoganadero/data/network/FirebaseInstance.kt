package com.jpdev.proyectoganadero.data.network

import android.content.Context
import android.util.Log
import com.google.firebase.Firebase
import com.google.firebase.FirebaseApp
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.database
import com.google.firebase.database.getValue
import com.google.firebase.database.values
import com.jpdev.proyectoganadero.domain.model.Farm
import com.jpdev.proyectoganadero.domain.model.User
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException

class FirebaseInstance(context: Context) {

    private val database = Firebase.database
    private val myRef = database.reference

    init {
        FirebaseApp.initializeApp(context)
    }

    //Metodos para escribir un objeto en la base de datos
    fun writeOnFirebase(user:User){
        val newUser = myRef.push()
        newUser.setValue(user)
    }


    // Método para registrar una finca
    fun registerFarm(farm: Farm, key: String?) {
        val userReference = myRef.child(key.toString())

        userReference.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot.exists()) {
                    val existingUser = snapshot.getValue(User::class.java)
                    existingUser?.farms?.add(farm)
                    userReference.setValue(existingUser)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                Log.i("Algo fallo", error.details)
            }
        })
    }

    suspend fun getUser(key:String?):User? = suspendCancellableCoroutine {
        val userRef = myRef.child(key.toString())

        val valueEventListener = object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val user = snapshot.getValue(User::class.java)
                it.resume(user)
            }

            override fun onCancelled(error: DatabaseError) {
                it.resumeWithException(error.toException())
            }

        }

        userRef.addListenerForSingleValueEvent(valueEventListener)

        it.invokeOnCancellation {
            userRef.removeEventListener(valueEventListener)
        }
    }


    fun getUserFarms(key: String?, callback: (List<Farm>?) -> Unit) {
        // Crea una referencia al nodo "farms" dentro del usuario identificado por "key"
        val userReference = myRef.child(key.toString()).child("farms")

        // Agrega un listener que se ejecutará una vez para leer los datos
        userReference.addListenerForSingleValueEvent(object : ValueEventListener {
            // Este método se llama cuando los datos se leen exitosamente
            override fun onDataChange(snapshot: DataSnapshot) {
                // Crea una lista mutable para almacenar las fincas del usuario
                val farms = mutableListOf<Farm>()

                // Itera sobre los hijos (fincas) del nodo "farms"
                for (farmSnapshot in snapshot.children) {
                    // Obtiene cada finca y la convierte a la clase Farm
                    val farmKey = farmSnapshot.key
                    val farm = farmSnapshot.getValue(Farm::class.java)

                    // Añade la finca a la lista, si no es nula
                    farm?.let { farms.add(it) }
                }

                // Llama al callback proporcionando la lista de fincas al código que lo llamó
                callback(farms)
            }

            // Este método se llama si la operación se cancela, por ejemplo, debido a un error
            override fun onCancelled(error: DatabaseError) {
                // Imprime un mensaje de error en los detalles del error
                Log.i("Algo fallo", error.details)

                // Llama al callback con un valor nulo para indicar que hubo un error
                callback(null)
            }
        })
    }


    fun setupDatabaseListener(postListener: ValueEventListener ){
        database.reference.addValueEventListener(postListener)
    }

    fun getCleanSnapshot(snapshot: DataSnapshot):List<Pair<String,User>>{
        val list = snapshot.children.map { user ->
            Pair(user.key!!,user.getValue(User::class.java)!!)
        }
        return list
    }

    //Metodo para leer los objetos de la base de datos -> coroutine
    //Metodo para Editar un objeto de la base de datos
    //Metodo para Eliminar un objeto de la base de datos
    //Metodo para Registrar algo en la base de datos

}