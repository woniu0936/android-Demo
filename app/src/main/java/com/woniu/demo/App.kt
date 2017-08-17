package com.woniu.demo

import android.app.Application
import com.google.android.exoplayer2.upstream.*
import com.google.android.exoplayer2.util.Util

/**
 * @author woniu
 * @title App
 * @description
 * @modifier
 * @date
 * @since 2017/8/2 下午2:37
 */
class App : Application() {

    val userAgent: String by lazy { Util.getUserAgent(this, "ExoPlayerDemo") }

    override fun onCreate() {
        super.onCreate()
    }

    fun buildDataSourceFactory(bandwidthMeter: DefaultBandwidthMeter): DataSource.Factory {
        return DefaultDataSourceFactory(this, bandwidthMeter,
                buildHttpDataSourceFactory(bandwidthMeter))
    }

    fun buildHttpDataSourceFactory(bandwidthMeter: DefaultBandwidthMeter): HttpDataSource.Factory {
        return DefaultHttpDataSourceFactory(userAgent, bandwidthMeter)
    }

    fun useExtensionRenderers(): Boolean {
        return BuildConfig.FLAVOR.equals("withExtensions")
    }
}