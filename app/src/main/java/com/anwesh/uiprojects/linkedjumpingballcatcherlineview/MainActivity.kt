package com.anwesh.uiprojects.linkedjumpingballcatcherlineview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.jumpingballcatcherview.JumpingBallCatcherLineView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        JumpingBallCatcherLineView.create(this)
    }
}
