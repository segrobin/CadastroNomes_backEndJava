package com.usermanagement.demo.repository;

import com.usermanagement.demo.domain.RegistrationUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<RegistrationUsers, Integer> {
    @Query("SELECT u FROM RegistrationUsers u WHERE LOWER(u.name) LIKE LOWER(CONCAT('%', :name, '%'))")
    List<RegistrationUsers> findByName(@Param("name") String name);
}
