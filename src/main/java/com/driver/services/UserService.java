package com.driver.services;

import com.driver.model.User;

public interface UserService {
    User registerUser(User user);
    User subscribe(String userId, String serviceProviderId);

    User register(String username, String password, String countryName) throws Exception;

    User subscribe(Integer userId, Integer serviceProviderId);
}