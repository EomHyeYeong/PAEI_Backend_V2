package com.example.paei_be.service;

import com.example.paei_be.dto.PartyDto;
import com.example.paei_be.dto.UserDto;
import com.example.paei_be.entity.Party;
import com.example.paei_be.entity.PartyUser;
import com.example.paei_be.entity.User;
import com.example.paei_be.repository.PartyRepository;
import com.example.paei_be.repository.PartyUserRepository;
import com.example.paei_be.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartyUserService {
    @Autowired
    private PartyUserRepository partyUserRepository;
    @Autowired
    private PartyRepository partyRepository;
    @Autowired
    private UserRepository userRepository;

    public List<Party> searchParticipantParty(Long userId) {
        List<Party> partyList = partyUserRepository.findByUserId(userId);
        return partyList;
    }

    public List<User> searchParticipantUser(Long partyId) {
        List<User> userList = partyUserRepository.findByPartyId(partyId);
        return userList;
    }

//    public PartyDto participate(Long partyId, UserDto dto) {
//        // partyUser 테이블에 파티와 사용자 정보 삽입
//        //변환
//        Party party = partyRepository.findById(partyId).orElse(null);
//        User user = dto.toEntity(dto);
//        PartyUser partyUser = PartyUser.participantParty(party, dto);

        // party의 participantCount++

//        return null;
//    }
}
