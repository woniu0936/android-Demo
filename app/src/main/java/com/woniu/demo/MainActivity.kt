package com.woniu.demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.woniu.demo.constrainlayout.ConstraintLayoutActivity
import com.woniu.demo.exoplayer.SampleChooserActivity
import com.woniu.demo.extension.click
import com.woniu.demo.fragmentXML.FragmentXMLActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvConstraintLayout.setOnClickListener {
            startActivity<ConstraintLayoutActivity>()
        }

        tvExoPlayer.click {
//            startActivity<SampleChooserActivity>()
        }

        tvFragment.click {
            startActivity<FragmentXMLActivity>()
        }

    }
}
