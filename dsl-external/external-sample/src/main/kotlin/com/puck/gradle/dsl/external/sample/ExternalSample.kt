package com.puck.gradle.dsl.external.sample

class ExternalSample {
    companion object {
        fun sampleFunc(str: String): String = "${this::class.java.enclosingClass?.simpleName}: $str"
    }
}
