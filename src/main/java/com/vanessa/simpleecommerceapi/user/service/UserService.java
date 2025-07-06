package com.vanessa.simpleecommerceapi.user.service;

import com.vanessa.simpleecommerceapi.user.model.User;
import com.vanessa.simpleecommerceapi.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public User save(User user){
        return repository.save(user);
    }

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long id){
        Optional<User> optional = repository.findById(id);
        return optional.get();
    }

    public void delete(Long id){
        repository.delete(findById(id));
    }

}
