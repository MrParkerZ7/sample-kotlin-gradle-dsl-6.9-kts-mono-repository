package com.puck.gradle.dsl.utils.a

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class UtilSampleATest {
    @Test
    fun basicTest() {
        assertEquals("UtilSampleA: Test", UtilSampleA.sampleFunc("Test"))
    }
}