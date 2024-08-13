package com.educandoweb.course.resources;

import com.educandoweb.course.entites.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Lucas", "lucasreiiss100@hotmail.com","123456789","1123456789");
        return ResponseEntity.ok().body(u);
    }
}
