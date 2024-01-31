package com.example.paei_be.api;

import com.example.paei_be.entity.Party;
import com.example.paei_be.entity.User;
import com.example.paei_be.service.PartyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PartyUserApiController {
    @Autowired
    private PartyUserService partyUserService;

    @GetMapping("/participant/party/{userId}")
    public ResponseEntity<List<Party>> searchParticipantParty(@PathVariable Long userId) {
        // 유저가 참가한 파티목록 조회
        List<Party> participantPartyies = partyUserService.searchParticipantParty(userId);
        return ResponseEntity.status(HttpStatus.OK).body(participantPartyies);
    }

    @GetMapping("/participant/user/{partyId}")
    public ResponseEntity<List<User>> searchParticipantUser(@PathVariable Long partyId) {
        List<User> participantUsers = partyUserService.searchParticipantUser(partyId);
        return ResponseEntity.status(HttpStatus.OK).body(participantUsers);
    }
}
