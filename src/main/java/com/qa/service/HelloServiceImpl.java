package com.qa.service;

import org.springframework.stereotype.Service;

import com.qa.repository.HelloRepository;

@Service
public class HelloServiceImpl implements HelloService {
	
	private HelloRepository helloRepository;

	public HelloServiceImpl(HelloRepository helloRepository) {
		this.helloRepository = helloRepository;
	}

	public String get() {
		return helloRepository.get();
	}

}
