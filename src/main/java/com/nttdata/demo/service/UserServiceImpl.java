package com.nttdata.demo.service;

import com.nttdata.demo.components.UserConverter;
import com.nttdata.demo.controller.UserController;
import com.nttdata.demo.entity.UsrDro;
import com.nttdata.demo.model.UserDtoModel;
import com.nttdata.demo.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    Logger logger =  LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    @Qualifier("UserRepository")
    UserRepository repositoryUser;

    @Autowired
    UserConverter userConverter;

    @Override
    public List<UsrDro> getUsers() {
        return repositoryUser.findAll();
    }

    @Override
    public UsrDro CreateUsers(UserDtoModel user) {
        UsrDro usrDro = userConverter.ModelToUser(user);
        logger.info("Usuario:"+usrDro.toString());
        return repositoryUser.save(usrDro);
    }

    @Override
    public String deleteUser(UsrDro user) {
        repositoryUser.delete(user);
        return "El usuario se elimino con id: "+user.getIdUsrDro();
    }

    @Override
    public UsrDro updateUser(UsrDro user) {
       repositoryUser.save(user);
       return user;
    }
}
