package com.github.ajit2210.configgenerator.services

import com.github.ajit2210.configgenerator.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
