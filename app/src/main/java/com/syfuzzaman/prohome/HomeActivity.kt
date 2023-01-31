package com.syfuzzaman.prohome

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.widget.TextView
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

        var wfNumberTextView: TextView = findViewById(R.id.wfNumber)
        wfNumberTextView.setText(Html.fromHtml("27<sup><small>o</small></sup>"))

        val deviceInfo:TextView = findViewById(R.id.devices)
        val spannable = SpannableString("Devices (25)")
        spannable.setSpan(
            ForegroundColorSpan(Color.GRAY),
            8, // start
            12, // end
            Spannable.SPAN_EXCLUSIVE_INCLUSIVE
        )
        deviceInfo.text = spannable
    }

}