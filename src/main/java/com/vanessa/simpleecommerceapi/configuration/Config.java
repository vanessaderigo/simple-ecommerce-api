package com.vanessa.simpleecommerceapi.configuration;

import com.vanessa.simpleecommerceapi.user.model.User;
import com.vanessa.simpleecommerceapi.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
@RequiredArgsConstructor
public class Config implements CommandLineRunner {

    private final UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Antônia", "xxxx-xxxx", "maria@gmail.com", "123");
        User u2 = new User(null, "Alexandre Rodrigues", "xxxx-xxxx", "alexandre@gmail.com", "123");

        repository.saveAll(Arrays.asList(u1, u2));
    }
}
