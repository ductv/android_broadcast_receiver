package com.example.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class ExampleBroadCastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirPlaneMode: Boolean = intent!!.getBooleanExtra("state", false)
        if (isAirPlaneMode) {
            Toast.makeText(context, "Air Plane mode is ON", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(context, "Air Plane mode is OFF", Toast.LENGTH_LONG).show()
        }
        TODO("Not yet implemented")
        Toast.makeText(context, "Air plane mode", Toast.LENGTH_LONG).show()
    }
}