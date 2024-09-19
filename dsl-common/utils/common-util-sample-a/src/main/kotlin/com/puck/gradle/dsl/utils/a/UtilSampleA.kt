package com.puck.gradle.dsl.utils.a

class UtilSampleA {
    companion object {
        fun sampleFunc(str: String): String = "${this::class.java.enclosingClass?.simpleName}: $str"
    }
}
