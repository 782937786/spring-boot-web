package com.fox.item.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fox.item.dao.template.mapper.EbaySiteMapper;
import com.fox.item.dao.template.model.EbaySite;

@Service
public class EbaySiteServiceImpl {

	@Autowired
	private EbaySiteMapper ebaySiteMapper;
	
	public EbaySite getEbaySiteList(Integer id){
		return ebaySiteMapper.selectByPrimaryKey(id);
	}
}
