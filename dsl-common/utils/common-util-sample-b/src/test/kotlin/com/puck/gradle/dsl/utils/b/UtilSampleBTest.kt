package com.puck.gradle.dsl.utils.b

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class UtilSampleBTest {
    @Test
    fun basicTest() {
        assertEquals("UtilSampleB: Test", UtilSampleB.sampleFunc("Test"))
    }
}