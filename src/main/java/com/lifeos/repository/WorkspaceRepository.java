package com.lifeos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lifeos.entity.Workspace;

public interface WorkspaceRepository extends JpaRepository<Workspace, Long> {

}
