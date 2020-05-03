package com.liujia95.musicplayer.base

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.liujia95.musicplayer.ui.activity.MainActivity
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

/**
 * author : liujia
 * time   : 2020/05/03
 * desc   :
 * version: 1.0
 */
abstract class BaseActivity : AppCompatActivity(),AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initListener()
        initData()
    }

    abstract fun getLayoutId(): Int

    open protected fun initData() {
    }

    open protected fun initListener() {
    }

    protected fun showToast(msg:String){
        runOnUiThread{
            toast(msg)
        }
    }

    inline fun <reified T: BaseActivity> startActivityAndFinish(){
        startActivity<T>()
        finish()
    }
}