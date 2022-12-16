package jp.co.archive_asia.dagger_hilt_practice.hlit

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

//Daager2에는 따로 Component를 지정해서 만들어야 한것을 Hilt에서는 제공을 해주는 것이네
// 그리고 InstallIn중에서 여러가지 각 해당하는 것의 생명주기를 제공하는 것이 공식가면 잘 나와 있음
@Module
@InstallIn(ActivityComponent::class)
abstract class NetworkModule {
}