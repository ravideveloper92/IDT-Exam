package com.example.myapplication.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.appcompat.app.ActionBar.LayoutParams
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import com.example.myapplication.databinding.FragmentDetailBinding
import com.example.myapplication.databinding.RowDetailsBinding
import com.example.myapplication.viewmodel.StatesVM
import kotlinx.coroutines.launch


class DetailFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private val viewModel: StatesVM by activityViewModels()
    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lifecycleScope.launch {
            viewModel.getSATScore().collect {
                it?.let { details ->
                    binding?.llContainer?.removeAllViews()
                    val flparams = FrameLayout.LayoutParams(
                        LayoutParams.MATCH_PARENT,
                        LayoutParams.MATCH_PARENT
                    )
                    binding?.llContainer?.setLayoutParams(flparams);
                    binding?.llContainer?.setPadding(10, 10, 10, 10)

                    details.getStateDetailsP().forEach { stateDetails ->
                        context?.let { ctx ->
                            binding?.llContainer?.apply {
                                StateDetailAdapter(ctx).addStateDetail(this, stateDetails)
                            }
                        }
                    }
                }
            }
        }
    }

    inner class StateDetailAdapter(private val context: Context) {
        fun addStateDetail(container: ViewGroup, stateDetail: Pair<String, String>) {
            val (title,value) = stateDetail
            val binding = RowDetailsBinding.inflate(LayoutInflater.from(context))
            binding.txtTitle.text = title
            binding.txtValue.text = value
            container.addView(binding.root)
        }
    }

    // Usage


}