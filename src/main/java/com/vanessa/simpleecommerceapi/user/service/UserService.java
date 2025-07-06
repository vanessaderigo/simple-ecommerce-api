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

    public User update(Long id, User obj){
        User entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(User entity, User obj){
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }

    public void delete(Long id){
        repository.delete(findById(id));
    }

}
