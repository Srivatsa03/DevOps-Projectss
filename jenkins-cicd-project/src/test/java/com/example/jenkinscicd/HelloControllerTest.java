package com.example.jenkinscicd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HelloControllerTest {

    @Test
    void helloReturnsHelloWorld() {
        HelloController controller = new HelloController();

        assertEquals("Hello World", controller.hello());
    }
}
