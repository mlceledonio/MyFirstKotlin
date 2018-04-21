package com.mesha.myfirstkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var currentPic = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun change(view: View) {
        if(currentPic == 0) {
            imageView.setImageResource(R.drawable.reaper_pose)
            currentPic = 1
        } else if(currentPic == 1) {
            imageView.setImageResource(R.drawable.reaper_portrait)
            currentPic = 0
        }
    }
}
