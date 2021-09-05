package com.example.ProjetoCursoJavaSpringBoot_WebServices.resouces;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProjetoCursoJavaSpringBoot_WebServices.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User user = new User(1L, "maria", "maria@gmail.com", "998256892","12345");
		return ResponseEntity.ok().body(user);
	}
}
 