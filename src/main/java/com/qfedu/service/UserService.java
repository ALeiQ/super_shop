package com.qfedu.service;

import java.util.List;

import com.qfedu.pojo.User;

public interface UserService {

	List<User> login(User user);

	int saveUsers(User user);
	
	List<User> selectAll();
	
	int deleteUser(User user);
	
	int updateUser(User user);
	
	List<User> search(User user);
}
