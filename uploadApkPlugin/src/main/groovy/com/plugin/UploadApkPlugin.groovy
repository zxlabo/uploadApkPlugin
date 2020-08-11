package com.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

public class UploadApkPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.task('UploadApk') {
            doLast {
                println("自定义plugin")
            }
        }
    }
}