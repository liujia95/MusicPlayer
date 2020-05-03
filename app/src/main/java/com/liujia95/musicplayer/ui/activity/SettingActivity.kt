package com.liujia95.musicplayer.ui.activity

import androidx.appcompat.widget.Toolbar
import androidx.preference.PreferenceManager
import com.liujia95.musicplayer.R
import com.liujia95.musicplayer.base.BaseActivity
import com.liujia95.musicplayer.util.ToolbarManager
import org.jetbrains.anko.find

/**
 * author : liujia
 * time   : 2020/05/03
 * desc   :
 * version: 1.0
 */
class SettingActivity:BaseActivity(),ToolbarManager{

    override fun getLayoutId(): Int {
        return R.layout.activity_setting
    }

    override fun initData() {
        initSettingToolbar()
        val sp = PreferenceManager.getDefaultSharedPreferences(this)
        val
                push = sp.getBoolean("push", false)
    }

    override val toolbar by lazy { find<Toolbar>(R.id.toolbar) }



}