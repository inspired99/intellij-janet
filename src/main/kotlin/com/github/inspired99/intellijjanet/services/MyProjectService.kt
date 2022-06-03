package com.github.inspired99.intellijjanet.services

import com.intellij.openapi.project.Project
import com.github.inspired99.intellijjanet.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
