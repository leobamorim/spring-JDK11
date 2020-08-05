package com.freelance.hoteisapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelController {

    @GetMapping
    public String getSoma(){

        return String.format("A soma de 1+1:%f",2.0);

    }

}
