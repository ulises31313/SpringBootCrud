package com.nttdata.demo.controller;

import com.nttdata.demo.entity.UsrDro;
import com.nttdata.demo.model.UserDtoModel;
import com.nttdata.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Api")
public class UserController {

    Logger logger =  LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService serviceuser;

    @GetMapping("/User")
    public  List<UsrDro> User(){
        logger.info("Request: Get");
        List<UsrDro> users = serviceuser.getUsers();
        return users;
    }

    @PostMapping("/User")
    public UsrDro createUser(@RequestBody UserDtoModel user) {
        logger.info("Request: "+user.toString());
        return serviceuser.CreateUsers(user);
    }

    @DeleteMapping("/User")
    public String deleteUser(@RequestBody UsrDro user) {
        logger.info("Request: "+user.toString());
        return serviceuser.deleteUser(user);
    }

    @PutMapping("/User")
    public UsrDro updateUser(@RequestBody UsrDro user) {
        logger.info("Request: "+user.toString());
        return serviceuser.updateUser(user);
    }

}
