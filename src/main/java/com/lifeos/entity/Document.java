/**
 * 
 */
package com.lifeos.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * 
 */

@Entity
@Table(name = "documents")
public class Document {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String title;
	private String contentType;
	private Long fileSize;
	private String storagePath;
	private String checksum;
	private String description;
	private LocalDateTime uploadAt = LocalDateTime.now();

	@ManyToOne
	private Workspace workspace;
	
	@ManyToOne
	private Party uploadedBy;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public Long getFileSize() {
		return fileSize;
	}

	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	public String getStoragePath() {
		return storagePath;
	}

	public void setStoragePath(String storagePath) {
		this.storagePath = storagePath;
	}

	public String getChecksum() {
		return checksum;
	}

	public void setChecksum(String checksum) {
		this.checksum = checksum;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getUploadAt() {
		return uploadAt;
	}

	public void setUploadAt(LocalDateTime uploadAt) {
		this.uploadAt = uploadAt;
	}

	public Workspace getWorkspace() {
		return workspace;
	}

	public void setWorkspace(Workspace workspace) {
		this.workspace = workspace;
	}

	public Party getUploadedBy() {
		return uploadedBy;
	}

	public void setUploadedBy(Party uploadedBy) {
		this.uploadedBy = uploadedBy;
	}
	
	
}
