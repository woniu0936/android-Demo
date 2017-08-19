package com.woniu.demo.constrainlayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.woniu.demo.R
import com.woniu.demo.extension.click
import com.woniu.demo.extension.show
import com.woniu.demo.extension.toggleVisible
import kotlinx.android.synthetic.main.fragment_constraintlayout_03.*
import me.yokeyword.fragmentation_swipeback.SwipeBackFragment

/**
 * @author woniu
 * @title Fragment03
 * @description
 * @modifier
 * @date
 * @since 2017/7/28 下午5:56
 */
class Fragment03 : SwipeBackFragment() {

    companion object {
        fun newInstance(): Fragment03 = Fragment03()
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_constraintlayout_03, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnToggle.click {
            tvGone.toggleVisible()
//            tvGone.show()
        }
    }

}