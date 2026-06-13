package com.lifeos.dto;

import com.lifeos.enums.WorkspaceType;

public class CreateWorkspaceRequest {
	private String name;
	private String description;
	private WorkspaceType type;
	private Long ownerUserId;
	
	// Getter Setters 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public WorkspaceType getType() {
		return type;
	}
	public void setType(WorkspaceType type) {
		this.type = type;
	}
	public Long getOwnerUserId() {
		return ownerUserId;
	}
	public void setOwnerUserId(Long ownerUserId) {
		this.ownerUserId = ownerUserId;
	}
	
	
	

}
