package com.exam.ktxiecheng.cort

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class LoginViewModel(private val loginRepository: LoginRepository) : ViewModel() {
    var data = MutableLiveData<Result<LoginResponse>>()
    fun login(userName: String, token: String) {
        viewModelScope.launch {
            val jsonBody = "{username:\"$userName\", password:\"$token\""
            data.value = loginRepository.makeLoginRequest(jsonBody)
        }
    }
    //v1
//    fun login(userName: String, token: String) {
//        viewModelScope.launch(Dispatchers.IO) {
//            val jsonBody = "{username:\"$userName\", password:\"$token\""
//            loginRepository.makeLoginRequest(jsonBody)
//        }
//    }
}
/*
2023-03-29 20:13:06.203 14817-14927/com.exam.ktxiecheng E/AndroidRuntime: FATAL EXCEPTION: DefaultDispatcher-worker-2
Process: com.exam.ktxiecheng, PID: 14817
java.lang.SecurityException: Permission denied (missing INTERNET permission?)
at java.net.Inet6AddressImpl.lookupHostByName(Inet6AddressImpl.java:150)
at java.net.Inet6AddressImpl.lookupAllHostAddr(Inet6AddressImpl.java:103)
at java.net.InetAddress.getAllByName(InetAddress.java:1152)
at com.android.okhttp.Dns$1.lookup(Dns.java:41)
at com.android.okhttp.internal.http.RouteSelector.resetNextInetSocketAddress(RouteSelector.java:178)
at com.android.okhttp.internal.http.RouteSelector.nextProxy(RouteSelector.java:144)
at com.android.okhttp.internal.http.RouteSelector.next(RouteSelector.java:86)
at com.android.okhttp.internal.http.StreamAllocation.findConnection(StreamAllocation.java:176)
at com.android.okhttp.internal.http.StreamAllocation.findHealthyConnection(StreamAllocation.java:128)
at com.android.okhttp.internal.http.StreamAllocation.newStream(StreamAllocation.java:97)
at com.android.okhttp.internal.http.HttpEngine.connect(HttpEngine.java:289)
at com.android.okhttp.internal.http.HttpEngine.sendRequest(HttpEngine.java:232)
at com.android.okhttp.internal.huc.HttpURLConnectionImpl.execute(HttpURLConnectionImpl.java:465)
at com.android.okhttp.internal.huc.HttpURLConnectionImpl.connect(HttpURLConnectionImpl.java:131)
at com.android.okhttp.internal.huc.HttpURLConnectionImpl.getOutputStream(HttpURLConnectionImpl.java:262)
at com.android.okhttp.internal.huc.DelegatingHttpsURLConnection.getOutputStream(DelegatingHttpsURLConnection.java:219)
at com.android.okhttp.internal.huc.HttpsURLConnectionImpl.getOutputStream(HttpsURLConnectionImpl.java:30)
at com.exam.ktxiecheng.cort.LoginRepository.makeLoginRequest(LoginRepository.kt:17)
at com.exam.ktxiecheng.cort.LoginViewModel$login$1.invokeSuspend(LoginViewModel.kt:13)
at kotlin.coroutines.jvm.internal.BaseContinuationImpl.resumeWith(ContinuationImpl.kt:33)
at kotlinx.coroutines.DispatchedTask.run(DispatchedTask.kt:106)
at kotlinx.coroutines.scheduling.CoroutineScheduler.runSafely(CoroutineScheduler.kt:571)
at kotlinx.coroutines.scheduling.CoroutineScheduler$Worker.executeTask(CoroutineScheduler.kt:738)
at kotlinx.coroutines.scheduling.CoroutineScheduler$Worker.runWorker(CoroutineScheduler.kt:678)
at kotlinx.coroutines.scheduling.CoroutineScheduler$Worker.run(CoroutineScheduler.kt:665)
Caused by: android.system.GaiException: android_getaddrinfo failed: EAI_NODATA (No address associated with hostname)
at libcore.io.Linux.android_getaddrinfo(Native Method)
at libcore.io.ForwardingOs.android_getaddrinfo(ForwardingOs.java:74)
at libcore.io.BlockGuardOs.android_getaddrinfo(BlockGuardOs.java:200)
at libcore.io.ForwardingOs.android_getaddrinfo(ForwardingOs.java:74)
at java.net.Inet6AddressImpl.lookupHostByName(Inet6AddressImpl.java:135)
at java.net.Inet6AddressImpl.lookupAllHostAddr(Inet6AddressImpl.java:103) 
at java.net.InetAddress.getAllByName(InetAddress.java:1152) 
at com.android.okhttp.Dns$1.lookup(Dns.java:41) 
at com.android.okhttp.internal.http.RouteSelector.resetNextInetSocketAddress(RouteSelector.java:178) 
at com.android.okhttp.internal.http.RouteSelector.nextProxy(RouteSelector.java:144) 
at com.android.okhttp.internal.http.RouteSelector.next(RouteSelector.java:86) 
at com.android.okhttp.internal.http.StreamAllocation.findConnection(StreamAllocation.java:176) 
at com.android.okhttp.internal.http.StreamAllocation.findHealthyConnection(StreamAllocation.java:128) 
at com.android.okhttp.internal.http.StreamAllocation.newStream(StreamAllocation.java:97) 
at com.android.okhttp.internal.http.HttpEngine.connect(HttpEngine.java:289) 
at com.android.okhttp.internal.http.HttpEngine.sendRequest(HttpEngine.java:232) 
at com.android.okhttp.internal.huc.HttpURLConnectionImpl.execute(HttpURLConnectionImpl.java:465) 
at com.android.okhttp.internal.huc.HttpURLConnectionImpl.connect(HttpURLConnectionImpl.java:131) 
at com.android.okhttp.internal.huc.HttpURLConnectionImpl.getOutputStream(HttpURLConnectionImpl.java:262) 
at com.android.okhttp.internal.huc.DelegatingHttpsURLConnection.getOutputStream(DelegatingHttpsURLConnection.java:219) 
at com.android.okhttp.internal.huc.HttpsURLConnectionImpl.getOutputStream(HttpsURLConnectionImpl.java:30) 
at com.exam.ktxiecheng.cort.LoginRepository.makeLoginRequest(LoginRepository.kt:17) 
at com.exam.ktxiecheng.cort.LoginViewModel$login$1.invokeSuspend(LoginViewModel.kt:13) 
at kotlin.coroutines.jvm.internal.BaseContinuationImpl.resumeWith(ContinuationImpl.kt:33) 
at kotlinx.coroutines.DispatchedTask.run(DispatchedTask.kt:106) 
at kotlinx.coroutines.scheduling.CoroutineScheduler.runSafely(CoroutineScheduler.kt:571) 
at kotlinx.coroutines.scheduling.CoroutineScheduler$Worker.executeTask(CoroutineScheduler.kt:738) 
at kotlinx.coroutines.scheduling.CoroutineScheduler$Worker.runWorker(CoroutineScheduler.kt:678) 
at kotlinx.coroutines.scheduling.CoroutineScheduler$Worker.run(CoroutineScheduler.kt:665) 
Caused by: android.system.ErrnoException: android_getaddrinfo failed: EACCES (Permission denied)
at libcore.io.Linux.android_getaddrinfo(Native Method) 
at libcore.io.ForwardingOs.android_getaddrinfo(ForwardingOs.java:74) 
at libcore.io.BlockGuardOs.android_getaddrinfo(BlockGuardOs.java:200) 
at libcore.io.ForwardingOs.android_getaddrinfo(ForwardingOs.java:74) 
at java.net.Inet6AddressImpl.lookupHostByName(Inet6AddressImpl.java:135) 
at java.net.Inet6AddressImpl.lookupAllHostAddr(Inet6AddressImpl.java:103) 
at java.net.InetAddress.getAllByName(InetAddress.java:1152) 
at com.android.okhttp.Dns$1.lookup(Dns.java:41) 
at com.android.okhttp.internal.http.RouteSelector.resetNextInetSocketAddress(RouteSelector.java:178) 
at com.android.okhttp.internal.http.RouteSelector.nextProxy(RouteSelector.java:144) 
at com.android.okhttp.internal.http.RouteSelector.next(RouteSelector.java:86) 
at com.android.okhttp.internal.http.StreamAllocation.findConnection(StreamAllocation.java:176) 
at com.android.okhttp.internal.http.StreamAllocation.findHealthyConnection(StreamAllocation.java:128) 
at com.android.okhttp.internal.http.StreamAllocation.newStream(StreamAllocation.java:97) 
at com.android.okhttp.internal.http.HttpEngine.connect(HttpEngine.java:289) 
at com.android.okhttp.internal.http.HttpEngine.sendRequest(HttpEngine.java:232) 
at com.android.okhttp.internal.huc.HttpURLConnectionImpl.execute(HttpURLConnectionImpl.java:465) 
at com.android.okhttp.internal.huc.HttpURLConnectionImpl.connect(HttpURLConnectionImpl.java:131) 
at com.android.okhttp.internal.huc.HttpURLConnectionImpl.getOutputStream(HttpURLConnectionImpl.java:262) 
at com.android.okhttp.internal.huc.DelegatingHttpsURLConnection.getOutputStream(DelegatingHttpsURLConnection.java:219) 
at com.android.okhttp.internal.huc.HttpsURLConnectionImpl.getOutputStream(HttpsURLConnectionImpl.java:30) 
at com.exam.ktxiecheng.cort.LoginRepository.makeLoginRequest(LoginRepository.kt:17) 
at com.exam.ktxiecheng.cort.LoginViewModel$login$1.invokeSuspend(LoginViewModel.kt:13) 
at kotlin.coroutines.jvm.internal.BaseContinuationImpl.resumeWith(ContinuationImpl.kt:33) 
at kotlinx.coroutines.DispatchedTask.run(DispatchedTask.kt:106) 
at kotlinx.coroutines.scheduling.CoroutineScheduler.runSafely(CoroutineScheduler.kt:571) 
at kotlinx.coroutines.scheduling.CoroutineScheduler$Worker.executeTask(CoroutineScheduler.kt:738) 
at kotlinx.coroutines.scheduling.CoroutineScheduler$Worker.runWorker(CoroutineScheduler.kt:678) 
at kotlinx.coroutines.scheduling.CoroutineScheduler$Worker.run(CoroutineScheduler.kt:665) 
*/