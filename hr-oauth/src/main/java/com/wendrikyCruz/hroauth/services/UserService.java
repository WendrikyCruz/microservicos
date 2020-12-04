package com.wendrikyCruz.hroauth.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wendrikyCruz.hroauth.entities.User;
import com.wendrikyCruz.hroauth.feignclients.UserFeignClient;

@Service
public class UserService {
	
	@Autowired
	private UserFeignClient userFeignClient;
	
	public User findByEmail(String email) {
		User user = userFeignClient.findByEmail(email).getBody();
		
		if(user == null) {
			throw new IllegalArgumentException("Email no fount");
		}
		
		return user;
	}
	
	
}
