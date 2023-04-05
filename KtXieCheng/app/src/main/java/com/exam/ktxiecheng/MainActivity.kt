package com.exam.ktxiecheng

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Observer
import com.exam.ktxiecheng.cort.*
import com.exam.ktxiecheng.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        loginViewModel = LoginViewModel(LoginRepository(LoginResponseParser()))
        binding.btn.setOnClickListener {
            Log.d("xxx", "click login")
            Toast.makeText(applicationContext, "ok", Toast.LENGTH_LONG).show()
            loginViewModel.login("lisi", "gogogo")
        }
        //observer参数相当于一个只有一个方法的接口，类似创建了一个实现了Observer接口的匿名类，
        //在回调方法里面将参数的值进行相应的赋值。
        //这里用livedata观察其实没有必要了，因为已经是跑在主线程里面的协程上下文中了，只是想练习一下livedata的使用
        loginViewModel.data.observe(this@MainActivity, Observer {
            when (it) {
                is Result.Error -> binding.tvResult.text = it.e.message
                is Result.Success -> binding.tvResult.text = it.data.result
                else -> binding.tvResult.text = "omething is wrong, bla bla bla"
            }
        })
    }
}
/*
2023-03-29 20:07:25.207 13603-13603/com.exam.ktxiecheng E/AndroidRuntime: FATAL EXCEPTION: main
Process: com.exam.ktxiecheng, PID: 13603
android.os.NetworkOnMainThreadException
at android.os.StrictMode$AndroidBlockGuardPolicy.onNetwork(StrictMode.java:1565)
at java.net.Inet6AddressImpl.lookupHostByName(Inet6AddressImpl.java:115)
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
at com.exam.ktxiecheng.cort.LoginViewModel.login(LoginViewModel.kt:10)
at com.exam.ktxiecheng.MainActivity.onCreate$lambda-0(MainActivity.kt:28)
at com.exam.ktxiecheng.MainActivity.lambda$bJDM-FnWn_-NtNSIreGlEW1hCLg(Unknown Source:0)
at com.exam.ktxiecheng.-$$Lambda$MainActivity$bJDM-FnWn_-NtNSIreGlEW1hCLg.onClick(Unknown Source:2)
at android.view.View.performClick(View.java:7217)
at com.google.android.material.button.MaterialButton.performClick(MaterialButton.java:992)
at android.view.View.performClickInternal(View.java:7191)
at android.view.View.access$3500(View.java:828)
at android.view.View$PerformClick.run(View.java:27679)
at android.os.Handler.handleCallback(Handler.java:900)
at android.os.Handler.dispatchMessage(Handler.java:103)
at android.os.Looper.loop(Looper.java:219)
at android.app.ActivityThread.main(ActivityThread.java:8349)
at java.lang.reflect.Method.invoke(Native Method)
at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:513)
at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:1055)
*/