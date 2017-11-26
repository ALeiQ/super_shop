package com.qfedu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qfedu.dao.ProviderMapper;
import com.qfedu.pojo.Provider;
import com.qfedu.service.ProviderService;

@Service
@Scope("prototype")
@Transactional
public class ProviderServiceImpl implements ProviderService{

	@Autowired(required = false)
	private ProviderMapper dao;

	@Override
	public List<Provider> queryAll() {
		// TODO Auto-generated method stub
		return dao.seleteAllProvider();
	}

	@Override
	public int addProvider(Provider provider) {
		// TODO Auto-generated method stub
		return dao.insertSelective(provider);
	}

	@Override
	public int deleteProvider(Provider provider) {
		// TODO Auto-generated method stub
		return dao.deleteProvider(provider);
	}

	@Override
	public int updateProvider(Provider provider) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKeySelective(provider);
	}

	@Override
	public List<Provider> searchProvider(Provider provider) {
		// TODO Auto-generated method stub
		return dao.searchProvider(provider);
	}

}
