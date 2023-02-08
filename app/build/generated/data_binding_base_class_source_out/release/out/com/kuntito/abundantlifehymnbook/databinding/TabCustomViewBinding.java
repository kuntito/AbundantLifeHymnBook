// Generated by view binder compiler. Do not edit!
package com.kuntito.abundantlifehymnbook.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kuntito.abundantlifehymnbook.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class TabCustomViewBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView tvTab;

  private TabCustomViewBinding(@NonNull RelativeLayout rootView, @NonNull TextView tvTab) {
    this.rootView = rootView;
    this.tvTab = tvTab;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static TabCustomViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static TabCustomViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.tab_custom_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static TabCustomViewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tv_tab;
      TextView tvTab = ViewBindings.findChildViewById(rootView, id);
      if (tvTab == null) {
        break missingId;
      }

      return new TabCustomViewBinding((RelativeLayout) rootView, tvTab);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
