package com.lifeos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lifeos.entity.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
	
}
