package com.puck.gradle.dsl.api.sample

import com.puck.gradle.dsl.common.sample.CommonSample

class ApiSample {
    companion object {
        fun sampleFunc(str: String): String = "${this::class.java.enclosingClass?.simpleName}: $str"
        fun sampleCallCommonFunc(str: String): String = sampleFunc(CommonSample.sampleFunc(str))
    }
}
