package com.usermanagement.demo.Sevice.impl;

import com.usermanagement.demo.Sevice.UserService;
import com.usermanagement.demo.domain.RegistrationUsers;
import com.usermanagement.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    List<RegistrationUsers> registrationUsers;

    public List<RegistrationUsers> findUserByName(String nameFilter) {

        List<RegistrationUsers> names = userRepository.findByName(nameFilter);


        return names;
    }

    public List<RegistrationUsers> findAll() {

        return userRepository.findAll();
    }

    public List<RegistrationUsers> addUser(RegistrationUsers user)  {
        userRepository.save(user);
        List<RegistrationUsers> registrationUsers =userRepository.findAll();

        Collections.sort(registrationUsers, (u1, u2) -> u2.getId().compareTo(u1.getId()));
        return  registrationUsers;
    }

    public void deleteByName(RegistrationUsers user){
        userRepository.delete(user);
    }

    public List<RegistrationUsers> getUsers() {
        if(registrationUsers==null){
            registrationUsers = new ArrayList<>();
        }
        return registrationUsers;
    }

}
