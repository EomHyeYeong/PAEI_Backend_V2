package com.example.paei_be.dto;

import com.example.paei_be.entity.Party;
import com.example.paei_be.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
public class PartyDto {
    private Long partyId;
    private Long partyType;
    private User createdBy;
    private Timestamp createdAt;
    private Long partyCategory;
    private String partyTitle;
    private String partyDescription;
    private int maxCount;
    private int participantCount;


    public Party toEntity() {
        return new Party(
                partyId, partyType, createdBy, createdAt, partyCategory,
                partyTitle, partyDescription, maxCount, participantCount
        );
    }
}
