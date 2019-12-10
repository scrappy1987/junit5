package com.qa.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.qa.service.HelloService;

@SpringBootTest
public class HelloServiceTest {

    @Autowired
    HelloService helloService;

    @Test
    void testGet() {
        assertEquals("Hello from repo", helloService.get());
    }

}