/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.yassar.user.service.service;

import com.yassar.user.service.dto.User;
import java.util.List;


/**
 *
 * @author LENOVO
 */
public interface UserService {


    public User getUser(String id);

    public List<User> getAllUsers();

    public void addUser(User user);

    public User updateUser(User user);

    public User deleteUser(String id);

    
}