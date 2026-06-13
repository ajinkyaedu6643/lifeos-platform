package com.lifeos.entity;

import java.time.LocalDateTime;
import java.util.List;

import com.lifeos.enums.WorkspaceType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="workspaces")
public class Workspace {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	
	@Enumerated(EnumType.STRING)
	private WorkspaceType type;
	private LocalDateTime createdAt = LocalDateTime.now();
	
	@ManyToOne
	private User owner;
	
	@OneToMany(mappedBy = "workspace")
	private List<WorkspaceMember> members;
	
	@ManyToOne
	@JoinColumn(name = "created_by")
	private User createdBy;
	// Getter and Setters
	
	public Long getId() {
		return id;
	}
	public List<WorkspaceMember> getMembers() {
		return members;
	}
	public void setMembers(List<WorkspaceMember> members) {
		this.members = members;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
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
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public User getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}
	
	
	
	
}
