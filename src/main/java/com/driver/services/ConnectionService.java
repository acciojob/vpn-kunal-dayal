package com.driver.services;

import com.driver.model.Connection;
import com.driver.model.User;

public interface ConnectionService {
    User connect(int userId, String countryName) throws Exception;

    User disconnect(int userId) throws Exception;

    User communicate(int senderId, int receiverId) throws Exception;

    Connection connect(String userId, String countryId);
    void disconnect(String userId);
    void communicate(String userId1, String userId2);
}