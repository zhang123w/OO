package com.pktech.service;


import org.springframework.stereotype.Service;

import com.pktech.entity.User;

@Service
public interface UserService {
   public User findUserByPhone(String phone) ;
}
