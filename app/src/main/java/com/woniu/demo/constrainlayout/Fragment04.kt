package com.woniu.demo.constrainlayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.woniu.demo.R
import me.yokeyword.fragmentation_swipeback.SwipeBackFragment

/**
 * @author woniu
 * @title Fragment04
 * @description
 * @modifier
 * @date
 * @since 2017/7/28 下午5:56
 */
class Fragment04 : SwipeBackFragment() {

    companion object {
        fun newInstance(): Fragment04 = Fragment04()
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_constraintlayout_04, container, false)
    }

}