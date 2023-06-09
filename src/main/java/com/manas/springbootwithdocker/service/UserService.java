package com.manas.springbootwithdocker.service;

import com.manas.springbootwithdocker.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public User getUser(int id);
    public void addUser(User user);
    public void deleteUser(int id);
    public User updateUser(User user);
}
