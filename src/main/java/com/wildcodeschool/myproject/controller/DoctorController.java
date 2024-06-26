package com.wildcodeschool.myproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

    @GetMapping("/doctor/{id}")
    public String doctor(@PathVariable int id) {
        if (id == 1) {
            return "William Hartnell";
        }
        if (id == 10) {
            return "David Tennant";
        }
        if (id == 13) {
            return "Jodie Whittaker";
        }
        return "Doctor not found";
    }
}
