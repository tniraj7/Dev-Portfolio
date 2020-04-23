package com.example.developerportfolio

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.developerportfolio.controller.DevPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager.adapter = DevPagerAdapter(supportFragmentManager)
        tabLayoutId.setupWithViewPager(viewPager)
        tabLayoutId.setTabTextColors(Color.DKGRAY, Color.parseColor("white"))
    }

}
