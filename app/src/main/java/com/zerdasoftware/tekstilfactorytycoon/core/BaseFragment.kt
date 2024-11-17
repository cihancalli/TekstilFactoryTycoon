package com.zerdasoftware.tekstilfactorytycoon.core

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.zerdasoftware.tekstilfactorytycoon.common.Inflate


abstract class BaseFragment<VB : ViewBinding>(private val inflate: Inflate<VB>) : Fragment() {

    private var _binding: VB? = null

    protected val binding get() = _binding!!

    abstract fun initUi()

    open fun initReceivers() {}

    open fun initOnCreate(savedInstanceState: Bundle?){
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initOnCreate(savedInstanceState)
    }

    open fun initOnCreateView(savedInstanceState: Bundle?) {}

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?,): View? {
        _binding = inflate.invoke(inflater, container, false)
        initOnCreateView(savedInstanceState)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUi()
        initReceivers()
    }

      override fun onDestroyView() {
          super.onDestroyView()
          _binding = null
      }
}