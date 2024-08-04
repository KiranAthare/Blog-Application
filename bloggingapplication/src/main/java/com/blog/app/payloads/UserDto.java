package com.blog.app.payloads;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	
	private int Id;
	
	@NotEmpty
	@Size(min = 4, message = "Username must be min 4 charactors")
	private String name;
	
	@Email(message = "Email Address not valide")
	private String email;
	
	@NotEmpty
	@Size(min = 3, max = 10, message = "Password must be min 3 and max 10 charactors")
	private String password;
	
	
	private String about;
	

}
