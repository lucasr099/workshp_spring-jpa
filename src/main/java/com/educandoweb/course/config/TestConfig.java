package com.educandoweb.course.config;

import com.educandoweb.course.entites.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import com.educandoweb.course.repositories.UserRepository;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "98888888", "123456789");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456789");
        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
