package com.lifeos.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.lifeos.enums.WorkspaceRole;

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
@Table(name="workspace_members")
public class WorkspaceMember {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="workspace_id")
	@JsonBackReference
	private Workspace workspace;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	@JsonBackReference
	private User user;
	
	@Enumerated(EnumType.STRING)
	private WorkspaceRole role;
	
	//Getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Workspace getWorkspace() {
		return workspace;
	}

	public void setWorkspace(Workspace workspace) {
		this.workspace = workspace;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public WorkspaceRole getRole() {
		return role;
	}

	public void setRole(WorkspaceRole role) {
		this.role = role;
	}
	
	
	
}
