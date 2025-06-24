package vn.scrip.buoi33.controller;

import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping
    public String getOrders() {
        return "List orders - ADMIN, SALE";
    }
    @PostMapping
    public String createOrder() {
        return "Create order - ADMIN, SALE";
    }


    @PutMapping("/{id}")
    public String updateOrder(@PathVariable Long id) {
        return "Update order " + id + " - ADMIN, SALE";
    }
}







