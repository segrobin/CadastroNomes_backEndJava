package com.usermanagement.demo.controller;

import com.usermanagement.demo.Sevice.UserService;
import com.usermanagement.demo.domain.RegistrationUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    private UserService userService;



    @GetMapping
    @RequestMapping("findAll")
    public ResponseEntity<List<RegistrationUsers>> getUsers() throws IOException {

        List<RegistrationUsers> stringList = userService.findAll();

        return new ResponseEntity<>(stringList, HttpStatus.OK);
    }

    @GetMapping
    @RequestMapping("findByName")
    public ResponseEntity<List<RegistrationUsers>> getUserByName(@RequestParam(required = true) String name) throws IOException {
        List<RegistrationUsers> registrationUsers = userService.findUserByName(name);
        if(Objects.isNull(registrationUsers) || registrationUsers.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(registrationUsers,HttpStatus.OK);
    }

    @DeleteMapping("deleteByName")
    public ResponseEntity<RegistrationUsers> deleteByName(@RequestBody RegistrationUsers user) throws IOException {
        if (user != null) {
            userService.deleteByName(user);
            return new ResponseEntity<>(HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }


    @PostMapping
    @RequestMapping("addUser")
    public List<RegistrationUsers> addUser(@RequestBody RegistrationUsers user) throws IOException {
        return userService.addUser(user);
    }


}
