package com.example.paei_be.service;

import com.example.paei_be.entity.Party;
import com.example.paei_be.entity.User;
import com.example.paei_be.repository.PartyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartyUserService {
    @Autowired
    private PartyUserRepository partyUserRepository;

    public List<Party> searchParticipantParty(Long userId) {
        List<Party> partyList = partyUserRepository.findByUserId(userId);
        return partyList;
    }

    public List<User> searchParticipantUser(Long partyId) {
        List<User> userList = partyUserRepository.findByPartyId(partyId);
        return userList;
    }
}
