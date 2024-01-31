package com.example.paei_be.repository;

import com.example.paei_be.entity.Party;
import com.example.paei_be.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PartyUserRepository extends CrudRepository<Party, Long> {
    @Query(value="SELECT * FROM party_user WHERE user_id = :userId", nativeQuery = true)
    List<Party> findByUserId(Long userId);

    @Query(value="SELECT * FROM party_user WHERE party_id = :partyId", nativeQuery = true)
    List<User> findByPartyId(Long partyId);
}
