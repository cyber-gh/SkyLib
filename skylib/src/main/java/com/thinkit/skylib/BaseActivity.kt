package com.thinkit.skylib

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity: AppCompatActivity() {

    protected open fun initialize() {

    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        initialize()
    }
}