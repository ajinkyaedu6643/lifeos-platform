package com.lifeos.dto;

public class CreateDocumentRequest {
	private String title;
	private String contentType;
	private Long fileSize;
	private String storagePath;
	private String description;
	private Long workspaceId;
	private Long uploadedByPartyId;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getWorkspaceId() {
		return workspaceId;
	}
	public void setWorkspaceId(Long workspaceId) {
		this.workspaceId = workspaceId;
	}
	public Long getUploadedByPartyId() {
		return uploadedByPartyId;
	}
	public void setUploadedByPartyId(Long uploadedByPartyId) {
		this.uploadedByPartyId = uploadedByPartyId;
	}
	
	
}
