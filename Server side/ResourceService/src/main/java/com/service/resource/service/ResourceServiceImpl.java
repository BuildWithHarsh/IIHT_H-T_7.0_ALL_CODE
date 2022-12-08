package com.service.resource.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.service.resource.entity.Resource;

@Service
public class ResourceServiceImpl implements IResourceService {

	List<Resource> list = List.of(new Resource(1L, "harsh@iiht.com", "Harsh", "Java Dev", 1001L),
			new Resource(2L, "Jayant@iiht.com", "Jayant", "React Dev", 1002L),
			new Resource(3L, "Sujit@iiht.com", "Sujit", "Angular Dev", 1002L),
			new Resource(4L, "Meghana@iiht.com", "Meghana", "C Dev", 1003L),
			new Resource(5L, "Arjun@iiht.com", "Arjun", "Python Dev", 1003L),
			new Resource(6L, "Naman@iiht.com", "Naman", "JS Dev", 1004L),
			new Resource(7L, "Aman@iiht.com", "Aman", "NODEJS Dev", 1005L),
			new Resource(8L, "Gaurav@iiht.com", "Gaurav", "Game Dev", 1005L),
			new Resource(9L, "Vaishali@iiht.com", "Vaishali", "Web Dev", 1005L),
			new Resource(10L, "Anchal@iiht.com", "Anchal", "Full Stack Dev", 1006L),
			new Resource(11L, "Manish@iiht.com", "Manish", "BE Dev", 1006L));

	@Override
	public List<Resource> getResourcesForHr(Long hrID) {
		return list.stream().filter(resource -> resource.getResourceHRID().equals(hrID)).collect(Collectors.toList());
	}

}
