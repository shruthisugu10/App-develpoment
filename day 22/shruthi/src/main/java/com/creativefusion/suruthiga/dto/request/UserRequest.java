package com.creativefusion.suruthiga.dto.request;

import com.creativefusion.suruthiga.model.enumerate.Role;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {
    private String name;
    private String email;
    private String password;
    private Boolean isEnabled;
    private Role role;
    private Long phone;    
    private String address;
}
