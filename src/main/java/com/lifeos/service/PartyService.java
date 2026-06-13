package com.lifeos.service;

import java.util.List;

import com.lifeos.dto.CreatePartyRequest;
import com.lifeos.entity.Party;

public interface PartyService {
	
	Party createParty(CreatePartyRequest request);
	List<Party> getAllParties();
}
