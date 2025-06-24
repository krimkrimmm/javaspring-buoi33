package vn.scrip.buoi33.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/me")
public class UserPersonalController {

    @GetMapping
    public String viewProfile() {
        return "User profile info - USER";
    }

    @PutMapping
    public String updateProfile() {
        return "Update personal info - USER";
    }
}


