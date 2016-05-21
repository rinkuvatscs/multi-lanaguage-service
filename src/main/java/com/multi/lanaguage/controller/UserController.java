package com.multi.lanaguage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.lanaguage.message.MessageByLocaleService;

@RestController
public class UserController {

	
	@Autowired
	MessageByLocaleService messageByLocaleService;
	
	@RequestMapping("/")
	public String lanaguageChange() {
		System.out.println("User Controller run");
		return  messageByLocaleService.getMessage("user.login.invalid");
	}
}
