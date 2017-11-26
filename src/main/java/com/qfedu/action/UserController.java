package com.qfedu.action;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qfedu.pojo.User;
import com.qfedu.service.UserService;

@Controller
public class UserController {

	/*
	 * @Autowired(required = true)
	 * 
	 * @Qualifier("userServiceImpl")
	 */
	@Autowired
	private UserService userService;

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String login(User user, HttpSession session) {

		/*
		// 1先获取前端传递的用户和密码
		// 2调用service，把用户名密码进行传入
		List<User> users = userService.login(user);
		// 3根据service返回的结果进行页面的跳转
		if (users == null || users.size() == 0) {
			// 无此用户，反会登录页面
			return "redirect:login.jsp";
		} else {
			session.setAttribute("user", users.get(0));

			// 可以登录，跳转到首页
			return "redirect:admin_index.jsp";
		}*/
		Subject subject=SecurityUtils.getSubject();
		  try {
			  subject.login(new UsernamePasswordToken(user.getUname(),user.getUpassword()));
			  List<User> users = userService.login(user);
			  session.setAttribute("user", users.get(0));
			  return "redirect:admin_index.jsp";
		} catch (Exception e) {
			// TODO: handle exception
			return "redirect:login.jsp";
		}

	}

	// 退出登录，提供给ajax进行请求
	@RequestMapping("/loginout")
	public void loginout(HttpSession session, HttpServletResponse resp) throws IOException {

		// 使session失效
		session.invalidate();
		System.out.println("退出登录");
		resp.getWriter().print(1);
	}

	// 查询,查询完成转发

	@RequestMapping("/userlist")
	public String selectAllUsers(Map<String, Object> map,@RequestParam(name = "pageNum", required = true, defaultValue = "0") Integer pageNum,@RequestParam(name = "pageSize", required = true, defaultValue = "0") Integer pageSize) {
		List<User> users = null;
		PageInfo<User> pageInfo=null;
		if(pageNum==0||pageSize==0) {
			PageHelper.startPage(1, 4);
			users=userService.selectAll();
		}else {
			PageHelper.startPage(pageNum, pageSize);
			users=userService.selectAll();
		}
		pageInfo=new PageInfo<User>(users);
		map.put("users", users);
		map.put("pageInfo",pageInfo);
		return "userAdmin";
	}

	// 新增

	@RequestMapping("/saveuser")
	public String insertUser(User user) {

		System.out.println(user);
		userService.saveUsers(user);

		return "redirect:userlist";

	}

	@RequestMapping("/insertordelete")
	public String deleteupdateUser(User user, String button) {

		System.out.println(button);
		// 先判断当前点击是删除还是修改
		if (button.equals("修改")) {
			userService.updateUser(user);

		} else {

			userService.deleteUser(user);

		}

		return "redirect:userlist";

	}
	@RequestMapping("/queryuser")
	public String searchUser(User user,Map<String, Object> map,@RequestParam(name = "pageNum", required = true, defaultValue = "0") Integer pageNum,@RequestParam(name = "pageSize", required = true, defaultValue = "0") Integer pageSize) {
		System.out.println("查找");
		List<User> users=userService.search(user);
		PageInfo<User> pageInfo=null;
		if(pageNum==0||pageSize==0) {
			PageHelper.startPage(1, 4);
			users=userService.search(user);
		}else {
			PageHelper.startPage(pageNum, pageSize);
			users=userService.search(user);
		}
		pageInfo=new PageInfo<User>(users);
		map.put("users", users);
		map.put("pageInfo",pageInfo);
		return "userAdmin";
	}

}
