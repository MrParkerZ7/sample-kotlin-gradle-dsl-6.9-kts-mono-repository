package com.puck.gradle.dsl.api.sample

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ApiSampleTest {
    @Test
    fun basicTest() {
        assertEquals("ApiSample: Test", ApiSample.sampleFunc("Test"))
        assertEquals("ApiSample: CommonSample: Test", ApiSample.sampleCallCommonFunc("Test"))
    }
}