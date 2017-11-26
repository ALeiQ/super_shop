package com.qfedu.service.impl;
//

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qfedu.dao.UserMapper;
import com.qfedu.pojo.User;
import com.qfedu.service.UserService;

//功能与@Repository一样，也是把当前类声明为一个beanb
//名字不同只是为了区分不同的层次，功能和效果一样
@Service
@Scope("prototype")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper dao;

	@Override
	public List<User> login(User user) {

		return dao.selectByNameAndPassword(user);
	}

	@Override
	public int saveUsers(User user) {

		return dao.insert(user);
	}

	@Override
	public List<User> selectAll() {

		return dao.selectUsers();
	}

	@Override
	public int deleteUser(User user) {
		// TODO Auto-generated method stub
		return dao.deleteUser(user);
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKey(user);
	}

	@Override
	public List<User> search(User user) {
		// TODO Auto-generated method stub
		return dao.selectUsersbyUname(user);
	}

}
