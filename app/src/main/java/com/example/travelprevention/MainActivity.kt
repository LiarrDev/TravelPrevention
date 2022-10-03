package com.example.travelprevention

import android.os.Bundle
import com.alibaba.android.arouter.launcher.ARouter
import com.example.appbase.config.ArouterConfig
import com.example.appbase.ui.BaseActivity
import com.example.travelprevention.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initClick()
    }

    private fun initClick() {
        // 查询核酸检测机构
        mViewBinding.llAgency.setOnClickListener {
            ARouter.getInstance().build(ArouterConfig.AGENCY_MESSAGE).navigation()
        }
        // 查询风险等级地区
        mViewBinding.llRiskLevel.setOnClickListener {
            ARouter.getInstance().build(ArouterConfig.RISK_LEVEL).navigation()
        }
        // 查询出行政策
        mViewBinding.llTravel.setOnClickListener {
            ARouter.getInstance().build(ArouterConfig.TRAVEL_POLICY).navigation()
        }
    }

    override fun getViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }
}