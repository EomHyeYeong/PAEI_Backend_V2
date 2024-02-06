package com.example.paei_be.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class PartyUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userPartyId;

    @ManyToOne
    @JoinColumn(name="user_Id")
    private User userId;

    @ManyToOne
    @JoinColumn(name = "party_id")
    private Party partyId;

    public PartyUser(Party party, User user) {
        partyId = party;
        userId = user;
    }

    // 파티에 참가
    public static PartyUser participantParty(Party party, User user) {
        return new PartyUser(party, user);
    }
}
