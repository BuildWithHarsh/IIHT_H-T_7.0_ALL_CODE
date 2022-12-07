package com.service.hr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.hr.entity.HR;
import com.service.hr.service.IhrService;

@RestController
@RequestMapping("/hr")
public class HrController {
	
	@Autowired
	public IhrService hrService;
	
	
	@GetMapping("/{HrId}")
	public HR getHr(@PathVariable("HrId") Long id) {
		return hrService.getHR(id);
	}

}
