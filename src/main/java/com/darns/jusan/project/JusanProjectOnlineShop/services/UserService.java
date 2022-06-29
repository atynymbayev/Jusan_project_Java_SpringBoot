package com.darns.jusan.project.JusanProjectOnlineShop.services;

import com.darns.jusan.project.JusanProjectOnlineShop.entity.Users;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;


public interface UserService extends UserDetailsService {
    Users getUserByEmail(String email);
    Users createUser(Users users);
    List<Users> getAllUsers(Long id);
    Users save(Users user);
    void changePassword(Users users,String password,String rePassword);
}
