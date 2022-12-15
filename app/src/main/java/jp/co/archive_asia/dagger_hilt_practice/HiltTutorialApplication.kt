package jp.co.archive_asia.dagger_hilt_practice

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

const val TAG = "HiltTutorialLogTag"

// 생명 주기를 따르며 컴파일 단계시 DI에 필요한 구성 요소들을 초기화 하기 위해 하는 것
// 매니페스트에 이름을 지정 해야 함
@HiltAndroidApp
class HiltTutorialApplication:Application() {
}