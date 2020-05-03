package com.liujia95.musicplayer.ui.fragment

import android.view.View
import android.widget.TextView
import com.liujia95.musicplayer.base.BaseFragment

/**
 * author : liujia
 * time   : 2020/05/03
 * desc   :
 * version: 1.0
 */
class VListFragment :BaseFragment() {
    override fun initView(): View {
        val tv = TextView(context)
        tv.text = javaClass.simpleName
        return tv
    }
}