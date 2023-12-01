// Generated by view binder compiler. Do not edit!
package com.jpdev.proyectoganadero.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jpdev.proyectoganadero.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityConsultCowsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnHome;

  @NonNull
  public final Button btnRegisterCow;

  @NonNull
  public final CardView cvRecycler;

  @NonNull
  public final RecyclerView rvCows;

  @NonNull
  public final TextView tvDescription;

  @NonNull
  public final TextView tvRegisteredCows;

  private ActivityConsultCowsBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnHome,
      @NonNull Button btnRegisterCow, @NonNull CardView cvRecycler, @NonNull RecyclerView rvCows,
      @NonNull TextView tvDescription, @NonNull TextView tvRegisteredCows) {
    this.rootView = rootView;
    this.btnHome = btnHome;
    this.btnRegisterCow = btnRegisterCow;
    this.cvRecycler = cvRecycler;
    this.rvCows = rvCows;
    this.tvDescription = tvDescription;
    this.tvRegisteredCows = tvRegisteredCows;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityConsultCowsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityConsultCowsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_consult_cows, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityConsultCowsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnHome;
      Button btnHome = ViewBindings.findChildViewById(rootView, id);
      if (btnHome == null) {
        break missingId;
      }

      id = R.id.btnRegisterCow;
      Button btnRegisterCow = ViewBindings.findChildViewById(rootView, id);
      if (btnRegisterCow == null) {
        break missingId;
      }

      id = R.id.cvRecycler;
      CardView cvRecycler = ViewBindings.findChildViewById(rootView, id);
      if (cvRecycler == null) {
        break missingId;
      }

      id = R.id.rvCows;
      RecyclerView rvCows = ViewBindings.findChildViewById(rootView, id);
      if (rvCows == null) {
        break missingId;
      }

      id = R.id.tvDescription;
      TextView tvDescription = ViewBindings.findChildViewById(rootView, id);
      if (tvDescription == null) {
        break missingId;
      }

      id = R.id.tvRegisteredCows;
      TextView tvRegisteredCows = ViewBindings.findChildViewById(rootView, id);
      if (tvRegisteredCows == null) {
        break missingId;
      }

      return new ActivityConsultCowsBinding((ConstraintLayout) rootView, btnHome, btnRegisterCow,
          cvRecycler, rvCows, tvDescription, tvRegisteredCows);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}