package com.usermanagement.demo.Sevice;

import com.usermanagement.demo.domain.RegistrationUsers;

import java.util.List;

public interface UserService {

     List<RegistrationUsers> findUserByName (String name) ;

     List<RegistrationUsers> findAll () ;

     List<RegistrationUsers> addUser(RegistrationUsers name);

     void deleteByName (RegistrationUsers name);
}
