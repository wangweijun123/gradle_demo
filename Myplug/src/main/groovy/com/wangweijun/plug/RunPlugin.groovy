package com.wangweijun.plug

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * gradle编译的一个插件，很像一个拦截器,调用完一个拦截器修改之后的内容，接着给
 * 下一个插件  class  ---插件1----插件2---->  dex
 */
class RunPlugin implements Plugin<Project> {
    public static final String EXT_NAME = "tinkerPatch"
    @Override
    void apply(Project project) {
        println " apply image plugin "
//        android.registerTransform(new ImageMonitorTransform())

        def android = project.extensions.android
        def configuration = project.systrace
        android.applicationVariants.all { variant ->

            println " do tasks "
            // 任务代码
            /*String output = configuration.output
            if (Util.isNullOrNil(output)) {
                configuration.output = project.getBuildDir().getAbsolutePath() + File.separator + "systrace_output"
            }

            if (configuration.enable) {
                SystemTraceTransform.inject(project, variant)
            }*/
        }
    }
}
