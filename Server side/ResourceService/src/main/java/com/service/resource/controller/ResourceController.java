package com.service.resource.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.resource.entity.Resource;
import com.service.resource.service.IResourceService;

@RestController
@RequestMapping("/resource")
public class ResourceController {
	
	@Autowired
	public IResourceService resourceService;
	
	@GetMapping("/hr/{id}")
	public List<Resource> getResourcesForHr(@PathVariable("id") Long id){
		return resourceService.getResourcesForHr(id);
	}

}
