package com.mylab.listadapterlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.mylab.listadapterlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    lateinit var contactAdapter : ContactAdapter




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        contactAdapter = ContactAdapter()
        binding.adapter = contactAdapter

        initContactList()


    }

    private fun initContactList() {

        val contactList = listOf(
            Contact(1,"alex", "09123698521"),
            Contact(2,"george","09132589874" ),
            Contact(3,"robert", "09136987412"),
            Contact(4,"john", "09183698521"),
            Contact(5,"helen", "09119874563"),
            Contact(1,"alex", "09123698521"),
            Contact(2,"george","09132589874" ),
            Contact(3,"robert", "09136987412"),
            Contact(4,"john", "09183698521"),
            Contact(5,"helen", "09119874563"),
            Contact(1,"alex", "09123698521"),
            Contact(2,"george","09132589874" ),
            Contact(3,"robert", "09136987412"),
            Contact(4,"john", "09183698521"),
            Contact(5,"helen", "09119874563")
        )
        contactAdapter.submitList(contactList)

    }
}