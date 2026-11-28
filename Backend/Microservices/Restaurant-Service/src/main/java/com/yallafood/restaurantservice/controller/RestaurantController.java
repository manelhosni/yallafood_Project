package com.yallafood.restaurantservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/test")
    public String tester() {
        return "Restaurant-Service fonctionne correctement sur le port : " + port;
    }

    @GetMapping("/status")
    public Map<String, String> status() {
        Map<String, String> info = new HashMap<>();
        info.put("service", "RESTAURANT-SERVICE");
        info.put("port", port);
        info.put("status", "UP");
        return info;
    }

    @GetMapping
    public Map<String, Object> getAllRestaurants() {
        Map<String, Object> response = new HashMap<>();
        response.put("instance_port", port);
        response.put("restaurants", getSampleRestaurants());
        return response;
    }

    @GetMapping("/{id}")
    public Map<String, Object> getRestaurantById(@PathVariable Long id) {
        Map<String, Object> response = new HashMap<>();
        response.put("instance_port", port);

        List<Map<String, Object>> restaurants = getSampleRestaurants();
        Map<String, Object> restaurant = restaurants.stream()
                .filter(r -> r.get("id").equals(id))
                .findFirst()
                .orElse(null);

        if (restaurant != null) {
            response.put("restaurant", restaurant);
        } else {
            response.put("error", "Restaurant non trouvé avec l'id : " + id);
        }
        return response;
    }

    private List<Map<String, Object>> getSampleRestaurants() {
        Map<String, Object> r1 = new HashMap<>();
        r1.put("id", 1L);
        r1.put("nom", "Chez Yalla");
        r1.put("adresse", "12 Rue de la Paix, Casablanca");
        r1.put("cuisine", "Marocaine");
        r1.put("note", 4.5);

        Map<String, Object> r2 = new HashMap<>();
        r2.put("id", 2L);
        r2.put("nom", "Pizza Roma");
        r2.put("adresse", "45 Avenue Hassan II, Rabat");
        r2.put("cuisine", "Italienne");
        r2.put("note", 4.2);

        Map<String, Object> r3 = new HashMap<>();
        r3.put("id", 3L);
        r3.put("nom", "Sushi Master");
        r3.put("adresse", "8 Boulevard Zerktouni, Marrakech");
        r3.put("cuisine", "Japonaise");
        r3.put("note", 4.7);

        return Arrays.asList(r1, r2, r3);
    }
}
