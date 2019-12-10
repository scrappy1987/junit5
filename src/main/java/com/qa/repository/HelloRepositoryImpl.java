package com.qa.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepositoryImpl implements HelloRepository {
    
    public String get() {
        return "Hello from repo";
    }
}
