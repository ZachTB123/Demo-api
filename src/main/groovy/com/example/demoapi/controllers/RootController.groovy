package com.example.demoapi.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RootController {

    @RequestMapping(value = '/')
    String index() {
        return 'Greetings from demo-api!'
    }
}
