package com.veontomo.web

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {
    @RequestMapping("/greeting")
    public fun greeting(): Greeting {
        return Greeting("Hi", "user")
    }
}




