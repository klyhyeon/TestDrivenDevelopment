package com.junit.controller;

import com.junit.domain.Car1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @GetMapping("/cars/{name}")
    private Car1 getCar(@PathVariable String name) {
        return null;
    }
}
