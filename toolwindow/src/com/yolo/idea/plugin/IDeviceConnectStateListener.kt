package com.yolo.idea.plugin

import com.android.ddmlib.IDevice

interface IDeviceConnectStateListener {
    fun onDeviceConnected(p0: IDevice?)
    fun onDeviceDisconnected(p0: IDevice?)
    fun onDeviceStateChange(device: IDevice?, state: Int)
}