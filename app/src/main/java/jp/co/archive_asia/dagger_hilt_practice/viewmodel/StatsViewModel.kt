package jp.co.archive_asia.dagger_hilt_practice.viewmodel

import android.os.Looper
import android.view.View
import androidx.core.os.postDelayed
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import java.util.logging.Handler
import javax.inject.Inject

/*  1.3인가 1,2 알파 부터 인젝션이 아니라 이렇게 해야함 인젝션 삭제됨 뷰모델은
    HiltViewModel을 쓰면 기존에 ViewModel의 repository사용 하기 때문에 팩토리를 만들어야 하는데
    파라미터를 받아 종속성이 있어야 해서 하지만 HiltViewModel를 쓰면 팩토리를 만들어줌
    룸을 안쓰기 때문에 지워버렸지만 전에 만든 팩토리를 HiltViewModel로 대신 할 수 있었겠군
*/

//TODO 나중에 한번 실험 해보기 근데 맞는거 같음
@HiltViewModel
class StatsViewModel @Inject constructor() : ViewModel() {

    val statusLiveData = MutableLiveData<Int>()
    private var i = 0
    private var runnable: Runnable? = null

    fun startStatsCollection() {
        val h = android.os.Handler(Looper.getMainLooper())
        runnable = Runnable {
            statusLiveData.value = ++i
            h.postDelayed(runnable!!, 500)
        }
        h.postDelayed(runnable!!, 500)
    }
}