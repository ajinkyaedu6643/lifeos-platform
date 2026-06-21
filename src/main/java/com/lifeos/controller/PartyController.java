package com.lifeos.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lifeos.dto.CreatePartyRequest;
import com.lifeos.entity.Party;
import com.lifeos.service.impl.PartyServiceImpl;

@RestController
@RequestMapping("/api/parties")
public class PartyController {
	
	private final PartyServiceImpl partyServiceImpl;
	
	
	public PartyController(PartyServiceImpl partyServiceImpl) {
		this.partyServiceImpl = partyServiceImpl;
	}
	
	@PostMapping
	public ResponseEntity<Party> createParty(@RequestBody CreatePartyRequest request){
		return ResponseEntity.ok(
				partyServiceImpl.createParty(request));
	}
	@GetMapping
	public ResponseEntity<List<Party>> showParties(){
		
		List<Party> allParties = partyServiceImpl.getAllParties();
		
		return ResponseEntity.ok(allParties);
				
	}
	
}
