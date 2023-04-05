package com.exam.ktxiecheng.cort

import android.util.Log
import java.io.InputStream

class LoginResponseParser {
    fun parse(inputStream: InputStream?): LoginResponse {
        var sb = StringBuilder()
        var buf = ByteArray(1024)
        var len = 0

        while (inputStream?.read(buf).also { len = it!! } != -1) {
//        while (inputStream?.read(buf).apply { len = this!! } != -1) {
//            println("len:$len")
            sb.append(String(buf, 0, len))
        }
        val loginResponse = LoginResponse()
        val toString = sb.toString()
        Log.d("xxx-r", toString)
//        {"data":null,"errorCode":-1,"errorMsg":"账号密码不匹配！"}
//        {"data":null,"errorCode":-1,"errorMsg":"账号密码不匹配！"}
        loginResponse.result = toString
        return loginResponse
    }
}
