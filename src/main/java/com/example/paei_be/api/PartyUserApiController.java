package com.example.paei_be.api;

import com.example.paei_be.dto.PartyDto;
import com.example.paei_be.dto.UserDto;
import com.example.paei_be.entity.Party;
import com.example.paei_be.entity.User;
import com.example.paei_be.service.PartyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PartyUserApiController {
    @Autowired
    private PartyUserService partyUserService;

    @GetMapping("/participant/party/{userId}") // 유저가 참여한 파티목록 조회
    public ResponseEntity<List<Party>> searchParticipantParty(@PathVariable Long userId) {
        List<Party> participantPartyies = partyUserService.searchParticipantParty(userId);
        return ResponseEntity.status(HttpStatus.OK).body(participantPartyies);
    }

    @GetMapping("/participant/user/{partyId}") // 파티의 참여자 목록 조회
    public ResponseEntity<List<User>> searchParticipantUser(@PathVariable Long partyId) {
        List<User> participantUsers = partyUserService.searchParticipantUser(partyId);
        return ResponseEntity.status(HttpStatus.OK).body(participantUsers);
    }

    @PostMapping("/party/participant/{partyId}")
    public ResponseEntity<PartyDto> participate(@PathVariable Long partyId,
                                             @RequestBody UserDto dto) {
        PartyDto createdDto = partyUserService.participate(partyId, dto);
        return ResponseEntity.status(HttpStatus.OK).body(createdDto);
    }
}
