package com.example.myapplication.adapter

import android.graphics.Typeface
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat

import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.StateDetails
import com.example.myapplication.model.isSelected

class StatesAdapter(var stateDetails: ArrayList<StateDetails>,val highlightState: Boolean,val callBackfunction: (StateDetails) -> Unit) : RecyclerView.Adapter<StatesAdapter.VH>() {
    private  val TAG = "StatesAdapter"
    var state_selected:StateDetails?=null
        set(value) {
            field=value
            notifyDataSetChanged()
        }

    class VH(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_states, parent, false)
        return VH(view)
    }

    override fun getItemCount(): Int {
        return stateDetails.size
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val item = stateDetails[position]
        (holder.itemView as TextView).text = item.state
        if (highlightState) {
            state_selected?.let {
                if (item.isSelected(it)) {
                    (holder.itemView as TextView).setTextColor(ContextCompat.getColor(holder.itemView.context,
                        R.color.purple_700
                    ))
                    (holder.itemView as TextView).setTypeface(null, Typeface.BOLD)
                } else {
                    (holder.itemView as TextView).setTextColor(ContextCompat.getColor(holder.itemView.context,
                        R.color.black
                    ))
                    (holder.itemView as TextView).setTypeface(null, Typeface.NORMAL)
                }
            }
        }

        (holder.itemView).setOnClickListener {
            state_selected=item
            callBackfunction.invoke(item)
            notifyDataSetChanged()
        }
    }

    fun updateList(filter: List<StateDetails>) {
        Log.d(TAG, "updateList new : "+ filter.size)
        Log.d(TAG, "updateList old : "+ stateDetails.size)
        stateDetails.clear()
        stateDetails.addAll(filter)
        notifyDataSetChanged()
    }



}