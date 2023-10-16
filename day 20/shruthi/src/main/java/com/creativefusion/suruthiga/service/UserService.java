package com.creativefusion.suruthiga.service;

import java.util.List;

import com.creativefusion.suruthiga.dto.request.UserRequest;
import com.creativefusion.suruthiga.dto.response.CountResponse;
import com.creativefusion.suruthiga.dto.response.UserResponse;

public interface UserService {

    List<UserResponse> getAllUsers();

    UserResponse getUser(Long uid);

    UserResponse updateUser(UserRequest request, Long uid);

    boolean deleteProduct(Long uid);

    CountResponse userCount();

}
