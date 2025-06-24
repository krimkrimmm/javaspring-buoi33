package vn.scrip.buoi33.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;

import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()

                .authorizeHttpRequests()
                .requestMatchers("/dashboard").hasAnyRole("ADMIN", "SALE")
                .requestMatchers("/users/**").hasRole("ADMIN")
                .requestMatchers("/categories/**", "/products/**", "/brands/**", "/orders/**")
                .hasAnyRole("ADMIN", "SALE")
                .requestMatchers("/posts/**")
                .hasAnyRole("ADMIN", "SALE", "AUTHOR")
                .requestMatchers("/me/**")
                .hasRole("USER")

                .anyRequest().authenticated()
                .and()
                .formLogin();
        return http.build();
    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        // Không mã hóa password để demo nhanh
        return NoOpPasswordEncoder.getInstance();
    }
}
