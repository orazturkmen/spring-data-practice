package com.cydeo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Users extends BaseEntity{
    String email;
    String firstName;
    String lastName;
    String password;
    
    Role role;
}
