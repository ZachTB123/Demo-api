package com.example.demoapi.controllers

import spock.lang.Specification

class RootControllerTest extends Specification {

    RootController controller

    def setup() {
        controller = new RootController()
    }

    def "/ should return a message"() {
        when:
        def response = controller.index()

        then:
        response != null
        response == 'Greetings from demo-api!'
    }
}
