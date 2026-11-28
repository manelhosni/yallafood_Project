package com.yallafood.apigateway;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/fallback")
public class FallbackController {

    @RequestMapping("/restaurants")
    public ResponseEntity<Map<String, Object>> restaurantFallback() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "SERVICE_UNAVAILABLE");
        response.put("service", "RESTAURANT-SERVICE");
        response.put("message", "Le Restaurant-Service est temporairement indisponible. Le Circuit Breaker est activé.");
        response.put("timestamp", LocalDateTime.now().toString());
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(response);
    }

    @RequestMapping("/commandes")
    public ResponseEntity<Map<String, Object>> commandeFallback() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "SERVICE_UNAVAILABLE");
        response.put("service", "COMMANDE-SERVICE");
        response.put("message", "Le Commande-Service est temporairement indisponible. Le Circuit Breaker est activé.");
        response.put("timestamp", LocalDateTime.now().toString());
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(response);
    }

    @RequestMapping("/menus")
    public ResponseEntity<Map<String, Object>> menuFallback() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "SERVICE_UNAVAILABLE");
        response.put("service", "MENU-SERVICE");
        response.put("message", "Le Menu-Service est temporairement indisponible. Le Circuit Breaker est activé.");
        response.put("timestamp", LocalDateTime.now().toString());
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(response);
    }

    @RequestMapping("/livraisons")
    public ResponseEntity<Map<String, Object>> livraisonFallback() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "SERVICE_UNAVAILABLE");
        response.put("service", "LIVRAISON-SERVICE");
        response.put("message", "Le Livraison-Service est temporairement indisponible. Le Circuit Breaker est activé.");
        response.put("timestamp", LocalDateTime.now().toString());
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(response);
    }

    @RequestMapping("/notifications")
    public ResponseEntity<Map<String, Object>> notificationFallback() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "SERVICE_UNAVAILABLE");
        response.put("service", "NOTIFICATION-SERVICE");
        response.put("message", "Le Notification-Service est temporairement indisponible. Le Circuit Breaker est activé.");
        response.put("timestamp", LocalDateTime.now().toString());
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(response);
    }
}
