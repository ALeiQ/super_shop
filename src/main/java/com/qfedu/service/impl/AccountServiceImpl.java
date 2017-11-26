package com.qfedu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qfedu.dao.AccountMapper;
import com.qfedu.dao.ProviderMapper;
import com.qfedu.pojo.Account;
import com.qfedu.pojo.Provider;
import com.qfedu.service.AccountService;
@Service
@Scope("prototype")
@Transactional
public class AccountServiceImpl implements AccountService{
	@Autowired
	private AccountMapper accountDao;
	@Autowired
	private ProviderMapper providerDao;
	@Override
	public List<Account> queryAll() {
		// TODO Auto-generated method stub
		return accountDao.selectAccountlist();
	}
	@Override
	public int addAccount(Account account) {
		// TODO Auto-generated method stub
		int rowCount=0;
		if(account.getApname()!=null) {
			Provider provider=new Provider();
			provider.setPname(account.getApname());
			List<Provider> list=providerDao.seleteProviderByName(provider);
			System.out.println(list);
			if(list.size()==0) {
				providerDao.insertName(provider);
			}
		}
		account.setAtime(System.currentTimeMillis());
		rowCount=accountDao.insertAccount(account);
		return rowCount;
	}
	@Override
	public List<Account> searchAccount(Account account) {
		// TODO Auto-generated method stub
		return accountDao.selectAccount(account);
	}
	@Override
	public int deleteAccount(Account account) {
		// TODO Auto-generated method stub
		return accountDao.deleteByPrimaryKey(account);
	}
	@Override
	public int updateAccount(Account account) {
		// TODO Auto-generated method stub
		int rowCount=0;
		if(account.getApname()!=null) {
			Provider provider=new Provider();
			provider.setPname(account.getApname());
			List<Provider> list=providerDao.seleteProviderByName(provider);
			System.out.println(list);
			if(list.size()==0) {
				providerDao.insertName(provider);
			}
		}
		account.setAtime(System.currentTimeMillis());
		rowCount=accountDao.updateByPrimaryKeySelective(account);
		return rowCount;
	}
}
