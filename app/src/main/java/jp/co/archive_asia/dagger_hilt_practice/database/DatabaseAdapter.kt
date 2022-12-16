package jp.co.archive_asia.dagger_hilt_practice.database

import android.content.Context
import android.util.Log
import dagger.hilt.android.qualifiers.ActivityContext
import jp.co.archive_asia.dagger_hilt_practice.TAG
import javax.inject.Inject

// 생성자에 의존성 인스턴스를 생성하고 파라미터로 의존성을 주입 받을 수가 있음
class DatabaseAdapter @Inject constructor(
    // provide를 이용하여 (interface)를 생성하는 방법을 Hilt에게 알려 줄려고 할때 사용
    @ActivityContext private val context: Context,
    var databaseService: DatabaseService
) {
    fun log(message: String) {
        Log.d(TAG, "DatabaseAdapter:, $message")
        databaseService.log(message)
        Log.d(TAG, "Context available:, $context")
    }
}