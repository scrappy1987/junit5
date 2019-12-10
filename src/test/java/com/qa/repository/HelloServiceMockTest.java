package com.qa.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.qa.service.HelloService;
import com.qa.service.HelloServiceImpl;

@SpringBootTest
public class HelloServiceMockTest {

    @Mock
    private HelloRepository helloRepository;
   
    @InjectMocks 
    private HelloService helloService = new HelloServiceImpl(helloRepository);

    @BeforeEach
    void setMockOutput() {
        when(helloRepository.get()).thenReturn("Hello Mock Repo");
    }

    @Test
    void testGet() {
        assertEquals("Hello Mock Repo", helloService.get());
    }

}