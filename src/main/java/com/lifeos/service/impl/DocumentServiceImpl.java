package com.lifeos.service.impl;

import org.springframework.stereotype.Service;

import com.lifeos.dto.CreateDocumentRequest;
import com.lifeos.entity.Document;
import com.lifeos.entity.Party;
import com.lifeos.entity.TimelineEvent;
import com.lifeos.entity.Workspace;
import com.lifeos.enums.EntityType;
import com.lifeos.enums.TimelineEventType;
import com.lifeos.repository.DocumentRepository;
import com.lifeos.repository.PartyRepository;
import com.lifeos.repository.TimelineEventRepository;
import com.lifeos.repository.WorkspaceRepository;
import com.lifeos.service.DocumentService;

import jakarta.transaction.Transactional;

@Service
public class DocumentServiceImpl implements DocumentService {
	
	private final DocumentRepository documentRepository;
	private final WorkspaceRepository workspaceRepository;
	private final PartyRepository partyRepository;
	private final TimelineEventRepository timelineEventRepository;
	
	public DocumentServiceImpl(
			DocumentRepository documentRepository,
			WorkspaceRepository workspaceRepository,
			PartyRepository partyRepository,
			TimelineEventRepository timelineEventRepository) {
		this.documentRepository = documentRepository;
		this.partyRepository = partyRepository;
		this.timelineEventRepository =timelineEventRepository;
		this.workspaceRepository = workspaceRepository;
	}
	
	
	@Transactional
	@Override
	public Document createDocument(CreateDocumentRequest request) {
		// TODO Auto-generated method stub
		Workspace workspace = workspaceRepository
				.findById(request.getWorkspaceId())
				.orElseThrow(()-> new RuntimeException("Workspace not found"));
		
		Party uploadedBy = partyRepository
				.findById(request.getUploadedByPartyId())
				.orElseThrow(()-> new RuntimeException("Paryy not found"));
		
		Document document = new Document();
		
		document.setTitle(request.getTitle());
		document.setContentType(request.getContentType());
		document.setFileSize(request.getFileSize());
		document.setStoragePath(request.getStoragePath());
		document.setDescription(request.getDescription());
		
		document.setWorkspace(workspace);
		document.setUploadedBy(uploadedBy);
		
		Document savedDocument = documentRepository.save(document);
		
		TimelineEvent event = new TimelineEvent();
		event.setWorkspace(workspace);
		event.setEventType(TimelineEventType.DOCUMENT_UPLOADED);
		event.setEntityType(EntityType.DOCUMENT);
		
		event.setEntityId(savedDocument.getId());
		event.setTitle("Uploaded document: "+ savedDocument.getTitle());
		
		timelineEventRepository.save(event);
		return savedDocument;
	}

}
