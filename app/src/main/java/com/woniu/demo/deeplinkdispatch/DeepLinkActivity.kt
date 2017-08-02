package com.woniu.demo.deeplinkdispatch

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.airbnb.deeplinkdispatch.DeepLinkHandler

/**
 * @author woniu
 * @title DeepLinkActivity
 * @description
 * @modifier
 * @date
 * @since 2017/8/2 下午2:33
 */
@DeepLinkHandler(AppDeepLinkModule::class)
class DeepLinkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val deepLinkDelegate = DeepLinkDelegate(AppDeepLinkModuleLoader())
        deepLinkDelegate.dispatchFrom(this)
        finish()
    }
}