package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Aline {

    @Autowired
    Laptop laptop;

    public void code() {
        laptop.compile();
    }
}
