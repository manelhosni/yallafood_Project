package com.yallafood.restaurantservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantController {

    @GetMapping("/restaurants/test")
    public String tester() {
        return "Restaurant-Service fonctionne correctement !";
    }
}
