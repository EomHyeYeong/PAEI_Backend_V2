package com.example.paei_be.service;

import com.example.paei_be.dto.ShortPartyDto;
import com.example.paei_be.entity.ShortParty;
import com.example.paei_be.repository.ShortPartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartyService {
    @Autowired
    private ShortPartyRepository shortPartyRepository;

    public List<ShortParty> shortParties() {
        return shortPartyRepository.findAll();
    }

    public List<ShortParty> sortedParties(Long categoryId) {
        return shortPartyRepository.findByCategory(categoryId);
    }

    public List<ShortParty> searchParties(String partyTitle) {
        partyTitle = "%" + partyTitle + "%";
        return shortPartyRepository.findByPartyTitle(partyTitle);
    }

    public ShortParty createShortParty(ShortPartyDto dto) {
        ShortParty party = dto.toEntity();
        return shortPartyRepository.save(party);
    }

    public ShortParty deleteShortParty(Long partyId) {
        ShortParty target = shortPartyRepository.findById(partyId).orElse(null);

        if (target == null)
            return null;
        shortPartyRepository.delete(target);

        return target;
    }
}
