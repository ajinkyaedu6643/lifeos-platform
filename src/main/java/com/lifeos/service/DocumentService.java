package com.lifeos.service;

import com.lifeos.dto.CreateDocumentRequest;
import com.lifeos.entity.Document;

public interface DocumentService {
	Document createDocument(CreateDocumentRequest request);
}
