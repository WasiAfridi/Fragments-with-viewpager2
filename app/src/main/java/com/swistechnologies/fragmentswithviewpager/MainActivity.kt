package com.swistechnologies.fragmentswithviewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.swistechnologies.fragmentswithviewpager.databinding.ActivityMainBinding
import com.swistechnologies.fragmentswithviewpager.fragments.Fragement1
import com.swistechnologies.fragmentswithviewpager.fragments.Fragment2
import com.swistechnologies.fragmentswithviewpager.fragments.Fragment3

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragments: ArrayList<Fragment> = arrayListOf( Fragement1(), Fragment2(), Fragment3() )

        val adapterr = ViewPagerAdapter(fragments, this)
        binding.viewPager.adapter = adapterr

    }

    override fun onBackPressed() {
        if(binding.viewPager.currentItem == 0){
            super.onBackPressed()
        }else{
            binding.viewPager.currentItem = binding.viewPager.currentItem - 1
        }

    }
}