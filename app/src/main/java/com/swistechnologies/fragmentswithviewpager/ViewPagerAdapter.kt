package com.swistechnologies.fragmentswithviewpager

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(val fragments: ArrayList<Fragment>, mainActivity: AppCompatActivity): FragmentStateAdapter(mainActivity) {
    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

}
