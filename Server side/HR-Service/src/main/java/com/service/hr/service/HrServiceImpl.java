package com.service.hr.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.service.hr.entity.HR;


@Service
public class HrServiceImpl implements IhrService {
	
	List<HR> list = List.of(
			new HR(1001L , "Arjun" , "1234278568743"),
			new HR(1002L , "Sameer" , "8732487235487"),
			new HR(1003L , "Vaishali" , "6348623874676"),
			new HR(1004L , "Aakash" , "5634572534755"),
			new HR(1005L , "Yash" , "1237683667627"),
			new HR(1006L , "Kamal" , "2764872164868"));

	@Override
	public HR getHR(Long id) {
		// TODO Auto-generated method stub
		
		return list.stream().filter(hr -> hr.getHRID().equals(id)).findAny().orElse(null);
		
	}

}
