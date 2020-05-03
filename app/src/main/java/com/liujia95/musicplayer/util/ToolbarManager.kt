package com.liujia95.musicplayer.util

import androidx.appcompat.widget.Toolbar
import com.liujia95.musicplayer.R

/**
 * author : liujia
 * time   : 2020/05/03
 * desc   : 所有界面toolbar的管理类
 * version: 1.0
 */
interface ToolbarManager {

    val toolbar:Toolbar

    fun initMainToolbar(){
        toolbar.setTitle(R.string.app_name)
    }

    fun initSettingToolbar(){
        toolbar.setTitle("设置")
    }
}