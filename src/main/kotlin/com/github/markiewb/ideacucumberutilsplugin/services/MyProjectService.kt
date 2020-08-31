package com.github.markiewb.ideacucumberutilsplugin.services

import com.intellij.openapi.project.Project
import com.github.markiewb.ideacucumberutilsplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
