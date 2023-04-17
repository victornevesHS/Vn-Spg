package com.pratice.spring.reources;


import com.pratice.spring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
@GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "maria", "maria@asas.com", "9090909","12345" );
        return ResponseEntity.ok().body(u);
    }
}
