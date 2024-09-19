package com.puck.gradle.dsl.common.sample

class CommonSample {
    companion object {
        fun sampleFunc(str: String): String = "${this::class.java.enclosingClass?.simpleName}: $str"
    }
}
