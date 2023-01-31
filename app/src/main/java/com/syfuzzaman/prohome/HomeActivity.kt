package com.syfuzzaman.prohome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.syfuzzaman.prohome.Adapters.DeviceAdapters
import com.syfuzzaman.prohome.Models.DeviceModel

class HomeActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var deviceList: ArrayList<DeviceModel>
    private lateinit var deviceAdapter: DeviceAdapters

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        deviceList = ArrayList()

        recyclerView = findViewById(R.id.deviceListRecyclarView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true)

        deviceList.add(DeviceModel(R.drawable.ic_light, "Light", "x3 Devices"))
        deviceList.add(DeviceModel(R.drawable.ic_light, "Fan", "x2 Devices"))
        deviceList.add(DeviceModel(R.drawable.ic_light, "Mobile", "x1Devices"))
        deviceList.add(DeviceModel(R.drawable.ic_light, "Laptop", "x1 Devices"))
        deviceList.add(DeviceModel(R.drawable.ic_light, "TV", "x2 Devices"))
        deviceList.add(DeviceModel(R.drawable.ic_light, "AC", "x2 Devices"))

        deviceAdapter = DeviceAdapters(deviceList)
        recyclerView.adapter = deviceAdapter
    }
}