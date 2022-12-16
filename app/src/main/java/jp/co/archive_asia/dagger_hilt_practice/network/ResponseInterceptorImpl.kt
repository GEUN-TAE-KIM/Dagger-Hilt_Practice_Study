package jp.co.archive_asia.dagger_hilt_practice.network

import android.util.Log
import jp.co.archive_asia.dagger_hilt_practice.TAG
import javax.inject.Inject

class ResponseInterceptorImpl @Inject constructor(): Interceptor {
    override fun log(message: String) {
        Log.d(TAG, "This is a response interceptor: $message")
    }


}