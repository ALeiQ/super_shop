package com.qfedu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.qfedu.pojo.User;

//开启扫描之后会扫描到这个注解，spring扫描到之后会把当前类声明为一个bean
//与我们手动在xml 定一个bean标签指定class效果一样
//我们就直接通过注解，不在需要在xml进行配置
@Repository
public interface UserMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table users
	 *
	 * @mbggenerated Thu Nov 02 09:35:36 CST 2017
	 */
	int deleteByPrimaryKey(Integer uid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table users
	 *
	 * @mbggenerated Thu Nov 02 09:35:36 CST 2017
	 */
	int insert(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table users
	 *
	 * @mbggenerated Thu Nov 02 09:35:36 CST 2017
	 */
	int insertSelective(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table users
	 *
	 * @mbggenerated Thu Nov 02 09:35:36 CST 2017
	 */
	User selectByPrimaryKey(Integer uid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table users
	 *
	 * @mbggenerated Thu Nov 02 09:35:36 CST 2017
	 */
	int updateByPrimaryKeySelective(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table users
	 *
	 * @mbggenerated Thu Nov 02 09:35:36 CST 2017
	 */
	int updateByPrimaryKey(User record);

	// 根据用户名密码进行查询
	// List<User> selectByNameAndPassword(@Param(value = "name") String name,
	// @Param("pass") String password);
	List<User> selectByNameAndPassword(User user);

	// 查询所有的用户
	List<User> selectUsers();

	// 增加用户

	int insertUser(User user);

	// 删除用户

	int deleteUser(User user);

	// 搜索用户
	List<User> selectUsersbyUname(User user);

}