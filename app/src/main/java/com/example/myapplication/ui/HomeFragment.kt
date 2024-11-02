package com.example.myapplication.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.adapter.StatesAdapter
import com.example.myapplication.databinding.FragmentHomeBinding
import com.example.myapplication.model.Response
import com.example.myapplication.model.StateDetails
import com.example.myapplication.util.onTextChanged
import dagger.hilt.android.AndroidEntryPoint
import com.example.myapplication.viewmodel.StatesVM
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


@AndroidEntryPoint
class HomeFragment : Fragment() {
    private val TAG = "HomeFragment"
    private lateinit var searchAdapter: StatesAdapter
    private val viewModel: StatesVM by activityViewModels()
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding?.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply {
            edtSearch.onTextChanged {
                filter(it.trim())
            }

            btnOpendetails.setOnClickListener {
                viewModel.getSATScore().value?.state?.let {
                    if (it.isNotEmpty()) {
                        findNavController().navigate(R.id.action_homeFragment_to_detailFragment)
                    }
                }
            }
            lifecycleScope.launch {
                viewModel.getStatesListLv.collect {
                    when (it) {
                        is Response.Loading -> {
                            progressCircularList.visibility = View.VISIBLE
                        }
                        is Response.Error -> {
                            progressCircularList.visibility = View.GONE
                            Toast.makeText(context, it.exception.message, Toast.LENGTH_SHORT).show()
                        }
                        is Response.Success -> it.data.let {
                            progressCircularList.visibility = View.GONE
                            lvState.adapter = StatesAdapter(ArrayList(it), false) { stateDetails ->
                                searchAdapter.state_selected = stateDetails
                                detailLoader(stateDetails)
                            }
                            searchAdapter = StatesAdapter(ArrayList(it), true) { stateDetails ->
                                detailLoader(stateDetails)
                            }
                            lvStatefilter.adapter = searchAdapter
                        }
                    }

                }
            }
        }
        viewModel.fetchAllStatesList()


    }

    private fun FragmentHomeBinding.detailLoader(stateDetails: StateDetails) {
        progressCircularDetail.visibility = View.VISIBLE
        viewModel.updateStates(stateDetails)
        progressCircularDetail.postDelayed(Runnable {
            progressCircularDetail.visibility = View.GONE
        }, 500)
    }

    private fun filter(keyword: String) {
        lifecycleScope.launch(Dispatchers.IO) {
            viewModel.getStatesListLv.value.let { state ->
                when (state) {
                    is Response.Error -> {
                    }
                    Response.Loading -> {
                    }
                    is Response.Success -> state.data.let { stateList ->
                        val filteredList = stateList.filter { state ->
                            state.state?.contains(keyword, ignoreCase = true) ?: false
                        }
                        withContext(Dispatchers.Main) {
                            searchAdapter.updateList(filteredList)
                        }
                    }
                }


            }

        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}