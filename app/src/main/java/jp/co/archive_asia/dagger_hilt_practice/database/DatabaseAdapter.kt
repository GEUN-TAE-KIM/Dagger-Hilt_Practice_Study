package jp.co.archive_asia.dagger_hilt_practice.database

import android.util.Log
import jp.co.archive_asia.dagger_hilt_practice.TAG
import javax.inject.Inject

// 생성자에 의존성 인스턴스를 생성하고 파라미터로 의존성을 주입 받을 수가 있음
class DatabaseAdapter @Inject constructor(var databaseService: DatabaseService) {
    fun log(message: String)  {
        Log.d(TAG, "DatabaseAdapter, $message")
        databaseService.log(message)
    }
}