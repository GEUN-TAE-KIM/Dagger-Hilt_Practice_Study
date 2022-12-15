package jp.co.archive_asia.dagger_hilt_practice.database

import android.util.Log
import jp.co.archive_asia.dagger_hilt_practice.TAG
import javax.inject.Inject

class DatabaseService @Inject constructor() {
    fun log(message: String) {
        Log.d(TAG, "Database Service message: $message")
    }
}