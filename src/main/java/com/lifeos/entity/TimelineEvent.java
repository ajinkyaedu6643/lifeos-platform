package com.lifeos.entity;

import java.time.LocalDateTime;

import com.lifeos.enums.EntityType;
import com.lifeos.enums.TimelineEventType;

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
@Table(name="timeline_events")
public class TimelineEvent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private TimelineEventType eventType;
	
	private String title;
	private String description;
	private Long entityId;
	
	@Enumerated(EnumType.STRING)
	private EntityType entityType;
	
	private LocalDateTime createdAt = LocalDateTime.now();
	
	@ManyToOne
	@JoinColumn(name="workspace_id")
	private Workspace workspace;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TimelineEventType getEventType() {
		return eventType;
	}

	public void setEventType(TimelineEventType eventType) {
		this.eventType = eventType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getEntityId() {
		return entityId;
	}

	public void setEntityId(Long entityId) {
		this.entityId = entityId;
	}

	public EntityType getEntityType() {
		return entityType;
	}

	public void setEntityType(EntityType entityType) {
		this.entityType = entityType;
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
