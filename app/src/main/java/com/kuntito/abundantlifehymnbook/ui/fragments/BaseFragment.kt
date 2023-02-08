package com.kuntito.abundantlifehymnbook.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.fragment.app.activityViewModels
import com.kuntito.abundantlifehymnbook.databinding.FragmentBaseBinding
import com.kuntito.abundantlifehymnbook.data.models.viewmodel.HymnBookViewModel


abstract class BaseFragment : Fragment() {
    val hymnBookViewModel: HymnBookViewModel by activityViewModels()
    private var _binding: FragmentBaseBinding? = null
    val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBaseBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.composeView.setViewCompositionStrategy(
            ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}