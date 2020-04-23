package com.example.developerportfolio.controller

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.developerportfolio.view.AboutFragment
import com.example.developerportfolio.view.ContactFragment
import com.example.developerportfolio.view.SkillFragment
import com.example.developerportfolio.view.WorkFragment

class DevPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager){

    override fun getItem(position: Int): Fragment? {

        when(position) {
            0 -> return AboutFragment()
            1 -> return WorkFragment()
            2 -> return SkillFragment()
            3 -> return ContactFragment()
        }

        return null
    }

    override fun getCount(): Int =  4 // since we have 4 fragments for tab layout

    override fun getPageTitle(position: Int): CharSequence? {
        when(position) {
            0 -> return "ABOUT"
            1 -> return "WORK"
            2 -> return "SKILLS"
            3 -> return "CONTACT"
        }
        return null
    }
}