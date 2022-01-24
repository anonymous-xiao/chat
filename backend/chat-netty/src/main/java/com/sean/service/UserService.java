package com.sean.service;

import com.sean.pojo.Users;

public interface UserService {
    boolean queryUserNameIsExist(String userName);
    Users queryUserForLogin(String username, String md5Str);
    Users saveUser(Users user);
}
