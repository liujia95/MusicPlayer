package com.liujia95.musicplayer.ui.fragment

import android.os.Bundle
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import com.liujia95.musicplayer.R
import com.liujia95.musicplayer.ui.activity.AboutActivity
import org.jetbrains.anko.support.v4.startActivity


/**
 * author : liujia
 * time   : 2020/05/03
 * desc   :
 * version: 1.0
 */
class SettingFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        addPreferencesFromResource(R.xml.setting)
    }

    override fun onPreferenceTreeClick(preference: Preference?): Boolean {
        val key = preference?.key
        when(key){
            "about"->{
                startActivity<AboutActivity>()
            }
        }
        return super.onPreferenceTreeClick(preference)
    }
}