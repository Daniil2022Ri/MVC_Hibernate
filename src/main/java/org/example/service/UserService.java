package org.example.service;

import org.example.model.User;
import java.util.List;


public interface UserService {
    List<User> findAll();
    void save(User user);
    void deleteById(Long id);
    User findById(Long id);
}
