package com.woniu.demo.extension

import android.content.Context
import android.content.Intent
import android.os.Bundle

/**
 * @author woniu
 * @title Context
 * @description
 * @modifier
 * @date
 * @since 2017/7/28 下午5:14
 */
fun Context.startActivity(clazz: Class<Any>) {
    this.startActivity(Intent(this, clazz))
}