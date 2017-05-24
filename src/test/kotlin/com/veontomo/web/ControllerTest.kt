package com.veontomo.web

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInfo
import org.junit.runner.RunWith
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest


@RunWith(SpringRunner::class)
@SpringBootTest
class ControllerTest {
    @Autowired
    private var c: Controller = Controller()

    @Test
    @DisplayName("Controller is injected")
    fun testController() {
        assertNotNull(c)
    }
}

