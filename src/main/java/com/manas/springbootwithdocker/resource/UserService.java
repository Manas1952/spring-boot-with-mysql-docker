package com.manas.springbootwithdocker.resource;

import java.util.List;

public interface UserService {
    public List<Users> all();
    public List<Users> saveUser();
}
