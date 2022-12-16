package jp.co.archive_asia.dagger_hilt_practice.hlit

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ViewComponent
import dagger.hilt.android.scopes.ActivityScoped
import jp.co.archive_asia.dagger_hilt_practice.network.*
import javax.inject.Singleton

//Daager2에는 따로 Component를 지정해서 만들어야 한것을 Hilt에서는 제공을 해주는 것이네
// 그리고 InstallIn중에서 여러가지 각 해당하는 것의 생명주기를 제공하는 것이 공식가면 잘 나와 있음
@Module
@InstallIn(ActivityComponent::class)
//@InstallIn(ActivityComponent::class, ViewComponent::class)
class NetworkModule {

    //interface 타입의 객체를 어떻게 만드는지 Hilt에게 알려주기 위한 용도
    /*@Binds
    abstract fun bindNetworkAdapterImpl(networkAdapterImpl: MyAppNetworkAdapter): NetworkAdapter*/

    // Binds는 안되지만 Provides는 외부에서 모듈을 주입 받는 것이 가능
    // Room DB, Retrofit, Gson, Application Context 등이 가능
    // 인자에 application을 넣어주면 Hilt가 알아서 넣어준다고 함
    /*@Provides
    fun provideNetworkService(): NetworkService {
        return NetworkService.Builder()
            .host("google.com")
            .protocol("HTTPS")
            .build()
    }*/

    // Dagger2에서는 커스텀을 쓰면서 프래그먼트, 뷰모델등을 쓰면서 했는데
    // Hilt에는 각각에 맞는 Scope를 제공해주고 있음
    // 자세한건 공식 안드로이드에 나와 있음
    @ActivityScoped
    @CallInterceptor
    @Provides
    fun provideCallNetworkService(): NetworkService {
        return NetworkService.Builder()
            .host("google.com")
            .protocol("HTTPS")
            .interceptor(CallInterceptorImpl())
            .build()
    }

    @ActivityScoped
    @ResponseInterceptor
    @Provides
    fun provideResponseNetworkService(): NetworkService {
        return NetworkService.Builder()
            .host("google.com")
            .protocol("HTTPS")
            .interceptor(ResponseInterceptorImpl())
            .build()
    }


}