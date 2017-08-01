package com.woniu.demo.constrainlayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.woniu.demo.R
import com.woniu.demo.extension.click
import kotlinx.android.synthetic.main.fragment_constraintlayout_navigator.*
import me.yokeyword.fragmentation_swipeback.SwipeBackFragment

/**
 * @author woniu
 * @title FragmentNavigator
 * @description
 * @modifier
 * @date
 * @since 2017/7/28 下午6:08
 */
class FragmentNavigator : SwipeBackFragment() {
    companion object {
        fun newInstance(): FragmentNavigator = FragmentNavigator()
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_constraintlayout_navigator, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvToFragment01.click {
            start(Fragment01.newInstance())
        }

        tvToFragment02.click {
            start(Fragment02.newInstance())
        }

        tvToFragment03.click {
            start(Fragment03.newInstance())
        }

        tvToFragment04.click {
            start(Fragment04.newInstance())
        }

        tvToFragment05.click {
            start(Fragment05.newInstance())
        }

        tvToFragment06.click {
            start(Fragment06.newInstance())
        }
    }
}