package com.anwesh.uiprojects.linkedseesawbasicview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.seesawbasicview.SeeSawBasicView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SeeSawBasicView.create(this)
    }
}
