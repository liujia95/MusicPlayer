package com.liujia95.musicplayer.util

import com.liujia95.musicplayer.R
import com.liujia95.musicplayer.base.BaseFragment
import com.liujia95.musicplayer.ui.fragment.HomeFragment
import com.liujia95.musicplayer.ui.fragment.MVFragment
import com.liujia95.musicplayer.ui.fragment.MVListFragment
import com.liujia95.musicplayer.ui.fragment.VListFragment

/**
 * author : liujia
 * time   : 2020/05/03
 * desc   :
 * version: 1.0
 */
class FragmentUtil private constructor(){ //私有构造

    private val homeFragment by lazy { HomeFragment() }
    private val mvFragment by lazy { MVFragment() }
    private val vListFragment by lazy { VListFragment() }
    private val mvListFragment by lazy { MVListFragment() }

    companion object{
        val fragmentUtil by lazy { FragmentUtil() }
    }

    fun getFragment(tabId:Int):BaseFragment{
        return when(tabId){
            R.id.tab_home-> homeFragment
            R.id.tab_mv-> mvFragment
            R.id.tab_vlist-> vListFragment
            R.id.tab_mvlist-> mvListFragment
            else -> homeFragment
        }

    }

}