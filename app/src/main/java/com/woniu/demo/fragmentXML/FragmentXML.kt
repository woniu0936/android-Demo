package com.woniu.demo.fragmentXML

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.woniu.demo.R

/**
 * @author woniu
 * @title FragmentXML
 * @description
 * @modifier
 * @date
 * @since 2017/8/16 下午4:41
 */
class FragmentXML : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater?.inflate(R.layout.fragment_in_xml, container, false)
        return root
    }

}