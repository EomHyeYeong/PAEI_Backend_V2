package com.example.paei_be.api;

import com.example.paei_be.dto.ShortPartyDto;
import com.example.paei_be.entity.ShortParty;
import com.example.paei_be.service.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PartyApiController {
    @Autowired
    private PartyService partyService;

    // 전체 파티 조회
    @GetMapping("/short_party")
    public ResponseEntity<List<ShortParty>> shortParties() {
        // 서비스에서 party 목록 조회하기
        List<ShortParty> parties = partyService.shortParties();
        return ResponseEntity.status(HttpStatus.OK).body(parties);
    }

    // 카테고리별 정렬
    @GetMapping("/short_party/category/{categoryId}")
    public ResponseEntity<List<ShortParty>> sortedParties(@PathVariable Long categoryId) {
        List<ShortParty> parties = partyService.sortedParties(categoryId);
        return ResponseEntity.status(HttpStatus.OK).body(parties);
    }

    // 파티 이름으로 검색
    @GetMapping("/short_party/search/{partyTitle}")
    public ResponseEntity<List<ShortParty>> searchParties(@PathVariable String partyTitle) {
        List<ShortParty> parties = partyService.searchParties(partyTitle);
        return ResponseEntity.status(HttpStatus.OK).body(parties);
    }

    // 파티 생성
    @PostMapping("/short_party")
    public ResponseEntity<ShortParty> createShortParty(@RequestBody ShortPartyDto dto) {
        ShortParty created = partyService.createShortParty(dto);
        return ResponseEntity.status(HttpStatus.OK).body(created);
    }

    // 파티 삭제
    @DeleteMapping("/short_party/{party_id}")
    public ResponseEntity<ShortParty> deleteShortParty(@PathVariable Long party_id) {
        ShortParty deleted = partyService.deleteShortParty(party_id);
        return ResponseEntity.status(HttpStatus.OK).body(deleted);
    }
}
