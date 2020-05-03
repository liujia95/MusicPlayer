package com.liujia95.musicplayer.ui.activity

import android.content.Intent
import androidx.appcompat.widget.Toolbar
import com.liujia95.musicplayer.R
import com.liujia95.musicplayer.base.BaseActivity
import com.liujia95.musicplayer.util.FragmentUtil
import com.liujia95.musicplayer.util.ToolbarManager
import kotlinx.android.synthetic.main.activity_main.*
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
                R.id.setting->{
                    toolbar.context.startActivity(Intent(toolbar.context,SettingActivity::class.java))
                }
            }
            true
        }
    }

    override fun initListener() {
        bottomBar.setOnTabSelectListener{tabId ->
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.container,
                FragmentUtil.fragmentUtil.getFragment(tabId),
                tabId.toString())
            transaction.commit()
        }
    }
}
