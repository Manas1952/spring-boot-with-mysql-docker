package com.manas.springbootwithdocker.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Users> all() {
        return userRepository.findAll();
    }

    @Override
    public List<Users> saveUser() {
        Users users = new Users();
        users.setId(1);
        users.setName("Manas");
        users.setSalary(600000);
        users.setTeamName("Development");

        userRepository.save(users);

        return userRepository.findAll();
    }
}
