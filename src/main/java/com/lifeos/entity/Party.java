package com.lifeos.entity;

import java.time.LocalDateTime;

import com.lifeos.enums.PartyType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="parties")
public class Party {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@Enumerated(EnumType.STRING)
	private PartyType type;
	
	private String email;
	
	private String phone;
	
	private String notes;
	
	private LocalDateTime createdAt = LocalDateTime.now();
	
	@ManyToOne
	@JoinColumn(name = "workspace_id")
	private Workspace workspace;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public Workspace getWorkspace() {
		return workspace;
	}

	public void setWorkspace(Workspace workspace) {
		this.workspace = workspace;
	}
	
	
}
