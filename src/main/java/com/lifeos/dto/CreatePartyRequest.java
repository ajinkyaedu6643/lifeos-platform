package com.lifeos.dto;

import com.lifeos.enums.PartyType;

public class CreatePartyRequest {
	
	private String name;
	private PartyType type;
	private String email;
	private String phone;
	private String notes;
	private Long workspaceId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PartyType getType() {
		return type;
	}
	public void setType(PartyType type) {
		this.type = type;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public Long getWorkspaceId() {
		return workspaceId;
	}
	public void setWorkspaceId(Long workspaceId) {
		this.workspaceId = workspaceId;
	}
	
	
}
