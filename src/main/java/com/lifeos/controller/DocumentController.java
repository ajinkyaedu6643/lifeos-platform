package com.lifeos.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lifeos.dto.CreateDocumentRequest;
import com.lifeos.entity.Document;
import com.lifeos.service.DocumentService;

@RestController
@RequestMapping("/api/documents")
public class DocumentController {
	private final DocumentService documentService;
	
	public DocumentController(DocumentService documentService) {
		this.documentService = documentService;
	}
	
	@PostMapping
	public ResponseEntity<Document> createDocument(
			@RequestBody CreateDocumentRequest request){
		return ResponseEntity.ok(
				documentService.createDocument(request));
	}
	
}
