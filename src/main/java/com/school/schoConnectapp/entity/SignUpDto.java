package com.school.schoConnectapp.entity;

import java.util.Set;

public class SignUpDto {
    
    private String firstName;
    
    private String lastName;
    
    private String email;
    
    private String userName;
    
    private String password;
    
    private Set<Role> roles;
    
    private String roleName;

    public String getFirstName() {
        return firstName;
    }

    public SignUpDto setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public SignUpDto setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public SignUpDto setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public SignUpDto setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public SignUpDto setPassword(String password) {
        this.password = password;
        return this;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public SignUpDto setRoles(Set<Role> roles) {
        this.roles = roles;
        return this;
    }

    public String getRoleName() {
        return roleName;
    }

    public SignUpDto setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
}
