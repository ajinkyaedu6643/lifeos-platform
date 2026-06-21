package com.lifeos.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lifeos.dto.CreateWorkspaceRequest;
import com.lifeos.entity.Workspace;
import com.lifeos.service.impl.WorkspaceServiceImpl;

@RestController
@RequestMapping("/api/workspaces")
public class WorkspaceController {
	private final WorkspaceServiceImpl workspaceServiceImpl;
	
	public WorkspaceController(WorkspaceServiceImpl workspaceServiceImpl) {
		this.workspaceServiceImpl = workspaceServiceImpl;
	}
	
	@PostMapping
	public ResponseEntity<Workspace> createWorkspace(
			@RequestBody CreateWorkspaceRequest workspace){
		return ResponseEntity.ok(
				workspaceServiceImpl.createWorkspace(workspace));
	}
}
