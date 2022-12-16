package jp.co.archive_asia.dagger_hilt_practice.hlit

import javax.inject.Qualifier

// Dagger2 에서는 "@Named("Identifier") Annotation을 썻던 거랑 비슷 한거"
// 같은 타입에 객체를 구별하게 해주는 것
@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class CallInterceptor

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class ResponseInterceptor