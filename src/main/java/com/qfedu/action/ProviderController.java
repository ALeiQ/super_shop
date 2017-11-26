package com.qfedu.action;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qfedu.pojo.Provider;
import com.qfedu.service.ProviderService;

@Controller
public class ProviderController {

	@Autowired(required = false)
	private ProviderService service;
	@RequestMapping("/queryAll")
	public String queryAll(Map<String, Object> map,@RequestParam(name = "pageNum", required = true, defaultValue = "0") Integer pageNum,@RequestParam(name = "pageSize", required = true, defaultValue = "0") Integer pageSize) {
		List<Provider> list=null;
		PageInfo<Provider> pageInfo=null;
		if(pageNum==0||pageSize==0) {
			PageHelper.startPage(1,4);
			list=service.queryAll();
		}else {
			PageHelper.startPage(pageNum, pageSize);
			list=service.queryAll();
		}
		pageInfo=new PageInfo<Provider>(list);
		map.put("providers", list);
		map.put("pageInfo", pageInfo);
		return "providerAdmin";
	}
	@RequestMapping("/saveprovider")
	public String saveProvider(Provider provider) {
		service.addProvider(provider);
		return "redirect:queryAll";
	}
	@RequestMapping("/deleteorupdate")
	public String deleteOrUpdate(Provider provider,String button) {
		if("修改".equals(button)) {
			service.updateProvider(provider);
		}else {
			service.deleteProvider(provider);
		}
		return "redirect:queryAll";
	}
	@RequestMapping("/searchprovider")
	public String searchProvider(Provider provider,Map<String , Object> map,@RequestParam(name = "pageNum", required = true, defaultValue = "0") Integer pageNum,@RequestParam(name = "pageSize", required = true, defaultValue = "0") Integer pageSize) {
		List<Provider> list=null;
		PageInfo<Provider> pageInfo=null;
		if(pageNum==0||pageSize==0) {
			PageHelper.startPage(1,4);
			list=service.searchProvider(provider);
		}else {
			PageHelper.startPage(pageNum, pageSize);
			list=service.searchProvider(provider);
		}
		pageInfo=new PageInfo<Provider>(list);
		map.put("providers", list);
		map.put("pageInfo", pageInfo);
		return "providerAdmin";
	}
}
