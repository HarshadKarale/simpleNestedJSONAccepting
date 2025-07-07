package com.example.completecrud.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.completecrud.Model.userEntity;

@RestController
public class userController {
	userEntity user;
	@PostMapping("/user/register")
	public String registerUser(@RequestBody userEntity user) {
		return "Register User Called!"+user.getAddress();
	}
}
