package com.liujia95.musicplayer.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import com.liujia95.musicplayer.R
import com.liujia95.musicplayer.base.BaseActivity
import com.liujia95.musicplayer.util.ToolbarManager
import org.jetbrains.anko.find

class MainActivity : BaseActivity(),ToolbarManager {

    override val toolbar by lazy { find<Toolbar>(R.id.toolbar) }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initData() {
        initMainToolbar()
        toolbar.inflateMenu(R.menu.main)
        toolbar.setOnMenuItemClickListener {
            when(it.itemId){
                R.id.setting->
            }
        }
    }
}
