package com.league.leaguestats.ui.settings

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.league.leaguestats.R

class SettingsFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.settings, rootKey)
    }
}