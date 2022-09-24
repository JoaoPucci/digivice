package tech.pucci.digivice.presenter.list.adapter

import android.view.View
import android.widget.ImageView
import androidx.annotation.DrawableRes
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso

@BindingAdapter("imageUrl")
fun setImageUrl(imageView: ImageView, imageUrl: String) {
    Picasso.get().load(imageUrl).into(imageView)
}

@BindingAdapter("drawable")
fun setDrawable(imageView: ImageView, @DrawableRes resourceId: Int) {
    imageView.setImageResource(resourceId)
}

@BindingAdapter("visibility")
fun setVisibleOrGone(view: View, visible: Boolean) {
    view.visibility = if (visible) View.VISIBLE else View.GONE
}
