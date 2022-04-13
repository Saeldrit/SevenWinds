package com.example.writereadtodb.service;

import com.example.writereadtodb.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    User getById(Integer id);

    List<User> getAll();

    void updateUser(Integer id, User user);

    void deleteUser(Integer id);
}
