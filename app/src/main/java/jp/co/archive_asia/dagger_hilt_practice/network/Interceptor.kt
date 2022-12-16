package jp.co.archive_asia.dagger_hilt_practice.network

interface Interceptor {
    fun log(message: String)
}