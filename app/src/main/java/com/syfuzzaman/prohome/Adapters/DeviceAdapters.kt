package com.syfuzzaman.prohome.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.syfuzzaman.prohome.Models.DeviceModel
import com.syfuzzaman.prohome.R

class DeviceAdapters (private val deviceList: ArrayList<DeviceModel>)
    : RecyclerView.Adapter<DeviceAdapters.DeviceViewHolder>(){

    class DeviceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var image: ImageView = itemView.findViewById(R.id.itemImage)
        var name: TextView = itemView.findViewById(R.id.itemName)
        var info: TextView = itemView.findViewById(R.id.itemInfo)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DeviceViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return DeviceViewHolder(view)
    }

    override fun getItemCount(): Int {
        return deviceList.size
    }

    override fun onBindViewHolder(holder: DeviceViewHolder, position: Int) {
        val device = deviceList[position]
        holder.image.setImageResource(device.image)
        holder.name.text = device.name
        holder.info.text = device.info
    }
}