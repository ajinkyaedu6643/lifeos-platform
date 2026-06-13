package com.lifeos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lifeos.entity.WorkspaceMember;
@Repository
public interface WorkspaceMemberRepository extends JpaRepository<WorkspaceMember, Long> {

}
