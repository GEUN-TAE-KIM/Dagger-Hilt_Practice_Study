package jp.co.archive_asia.dagger_hilt_practice.network

import android.util.Log
import jp.co.archive_asia.dagger_hilt_practice.TAG
import javax.inject.Inject

class MyAppNetworkAdapter @Inject constructor(): NetworkAdapter {
    override fun log(message: String) {
        Log.d(TAG, "MyNetworkAdapter: $message")
    }
}