package com.nodeTech.Assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nodeTech.Assignment.entity.Login;
import com.nodeTech.Assignment.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	private LoginRepository repo;
	
	public Login addUser(Login login) {
		return repo.save(login);
	}
	
	public List<Login> getUser(){
		return repo.findAll();
	}
	
	public String deleteUser(int id) {
		repo.deleteById(id);
		return "user deleted"+id;
	}
	public Login updateUser(Login login) {
		Login existingUser=repo.findById(login.getId()).orElse(new Login());
		existingUser.setUserName(login.getUserName());
		existingUser.setPassword(login.getPassword());
		return repo.save(existingUser);
	}
}
