package com.example.myextensionfunctionsclass

import android.content.Context
import android.net.ConnectivityManager
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.drawerlayout.widget.DrawerLayout
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso

class MyExtensionFuncs {

    fun ImageView.loadFromUrl(url: String) {
        Picasso.get().load(url).into(this)
    }

    fun ImageView.loadFromUrl(url: String, context: Context) {
        Glide.with(context).load(url).into(this)
    }

    fun Button.disableButton() {
        isEnabled = false
        alpha = 0.7f
    }

    fun Button.enableButton() {
        isEnabled = true
        alpha = 1.0f
    }
    fun View.isVisibile(): Boolean = visibility == View.VISIBLE

    fun View.isGone(): Boolean = visibility == View.GONE

    fun View.isInvisible(): Boolean = visibility == View.INVISIBLE


    fun View.makeVisible() {
        visibility = View.VISIBLE
    }

    fun View.makeGone() {
        visibility = View.GONE
    }

    fun View.makeInvisible() {
        visibility = View.INVISIBLE
    }
}