package com.liujia95.musicplayer.ui.activity

import android.os.Build
import android.view.View
import android.view.WindowManager
import androidx.core.view.ViewCompat
import androidx.core.view.ViewPropertyAnimatorListener
import com.liujia95.musicplayer.R
import com.liujia95.musicplayer.base.BaseActivity
import kotlinx.android.synthetic.main.activity_splash.*
import org.jetbrains.anko.startActivity

/**
 * author : liujia
 * time   : 2020/05/03
 * desc   :
 * version: 1.0
 */
class SplashActivity:BaseActivity(), ViewPropertyAnimatorListener {

    override fun getLayoutId(): Int {
        return R.layout.activity_splash
    }

    override fun initData() {
        ViewCompat.animate(imageView)
            .scaleX(1.0f)
            .scaleY(1.0f)
            .setDuration(2000)
            .setListener(this)
            .start()
    }

    override fun onAnimationEnd(view: View?) {
        startActivityAndFinish<MainActivity>()
    }

    override fun onAnimationCancel(view: View?) {
    }

    override fun onAnimationStart(view: View?) {
    }
}