package com.apsidiscount.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.ResponseStatus;


import com.apsidiscount.service.ClientInconnuException;
import com.apsidiscount.service.ClientService;

public class ClientController {
	@Autowired
	private ClientService clientService;
	
	@ExceptionHandler(ClientInconnuException.class)
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public String handleArticleInconnuException(ClientInconnuException e, Model model) {
		model.addAttribute("exception", e);
		return "error";
	}
	


}
