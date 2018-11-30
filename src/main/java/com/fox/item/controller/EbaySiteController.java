package com.fox.item.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fox.item.dao.template.model.EbaySite;
import com.fox.item.service.EbaySiteServiceImpl;

@RestController
@RequestMapping("/ebaySite")
public class EbaySiteController {

	@Autowired
	private EbaySiteServiceImpl ebaySiteService;
	
	@GetMapping("/getEbaySites")
	public EbaySite getEbaySites(@RequestParam Integer id){
		return ebaySiteService.getEbaySiteList(id);
	}
}
