// Generated by view binder compiler. Do not edit!
package com.kuntito.abundantlifehymnbook.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kuntito.abundantlifehymnbook.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class HymnVerseItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView tvVerseId;

  @NonNull
  public final TextView tvVerseLyrics;

  private HymnVerseItemBinding(@NonNull LinearLayout rootView, @NonNull TextView tvVerseId,
      @NonNull TextView tvVerseLyrics) {
    this.rootView = rootView;
    this.tvVerseId = tvVerseId;
    this.tvVerseLyrics = tvVerseLyrics;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static HymnVerseItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static HymnVerseItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.hymn_verse_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static HymnVerseItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tv_verse_id;
      TextView tvVerseId = ViewBindings.findChildViewById(rootView, id);
      if (tvVerseId == null) {
        break missingId;
      }

      id = R.id.tv_verse_lyrics;
      TextView tvVerseLyrics = ViewBindings.findChildViewById(rootView, id);
      if (tvVerseLyrics == null) {
        break missingId;
      }

      return new HymnVerseItemBinding((LinearLayout) rootView, tvVerseId, tvVerseLyrics);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
