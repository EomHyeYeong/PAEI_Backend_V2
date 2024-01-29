package com.example.paei_be.dto;

import com.example.paei_be.entity.Location;
import com.example.paei_be.entity.ShortParty;
import com.example.paei_be.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
public class ShortPartyDto {
    private Long party_id;
    private String party_title;
    private String party_description;
    private User user_id;
    private Long max_count;
    private Long partyCategory;
    private Timestamp createdAt;
    private Location location;


    public ShortParty toEntity() {
        return new ShortParty(party_id, user_id, location, createdAt, partyCategory, party_title, party_description, max_count);
    }
}
