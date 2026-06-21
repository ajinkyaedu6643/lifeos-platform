package com.lifeos.service;

import java.util.List;

import com.lifeos.dto.CreateDocumentRequest;
import com.lifeos.entity.Document;

public interface DocumentService {
	Document createDocument(CreateDocumentRequest request);
	List<Document> getAllDocuments();
	Document getDocumentById(Long id);
}
