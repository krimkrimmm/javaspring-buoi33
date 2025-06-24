package vn.scrip.buoi33.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getUsers() {
        return "List all users - ADMIN only";
    }

    @PostMapping
    public String createUser() {
        return "Create user - ADMIN only";
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable Long id) {
        return "Update user with ID " + id + " - ADMIN only";
    }
}







