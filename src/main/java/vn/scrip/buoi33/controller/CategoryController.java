package vn.scrip.buoi33.controller;

import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/categories")
public class CategoryController {

    @GetMapping
    public String getCategories() {
        return "List categories - ADMIN, SALE";
    }

    @PostMapping
    public String createCategory() {
        return "Create category - ADMIN, SALE";
    }

    @PutMapping("/{id}")
    public String updateCategory(@PathVariable Long id) {
        return "Update category " + id + " - ADMIN, SALE";
    }

    @DeleteMapping("/{id}")
    public String deleteCategory(@PathVariable Long id) {
        return "Delete category " + id + " - ADMIN, SALE";
    }
}
