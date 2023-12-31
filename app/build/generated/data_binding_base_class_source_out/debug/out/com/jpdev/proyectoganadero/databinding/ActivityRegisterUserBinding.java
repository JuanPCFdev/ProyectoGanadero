// Generated by view binder compiler. Do not edit!
package com.jpdev.proyectoganadero.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jpdev.proyectoganadero.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterUserBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnAlreadyRegistered;

  @NonNull
  public final Button btnRegister;

  @NonNull
  public final CardView cardRegister;

  @NonNull
  public final EditText etConfirmPassword;

  @NonNull
  public final EditText etName;

  @NonNull
  public final EditText etPassword;

  @NonNull
  public final EditText etPhone;

  private ActivityRegisterUserBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnAlreadyRegistered, @NonNull Button btnRegister,
      @NonNull CardView cardRegister, @NonNull EditText etConfirmPassword, @NonNull EditText etName,
      @NonNull EditText etPassword, @NonNull EditText etPhone) {
    this.rootView = rootView;
    this.btnAlreadyRegistered = btnAlreadyRegistered;
    this.btnRegister = btnRegister;
    this.cardRegister = cardRegister;
    this.etConfirmPassword = etConfirmPassword;
    this.etName = etName;
    this.etPassword = etPassword;
    this.etPhone = etPhone;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterUserBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register_user, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterUserBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnAlreadyRegistered;
      Button btnAlreadyRegistered = ViewBindings.findChildViewById(rootView, id);
      if (btnAlreadyRegistered == null) {
        break missingId;
      }

      id = R.id.btnRegister;
      Button btnRegister = ViewBindings.findChildViewById(rootView, id);
      if (btnRegister == null) {
        break missingId;
      }

      id = R.id.cardRegister;
      CardView cardRegister = ViewBindings.findChildViewById(rootView, id);
      if (cardRegister == null) {
        break missingId;
      }

      id = R.id.etConfirmPassword;
      EditText etConfirmPassword = ViewBindings.findChildViewById(rootView, id);
      if (etConfirmPassword == null) {
        break missingId;
      }

      id = R.id.etName;
      EditText etName = ViewBindings.findChildViewById(rootView, id);
      if (etName == null) {
        break missingId;
      }

      id = R.id.etPassword;
      EditText etPassword = ViewBindings.findChildViewById(rootView, id);
      if (etPassword == null) {
        break missingId;
      }

      id = R.id.etPhone;
      EditText etPhone = ViewBindings.findChildViewById(rootView, id);
      if (etPhone == null) {
        break missingId;
      }

      return new ActivityRegisterUserBinding((ConstraintLayout) rootView, btnAlreadyRegistered,
          btnRegister, cardRegister, etConfirmPassword, etName, etPassword, etPhone);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
