package com.service.resource.entity;

public class Resource {

	private Long resourceId;
	private String resourceEmail;
	private String resourceName;
	private String resourceDomain;

	private Long resourceHRID;

	public String getResourceDomain() {
		return resourceDomain;
	}

	public void setResourceDomain(String resourceDomain) {
		this.resourceDomain = resourceDomain;
	}

	public Long getResourceId() {
		return resourceId;
	}

	public void setResourceId(Long resourceId) {
		this.resourceId = resourceId;
	}

	public String getResourceEmail() {
		return resourceEmail;
	}

	public void setResourceEmail(String resourceEmail) {
		this.resourceEmail = resourceEmail;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public Long getResourceHRID() {
		return resourceHRID;
	}

	public void setResourceHRID(Long resourceHRID) {
		this.resourceHRID = resourceHRID;
	}

	public Resource() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Resource(Long resourceId, String resourceEmail, String resourceName, String resourceDomain,
			Long resourceHRID) {
		super();
		this.resourceId = resourceId;
		this.resourceEmail = resourceEmail;
		this.resourceName = resourceName;
		this.resourceDomain = resourceDomain;
		this.resourceHRID = resourceHRID;
	}

}
