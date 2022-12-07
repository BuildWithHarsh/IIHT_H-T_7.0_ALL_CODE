package com.service.hr.entity;

import java.util.ArrayList;
import java.util.List;

public class HR {
	private Long HRID;
	private String name;
	private String phone;
	private List<Resource> resource = new ArrayList<>();

	public Long getHRID() {
		return HRID;
	}

	public void setHRID(Long hRID) {
		HRID = hRID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Resource> getResource() {
		return resource;
	}

	public void setResource(List<Resource> resource) {
		this.resource = resource;
	}

	public HR(Long hRID, String name, String phone, List<Resource> resource) {
		super();
		HRID = hRID;
		this.name = name;
		this.phone = phone;
		this.resource = resource;
	}

	public HR(Long hRID, String name, String phone) {
		super();
		HRID = hRID;
		this.name = name;
		this.phone = phone;
	}

	public HR() {
		super();
		// TODO Auto-generated constructor stub
	}

}
