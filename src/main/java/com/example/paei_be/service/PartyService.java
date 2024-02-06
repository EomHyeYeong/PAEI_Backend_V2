package com.example.paei_be.service;

import com.example.paei_be.dto.PartyDto;
import com.example.paei_be.entity.Party;
import com.example.paei_be.repository.PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartyService {
    @Autowired
    private PartyRepository partyRepository;

    public List<Party> parties() {
        return partyRepository.findAll();
    }

    public List<Party> sortedParties(Long categoryId) {
        return partyRepository.findAllByCategory(categoryId);
    }

    public List<Party> searchParties(String partyTitle) {
        partyTitle = "%" + partyTitle + "%";
        return partyRepository.findAllByPartyTitle(partyTitle);
    }

    public Party createShortParty(PartyDto dto) {
        Party party = dto.toEntity();
        return partyRepository.save(party);
    }

    public Party deleteShortParty(Long partyId) {
        Party target = partyRepository.findById(partyId).orElse(null);

        if (target == null)
            return null;
        partyRepository.delete(target);

        return target;
    }
}
