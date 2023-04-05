package com.exam.ktxiecheng.cort

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.net.HttpURLConnection
import java.net.URL

//private const val loginUrl = "https://example.com/login"
private const val loginUrl = "https://www.wanandroid.com/user/login"

class LoginRepository(private val responseParser: LoginResponseParser) {
    suspend fun makeLoginRequest(jsonBody: String): Result<LoginResponse> {
        return withContext(Dispatchers.IO) {
            try {
                val url = URL(loginUrl)
                val httpURLConnection = url.openConnection() as? HttpURLConnection
                if (httpURLConnection != null) {
                    httpURLConnection!!.run {
                        requestMethod = "POST"
                        setRequestProperty("Content-Type", "application/json; utf-8")
                        setRequestProperty("Accept", "application/json")
                        doOutput = true
                        outputStream.write(jsonBody.toByteArray())
                        Result.Success(responseParser.parse(inputStream))
                    }
                } else {
                    Result.Error(Exception("Cannot open HttpURLConnection"))
                }
            } catch (e: Exception) {
                Result.Error(Exception(e.message))
            }

        }
    }

    //v1
//    fun makeLoginRequest(jsonBody: String): Result<LoginResponse> {
//        val url = URL(loginUrl)
//        (url.openConnection() as? HttpURLConnection)?.run {
//            requestMethod = "POST"
//            setRequestProperty("Content-Type", "application/json; utf-8")
//            setRequestProperty("Accept", "application/json")
//            doOutput = true
//            outputStream.write(jsonBody.toByteArray())
//            return Result.Success(responseParser.parse(inputStream))
//        }
//        return Result.Error(Exception("Cannot open HttpURLConnection"))
//    }
}
/*
2023-03-29 20:15:21.269 15288-15429/com.exam.ktxiecheng E/AndroidRuntime: FATAL EXCEPTION: DefaultDispatcher-worker-2
    Process: com.exam.ktxiecheng, PID: 15288
    java.io.FileNotFoundException: https://example.com/login
        at com.android.okhttp.internal.huc.HttpURLConnectionImpl.getInputStream(HttpURLConnectionImpl.java:255)
        at com.android.okhttp.internal.huc.DelegatingHttpsURLConnection.getInputStream(DelegatingHttpsURLConnection.java:211)
        at com.android.okhttp.internal.huc.HttpsURLConnectionImpl.getInputStream(HttpsURLConnectionImpl.java:30)
        at com.exam.ktxiecheng.cort.LoginRepository.makeLoginRequest(LoginRepository.kt:18)
        at com.exam.ktxiecheng.cort.LoginViewModel$login$1.invokeSuspend(LoginViewModel.kt:13)
        at kotlin.coroutines.jvm.internal.BaseContinuationImpl.resumeWith(ContinuationImpl.kt:33)
        at kotlinx.coroutines.DispatchedTask.run(DispatchedTask.kt:106)
        at kotlinx.coroutines.scheduling.CoroutineScheduler.runSafely(CoroutineScheduler.kt:571)
        at kotlinx.coroutines.scheduling.CoroutineScheduler$Worker.executeTask(CoroutineScheduler.kt:738)
        at kotlinx.coroutines.scheduling.CoroutineScheduler$Worker.runWorker(CoroutineScheduler.kt:678)
        at kotlinx.coroutines.scheduling.CoroutineScheduler$Worker.run(CoroutineScheduler.kt:665)
 */