package com.qfedu.action;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qfedu.pojo.Account;
import com.qfedu.service.AccountService;
@Controller
public class AccountController {
	@Autowired
	private AccountService service;
	@RequestMapping("/allaccount")
	public String queryAll(Map<String , Object> map,@RequestParam(name = "pageNum", required = true, defaultValue = "0") Integer pageNum,@RequestParam(name = "pageSize", required = true, defaultValue = "0") Integer pageSize) {
		List<Account> list=null;
		PageInfo<Account> pageInfo=null;
		if(pageNum==0||pageSize==0) {
			PageHelper.startPage(1,4);
			list=service.queryAll();
		}else {
			PageHelper.startPage(pageNum, pageSize);
			list=service.queryAll();
		}
		pageInfo=new PageInfo<Account>(list);
		map.put("pageInfo", pageInfo);
		map.put("accounts", list);
		return "accountAdmin";
	}
	@RequestMapping("/addaccount")
	public String addAccount(Account account) {
		service.addAccount(account);
		return "redirect:allaccount";
	}
	@RequestMapping("/searchaccount")
	public String searchAccount(Account account,Map<String , Object> map,@RequestParam(name = "pageNum", required = true, defaultValue = "0") Integer pageNum,@RequestParam(name = "pageSize", required = true, defaultValue = "0") Integer pageSize) {
		List<Account> accounts =null;
		PageInfo<Account> pageInfo=null;
		if(pageNum==0||pageSize==0) {
			PageHelper.startPage(1,4);
			accounts=service.searchAccount(account);
		}else {
			PageHelper.startPage(pageNum, pageSize);
			accounts =service.searchAccount(account);
		}
		pageInfo=new PageInfo<Account>(accounts);
		map.put("pageInfo", pageInfo);
		map.put("accounts", accounts);
		return "accountAdmin";
	}
	@RequestMapping("/updateaccount")
	public String updateAccount(Account account,String button) {
		if("修改".equals(button)) {
			service.updateAccount(account);
		}else {
			service.deleteAccount(account);
		}
		return "redirect:allaccount";
	}
}
