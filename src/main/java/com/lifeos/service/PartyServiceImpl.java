package com.lifeos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lifeos.dto.CreatePartyRequest;
import com.lifeos.entity.Party;
import com.lifeos.entity.TimelineEvent;
import com.lifeos.entity.Workspace;
import com.lifeos.enums.EntityType;
import com.lifeos.enums.TimelineEventType;
import com.lifeos.repository.PartyRepository;
import com.lifeos.repository.TimelineEventRepository;
import com.lifeos.repository.WorkspaceRepository;

import jakarta.transaction.Transactional;

@Service
public class PartyServiceImpl implements PartyService {
	
	private final PartyRepository partyRepository;
	private final WorkspaceRepository workspaceRepository;
	private final TimelineEventRepository timelineEventRepository;
	
	public PartyServiceImpl(
			PartyRepository partyRepository,
			WorkspaceRepository workspaceRepository,
			TimelineEventRepository timelineEventRepository) {
		this.partyRepository = partyRepository;
		this.timelineEventRepository = timelineEventRepository;
		this.workspaceRepository = workspaceRepository;
	}
	

	@Override
	@Transactional
	public Party createParty(CreatePartyRequest request) {
		// TODO Auto-generated method stub
		Workspace workspace = workspaceRepository.findById(request.getWorkspaceId())
				.orElseThrow(()-> new RuntimeException("Workspace not found"));
		
		Party party = new Party();
		
		party.setName(request.getName());
		party.setType(request.getType());
		party.setEmail(request.getEmail());
		party.setPhone(request.getPhone());
		party.setName(request.getNotes());
		party.setWorkspace(workspace);
		
		Party savedParty = partyRepository.save(party);
		
		TimelineEvent event = new TimelineEvent();
		
		event.setWorkspace(workspace);
		event.setEventType(
				TimelineEventType.PARTY_CREATED);
		
		event.setTitle("Party Created");
		
		event.setDescription(
				"Created Party: "+savedParty.getName());
		
		event.setEntityId(savedParty.getId());
		event.setEntityType(EntityType.PARTY);
		
		timelineEventRepository.save(event);
		
		return savedParty;
	}


	@Override
	public List<Party> getAllParties() {
		// TODO Auto-generated method stub
		return partyRepository.findAll();
	}

}
