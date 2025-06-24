package vn.scrip.buoi33.controller;

import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/products")
public class ProductController
{
    @GetMapping
    public String getProducts() {
        return "List products - ADMIN, SALE";
    }

    @PostMapping
    public String createProduct() {
        return "Create product - ADMIN, SALE";
    }

    @PutMapping("/{id}")
    public String updateProduct(@PathVariable Long id) {
        return "Update product " + id + " - ADMIN, SALE";
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id) {
        return "Delete product " + id + " - ADMIN, SALE";
    }

}
