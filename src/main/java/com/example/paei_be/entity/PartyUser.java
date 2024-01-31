package com.example.paei_be.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
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
}
