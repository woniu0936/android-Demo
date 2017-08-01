package com.woniu.demo.extension

import android.view.View

/**
 * @author woniu
 * @title View
 * @description
 * @modifier
 * @date
 * @since 2017/7/28 下午7:12
 */
fun View.click(listener: (View) -> Unit) {
    setOnClickListener(listener)
}