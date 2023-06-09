package com.manas.springbootwithdocker.service;

import com.manas.springbootwithdocker.repository.UserRepository;
import com.manas.springbootwithdocker.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(int id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        User userToUpdate = userRepository.findById(user.getId()).orElse(null);
        userToUpdate.setName(user.getName());
        userToUpdate.setSalary(user.getSalary());
        userToUpdate.setTeamName(user.getTeamName());

        return userRepository.save(userToUpdate);
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}
