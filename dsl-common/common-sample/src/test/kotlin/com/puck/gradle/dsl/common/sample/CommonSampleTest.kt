package com.puck.gradle.dsl.common.sample

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class CommonSampleTest {
    @Test
    fun basicTest() {
        assertEquals("CommonSample: Test", CommonSample.sampleFunc("Test"))
    }
}