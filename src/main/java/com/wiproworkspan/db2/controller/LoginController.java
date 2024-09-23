package com.wiproworkspan.db2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wiproworkspan.db2.entity.Login;
import com.wiproworkspan.db2.service.LoginService;


@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	LoginService ser;
	
	
	@GetMapping("/get")
	public List<Login> getData(){
		return ser.getData();
	}
	
	@PostMapping("/add")
	public Login addData(@RequestBody Login login) {
		return ser.addLogin(login);
	}
	
	@DeleteMapping("/delete/{id}")
	public Login deleteData(@PathVariable int id) {
		Login login = ser.deleteLogin(id);
		if(login != null) {
			return login;
		}
		return null;
	}
	
	@PutMapping("/update/{id}")
	public Login updateData(@PathVariable int id, @RequestBody Login login) {
		Login check = ser.updateLogin(id, login);
		if(check != null) {
			return check;
		}
		return null;
	}
}
