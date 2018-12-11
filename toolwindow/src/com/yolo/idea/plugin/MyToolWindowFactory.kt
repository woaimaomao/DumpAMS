package com.yolo.idea.plugin

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import com.intellij.ui.content.ContentFactory


/**
 *@author yolo
 */
class MyToolWindowFactory : ToolWindowFactory {
    // Create the tool window content.
    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        val myToolWindow = com.yolo.idea.plugin.SystemDumpWindow(toolWindow)
        val contentFactory = ContentFactory.SERVICE.getInstance()
        val content = contentFactory.createContent(myToolWindow.panel, "", false)
        toolWindow.contentManager.addContent(content)
    }

    override fun isDoNotActivateOnStart(): Boolean {
        return true
    }
}
