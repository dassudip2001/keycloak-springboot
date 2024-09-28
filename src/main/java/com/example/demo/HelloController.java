package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/v1")
public class HelloController {

    @GetMapping("/hello")
    @PreAuthorize("hasRole('client_user')")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/hello2")
    @PreAuthorize("hasRole('client_admin')")
    public ResponseEntity<String> hello2() {
        return ResponseEntity.ok("Hello World 2");
    }

}
