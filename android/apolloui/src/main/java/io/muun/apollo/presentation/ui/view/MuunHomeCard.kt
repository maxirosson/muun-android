package io.muun.apollo.presentation.ui.view

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.widget.ImageView
import android.widget.TextView
import butterknife.BindView
import io.muun.apollo.R

class MuunHomeCard @JvmOverloads constructor(c: Context, a: AttributeSet? = null, s: Int = 0) :
    MuunView(c, a, s) {

    @BindView(R.id.icon)
    lateinit var iconView: ImageView

    @BindView(R.id.body)
    lateinit var bodyView: TextView

    override val layoutResource: Int
        get() = R.layout.view_muun_home_card

    var icon: Drawable
        get() = iconView.drawable
        set(drawable) {
            iconView.setImageDrawable(drawable)
        }

    var body: CharSequence
        get() = bodyView.text
        set(text) {
            bodyView.text = text
        }
}