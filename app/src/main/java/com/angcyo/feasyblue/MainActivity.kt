package com.angcyo.feasyblue

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.feasycom.ble.controler.FscBleCentralApi
import com.feasycom.ble.controler.FscBleCentralApiImp
import com.feasycom.spp.controler.FscSppCentralApi
import com.feasycom.spp.controler.FscSppCentralApiImp

class MainActivity : AppCompatActivity() {

    private val sFscSppCentralApi: FscSppCentralApi by lazy {
        FscSppCentralApiImp.getInstance(this)
    }

    private val mFscBleCentralApi: FscBleCentralApi by lazy {
        FscBleCentralApiImp.getInstance(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun initialize() {
        mFscBleCentralApi.initialize()
        sFscSppCentralApi.initialize()
    }

    fun startScan() {
        sFscSppCentralApi.startScan()
        mFscBleCentralApi.startScan()
    }

    fun stopScan() {
        sFscSppCentralApi.stopScan()
        mFscBleCentralApi.stopScan()
    }
}