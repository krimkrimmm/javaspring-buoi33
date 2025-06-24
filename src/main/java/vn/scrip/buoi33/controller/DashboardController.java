package vn.scrip.buoi33.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashboardController
{

    @GetMapping("/dashboard")
    public String viewDashboard() {
        return "Dashboard content for ADMIN and SALE";
    }
}






