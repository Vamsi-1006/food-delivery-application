package com.vamsi.food_delivery.service;

import com.vamsi.food_delivery.io.UserRequest;
import com.vamsi.food_delivery.io.UserResponse;

public interface UserService {

    UserResponse registerUser(UserRequest request);

    String findByUserId();
}
