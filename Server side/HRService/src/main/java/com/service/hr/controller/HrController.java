package com.service.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.service.hr.entity.HR;
import com.service.hr.entity.Resource;
import com.service.hr.service.IhrService;

@RestController
@RequestMapping("/hr")
public class HrController {

	@Autowired
	public IhrService hrService;

	@Autowired
	public RestTemplate restTemplate;

	@GetMapping("/{HrId}")
	public HR getHr(@PathVariable("HrId") Long id) {
		HR hr = hrService.getHR(id);
		List resources = this.restTemplate.getForObject("http://localhost:6000/resource/hr/" + id, List.class);
		hr.setResource(resources);
		return hr;
	}

}
