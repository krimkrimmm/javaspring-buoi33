package vn.scrip.buoi33.controller;

import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/posts")
public class AuthorController {

    @GetMapping
    public String getPosts() {
        return "List posts - ADMIN, SALE, AUTHOR";
    }
    @PostMapping
    public String createPost() {
        return "Create post - ADMIN, SALE, AUTHOR";
    }


    @PutMapping("/{id}")
    public String updatePost(@PathVariable Long id) {
        return "Update post " + id + " - ADMIN, SALE, AUTHOR";
    }
    @DeleteMapping("/{id}")
    public String deletePost(@PathVariable Long id) {
        return "Delete post " + id + " - ADMIN, SALE, AUTHOR";
    }
}

