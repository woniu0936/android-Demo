package com.woniu.demo.constrainlayout

import android.os.Bundle
import com.woniu.demo.R
import me.yokeyword.fragmentation_swipeback.SwipeBackActivity

class ConstraintLayoutActivity : SwipeBackActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_layout)
        loadRootFragment(R.id.flContent, FragmentNavigator.newInstance())
    }
}
