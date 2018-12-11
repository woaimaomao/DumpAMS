package com.yolo.idea.plugin

import com.android.ddmlib.AndroidDebugBridge
import com.android.ddmlib.Client
import com.android.ddmlib.IDevice
import com.android.ddmlib.MultiLineReceiver

object AndroidDeviceManager {

    private val mCurrentDevice: IDevice? = null
    private val mCurrentClient: Client? = null
    private val deviceStateListeners = arrayListOf<com.yolo.idea.plugin.IDeviceConnectStateListener>()
    var selectedDevice: IDevice? = null

    fun init() {
        AndroidDebugBridge.initIfNeeded(true)
        AndroidDebugBridge.createBridge()
        com.yolo.idea.plugin.AndroidDeviceManager.listener()
    }

    private fun listener() {
        AndroidDebugBridge.addClientChangeListener { client, state ->
            println("AdbProcess: client= $client, state= $state")
        }
        AndroidDebugBridge.addDebugBridgeChangeListener {
            println("AdbProcess: bridge= $it")
        }
        AndroidDebugBridge.addDeviceChangeListener(object : AndroidDebugBridge.IDeviceChangeListener {
            override fun deviceChanged(device: IDevice?, state: Int) {
                com.yolo.idea.plugin.AndroidDeviceManager.deviceStateListeners.forEach {
                    it.onDeviceStateChange(device, state)
                }
            }

            override fun deviceConnected(device: IDevice?) {
                com.yolo.idea.plugin.AndroidDeviceManager.deviceStateListeners.forEach {
                    it.onDeviceConnected(device)
                }
            }

            override fun deviceDisconnected(device: IDevice?) {
                com.yolo.idea.plugin.AndroidDeviceManager.deviceStateListeners.forEach {
                    it.onDeviceDisconnected(device)
                }
            }

        })
    }

    fun executeCommand(command: String, callback: (content: Array<out String>?) -> Unit) {
        try {
            com.yolo.idea.plugin.AndroidDeviceManager.selectedDevice?.executeShellCommand(command, object : MultiLineReceiver() {
                override fun processNewLines(content: Array<out String>?) {
                    callback(content)
                }

                override fun isCancelled(): Boolean = false

            })
        } catch (e: Exception) {
            throw e
        }
    }

    fun getDevices(): Array<IDevice> {
        return AndroidDebugBridge.getBridge().devices
    }

    fun registerDeviceStateListener(listener: com.yolo.idea.plugin.IDeviceConnectStateListener) {
        com.yolo.idea.plugin.AndroidDeviceManager.deviceStateListeners.add(listener)
    }

    fun unregisterDeviceStateListener(listener: com.yolo.idea.plugin.IDeviceConnectStateListener) {
        com.yolo.idea.plugin.AndroidDeviceManager.deviceStateListeners.remove(listener)
    }
}