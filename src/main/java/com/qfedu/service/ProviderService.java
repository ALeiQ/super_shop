package com.qfedu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qfedu.pojo.Provider;

public interface ProviderService {
	List<Provider> queryAll();
	int addProvider(Provider provider);
	int deleteProvider(Provider provider);
	int updateProvider(Provider provider);
	List<Provider> searchProvider(Provider provider);
}
