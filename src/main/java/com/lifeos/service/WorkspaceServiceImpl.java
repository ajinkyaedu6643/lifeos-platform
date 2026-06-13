package com.lifeos.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.lifeos.dto.CreateWorkspaceRequest;
import com.lifeos.entity.User;
import com.lifeos.entity.Workspace;
import com.lifeos.entity.WorkspaceMember;
import com.lifeos.enums.WorkspaceRole;
import com.lifeos.repository.UserRepository;
import com.lifeos.repository.WorkspaceMemberRepository;
import com.lifeos.repository.WorkspaceRepository;

import jakarta.transaction.Transactional;

@Service
public class WorkspaceServiceImpl implements WorkspaceService {
	
	private final WorkspaceRepository workspaceRepository;
	private final WorkspaceMemberRepository workspaceMemberRepository;
	private final UserRepository userRepository;
	
	public WorkspaceServiceImpl(
			WorkspaceRepository workspaceRepository,
			WorkspaceMemberRepository workspaceMemberRepository,
			UserRepository userRepository) {
		this.workspaceRepository = workspaceRepository;
		this.workspaceMemberRepository = workspaceMemberRepository;
		this.userRepository = userRepository;
	}
	
	@Override
	@Transactional
	public Workspace createWorkspace(CreateWorkspaceRequest request) {
		// TODO Auto-generated method stub
		Optional <User> userOptional = userRepository.findById(request.getOwnerUserId());
		
		if (userOptional.isEmpty()) {
			throw new RuntimeException("User not found");
		}
		
		User owner = userOptional.get();
		
		Workspace workspace = new Workspace();
		
		workspace.setName(request.getName());
		workspace.setDescription(request.getDescription());
		workspace.setType(request.getType());
		
		Workspace savedWorkspace = workspaceRepository.save(workspace);
		
		WorkspaceMember member = new WorkspaceMember();
		
		member.setWorkspace(savedWorkspace);
		member.setUser(owner);
		member.setRole(WorkspaceRole.OWNER);
		
		workspaceMemberRepository.save(member);
		return savedWorkspace;
	}

}
