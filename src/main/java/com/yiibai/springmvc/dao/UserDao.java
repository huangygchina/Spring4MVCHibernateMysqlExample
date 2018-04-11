package com.yiibai.springmvc.dao;

import java.util.List;

import com.yiibai.springmvc.model.User;

public interface UserDao {

	User findById(int id);

	void saveUser(User user);
	
	void deleteUserBySsn(String ssn);
	
	List<User> findAllUsers();

	User findUserBySsn(String ssn);

}
