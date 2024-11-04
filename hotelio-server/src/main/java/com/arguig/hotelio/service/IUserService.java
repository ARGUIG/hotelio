package com.arguig.hotelio.service;

import com.arguig.hotelio.model.User;

import java.util.List;

/**
 * @author arguig
 */

public interface IUserService {
    User registerUser(User user);
    List<User> getUsers();
    void deleteUser(String email);
    User getUser(String email);
}
