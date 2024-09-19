package com.puck.gradle.dsl.utils.b

class UtilSampleB {
    companion object {
        fun sampleFunc(str: String): String = "${this::class.java.enclosingClass?.simpleName}: $str"
    }
}
