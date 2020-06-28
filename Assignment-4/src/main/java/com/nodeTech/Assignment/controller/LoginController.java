package com.nodeTech.Assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nodeTech.Assignment.entity.Login;
import com.nodeTech.Assignment.service.LoginService;
@SpringBootApplication
@CrossOrigin(origins = "*")
@RestController
public class LoginController {

	@Autowired
	private LoginService service;
	
	@PostMapping("/addUser")
	public Login postUser(@RequestBody Login user) {
		return service.addUser(user);
	}
	
	@GetMapping("/getUser")
	public List<Login> getUsers(){
		return service.getUser();
	}
	
	@PutMapping("/updateUser")
	public Login putUser(@RequestBody Login user) {
		return service.updateUser(user);
	}
	
	@DeleteMapping("/deleteuser/{id}")
	public String deleteUser(@PathVariable int id) {
		return service.deleteUser(id);
	}

}
