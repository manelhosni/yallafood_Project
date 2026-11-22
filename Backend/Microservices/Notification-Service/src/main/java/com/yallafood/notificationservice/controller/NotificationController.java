package com.yallafood.notificationservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @GetMapping("/notifications/test")
    public String tester() {
        return "Notification-Service fonctionne correctement !";
    }
}
