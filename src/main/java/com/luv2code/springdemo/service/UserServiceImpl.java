package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.UserDAO;
import com.luv2code.springdemo.entity.User;

@Service
public class UserServiceImpl implements UserService {

	// need to inject customer dao
	@Autowired
	private UserDAO customerDAO;
	
	@Override
	@Transactional
	public List<User> getUsers() {
		return customerDAO.getUsers();
	}

	@Override
	@Transactional
	public void saveUser(User theUser) {

		customerDAO.saveUser(theUser);
	}

	@Override
	@Transactional
	public User getUser(int theId) {
		
		return customerDAO.getUser(theId);
	}

	@Override
	@Transactional
	public void deleteUser(int theId) {
		
		customerDAO.deleteUser(theId);
	}
	
	
}





