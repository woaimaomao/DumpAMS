package com.yolo.idea.plugin

import com.intellij.notification.Notification
import com.intellij.notification.NotificationType
import com.intellij.notification.Notifications

object Utils {
    fun showNotification(title: String, message: String, type: NotificationType) {
        Notifications.Bus.notify(Notification("1", title, message, type))
    }

    fun showNotification(message: String, type: NotificationType) {
        com.yolo.idea.plugin.Utils.showNotification("SystemMonitor", message, type)
    }
}