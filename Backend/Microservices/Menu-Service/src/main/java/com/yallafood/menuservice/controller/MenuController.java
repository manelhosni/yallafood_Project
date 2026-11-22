package com.yallafood.menuservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {

    @GetMapping("/menus/test")
    public String tester() {
        return "Menu-Service fonctionne correctement !";
    }
}
