package com.nttdata.demo.service;

import com.nttdata.demo.entity.UsrDro;
import com.nttdata.demo.model.UserDtoModel;

import java.util.List;

public interface UserService {

    public List<UsrDro> getUsers();
    public UsrDro CreateUsers(UserDtoModel user);
    public String deleteUser(UsrDro user);
    public UsrDro updateUser(UsrDro user);
}
