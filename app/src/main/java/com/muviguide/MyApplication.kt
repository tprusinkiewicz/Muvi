package com.muviguide

import android.app.Application
import com.muviguide.api.ApiService
import com.muviguide.api.RetrofitHelper
import com.muviguide.api.TmdbRepo

class MyApplication : Application() {

    lateinit var tmdbRepo : TmdbRepo

    override fun onCreate() {
        super.onCreate()

        init()
    }

    private fun init(){
        val service = RetrofitHelper.getInstance().create(ApiService::class.java)
        tmdbRepo = TmdbRepo(service)
    }
}