package com.usermanagement.demo.domain;


import jakarta.persistence.*;


import java.util.Date;
@Entity
@Table(name = "registration_users")
public class RegistrationUsers {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="ID")
     private Long id;
     @Column(name="name")
     private String name;
     @Column(name="phone")
     private String phone;
     @Column(name="birthDate")
     private Date birthDate;
     @Column(name="email")
     private String email;

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getPhone() {
          return phone;
     }

     public void setPhone(String phone) {
          this.phone = phone;
     }

     public Date getBirthDate() {
          return birthDate;
     }

     public void setBirthDate(Date birthDate) {
          this.birthDate = birthDate;
     }

     public String getEmail() {
          return email;
     }

     public void setEmail(String email) {
          this.email = email;
     }
}
