package com.veontomo.web

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInfo

@Tag("fast")
class ControllerTest {
    @Test
    @DisplayName("My 1st JUnit 5 test! 😎")
    fun test(info: TestInfo){
        assertEquals("My 1st JUnit 5 test! 😎", info.displayName) { "TestInfo is injected correctly" }
    }

}