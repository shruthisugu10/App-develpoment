package com.creativefusion.suruthiga.service;

import com.creativefusion.suruthiga.dto.request.AuthenticationRequest;
import com.creativefusion.suruthiga.dto.request.RegisterRequest;
import com.creativefusion.suruthiga.dto.response.AuthenticationResponse;

public interface AuthService {
    boolean userRegistration(RegisterRequest request);

    AuthenticationResponse userAuthentication(AuthenticationRequest request);
}
