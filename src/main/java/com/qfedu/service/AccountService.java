package com.qfedu.service;

import java.util.List;

import com.qfedu.pojo.Account;

public interface AccountService {
	List<Account> queryAll();
	int addAccount(Account account);
	List<Account> searchAccount(Account account);
	int deleteAccount(Account account);
	int updateAccount(Account account);
}
