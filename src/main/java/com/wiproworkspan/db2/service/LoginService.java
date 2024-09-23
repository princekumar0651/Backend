package com.wiproworkspan.db2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiproworkspan.db2.entity.Login;
import com.wiproworkspan.db2.repo.LoginRepo;

@Service
public class LoginService {
	@Autowired
	private LoginRepo loginRepo;
	
	public Login deleteLogin(int id) {
		Optional opt = loginRepo.findById(id);
		if(opt.isPresent()) {
			loginRepo.deleteById(id);
			return (Login) opt.get();
		}
		return null;
	}

	public List<Login> getData() {
		List<Login> login = loginRepo.findAll();
		return login;
	}
	
	public Login addLogin(Login login) {
		System.out.println("Inside Service"+ login.getUser_name());
		System.out.println(login.getPassword());
		System.out.println(login.getUser_name());
		return loginRepo.save(login);
	}
	
	public Login updateLogin(int id, Login login) {
		Optional opt = loginRepo.findById(id);
		Login lg;
		if(opt.isPresent()) {
			lg= (Login) opt.get();
			lg.setUser_name(login.getUser_name());
			lg.setPassword(login.getPassword());
			return loginRepo.save(lg);
		}
		return null;
	}
}

