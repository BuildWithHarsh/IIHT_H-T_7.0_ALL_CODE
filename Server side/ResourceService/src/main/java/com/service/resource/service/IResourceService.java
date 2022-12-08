package com.service.resource.service;

import java.util.List;

import com.service.resource.entity.Resource;

public interface IResourceService {
	
	public List<Resource> getResourcesForHr(Long hrID);

}
