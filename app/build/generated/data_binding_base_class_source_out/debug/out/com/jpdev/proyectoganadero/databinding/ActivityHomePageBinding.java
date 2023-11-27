// Generated by view binder compiler. Do not edit!
package com.jpdev.proyectoganadero.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jpdev.proyectoganadero.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityHomePageBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnConsultCow;

  @NonNull
  public final Button btnConsultFarm;

  @NonNull
  public final Button btnConsultFinance;

  @NonNull
  public final Button btnConsultUser;

  @NonNull
  public final LinearLayout llfirst;

  @NonNull
  public final LinearLayout llsecond;

  @NonNull
  public final TextView titleHomePage;

  private ActivityHomePageBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnConsultCow,
      @NonNull Button btnConsultFarm, @NonNull Button btnConsultFinance,
      @NonNull Button btnConsultUser, @NonNull LinearLayout llfirst, @NonNull LinearLayout llsecond,
      @NonNull TextView titleHomePage) {
    this.rootView = rootView;
    this.btnConsultCow = btnConsultCow;
    this.btnConsultFarm = btnConsultFarm;
    this.btnConsultFinance = btnConsultFinance;
    this.btnConsultUser = btnConsultUser;
    this.llfirst = llfirst;
    this.llsecond = llsecond;
    this.titleHomePage = titleHomePage;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHomePageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHomePageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_home_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHomePageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnConsultCow;
      Button btnConsultCow = ViewBindings.findChildViewById(rootView, id);
      if (btnConsultCow == null) {
        break missingId;
      }

      id = R.id.btnConsultFarm;
      Button btnConsultFarm = ViewBindings.findChildViewById(rootView, id);
      if (btnConsultFarm == null) {
        break missingId;
      }

      id = R.id.btnConsultFinance;
      Button btnConsultFinance = ViewBindings.findChildViewById(rootView, id);
      if (btnConsultFinance == null) {
        break missingId;
      }

      id = R.id.btnConsultUser;
      Button btnConsultUser = ViewBindings.findChildViewById(rootView, id);
      if (btnConsultUser == null) {
        break missingId;
      }

      id = R.id.llfirst;
      LinearLayout llfirst = ViewBindings.findChildViewById(rootView, id);
      if (llfirst == null) {
        break missingId;
      }

      id = R.id.llsecond;
      LinearLayout llsecond = ViewBindings.findChildViewById(rootView, id);
      if (llsecond == null) {
        break missingId;
      }

      id = R.id.titleHomePage;
      TextView titleHomePage = ViewBindings.findChildViewById(rootView, id);
      if (titleHomePage == null) {
        break missingId;
      }

      return new ActivityHomePageBinding((ConstraintLayout) rootView, btnConsultCow, btnConsultFarm,
          btnConsultFinance, btnConsultUser, llfirst, llsecond, titleHomePage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
