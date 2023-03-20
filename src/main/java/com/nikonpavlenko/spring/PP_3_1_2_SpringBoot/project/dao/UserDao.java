package com.nikonpavlenko.spring.PP_3_1_2_SpringBoot.project.dao;


import com.nikonpavlenko.spring.PP_3_1_2_SpringBoot.project.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    void deleteUserById(Long id);

    User getUserById(Long id);

    List<User> getAllUser();

    void userEditor(User user, Long id);
}
