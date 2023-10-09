package com.creativefusion.suruthiga.dto.request;

import com.creativefusion.suruthiga.model.Role;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class RegisterRequest {
	
	private String user_name;
	private String email;
	private String pass_word;
	private Long phone_number;
	 private Role role;

}