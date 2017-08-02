package com.woniu.demo.deeplinkdispatch

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.deeplinkdispatch.DeepLink

import com.woniu.demo.R

@DeepLink("https://join.gouhuoapp.com/invite/home/")
class DeepLinkDispatchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deep_link_dispatch)
        if (intent.getBooleanExtra(DeepLink.IS_DEEP_LINK, false)) {
            //获取参数
        }
    }
}
