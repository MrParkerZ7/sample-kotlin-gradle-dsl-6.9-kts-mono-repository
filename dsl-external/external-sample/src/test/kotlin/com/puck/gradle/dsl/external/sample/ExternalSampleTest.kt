package com.puck.gradle.dsl.external.sample

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ExternalSampleTest {
    @Test
    fun basicTest() {
        assertEquals("ExternalSample: Test", ExternalSample.sampleFunc("Test"))
    }
}