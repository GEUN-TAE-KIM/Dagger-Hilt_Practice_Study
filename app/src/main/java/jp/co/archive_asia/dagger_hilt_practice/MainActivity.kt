package jp.co.archive_asia.dagger_hilt_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.hilt.android.AndroidEntryPoint
import jp.co.archive_asia.dagger_hilt_practice.database.DatabaseAdapter
import jp.co.archive_asia.dagger_hilt_practice.database.DatabaseService
import javax.inject.Inject

// 자동으로 생명주기에 따라 적절한 시점에 Hilt 요소로 인스턴스 화 처리가 됨
// 의존성 주입의 시작점
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    //TODO : Dagger2랑 똑같이 주입에서 대부분 쓰이는 주입은 생성자 주입이랑 필드 주입을 많이 쓰임

    // Field Injection
    // 해당 클래스에 생성하지 않아도 객체를 주입 받아 사용이 가능 한 것
    @Inject lateinit var databaseAdapter: DatabaseAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "DatabaseAdapter : $databaseAdapter")
        databaseAdapter.log("Hello Hilt")
    }

    // Method Injection
    // 파라미터에 주입해서 쓰는 것
    @Inject
    fun directToDatabase(databaseService: DatabaseService) {
        databaseService.log("Method Injection")
    }
}