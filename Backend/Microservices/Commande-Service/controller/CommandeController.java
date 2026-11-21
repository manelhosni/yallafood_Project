package com.yallafood.commandeservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommandeController {

    @GetMapping("/commandes/test")
    public String tester() {
        return "Commande-Service fonctionne correctement !";
    }
}