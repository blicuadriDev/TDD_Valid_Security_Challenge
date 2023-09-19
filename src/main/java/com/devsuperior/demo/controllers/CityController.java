package com.devsuperior.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.demo.services.CityService;

@RestController
@RequestMapping(value ="/cities")
public class CityController {
	
	@Autowired
	private CityService service;

}
