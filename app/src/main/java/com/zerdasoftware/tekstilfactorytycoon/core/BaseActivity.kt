package com.zerdasoftware.tekstilfactorytycoon.core

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {

    private var _binding: VB? = null

    abstract val bindingInflater: (LayoutInflater) -> VB

    protected val binding get() = _binding!!

    abstract fun initUi()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = bindingInflater(layoutInflater)
        setContentView(binding.root)
        initUi()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}