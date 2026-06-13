package com.lifeos.service;

import com.lifeos.dto.CreateWorkspaceRequest;
import com.lifeos.entity.Workspace;

public interface WorkspaceService {
	Workspace createWorkspace(CreateWorkspaceRequest request);
}
