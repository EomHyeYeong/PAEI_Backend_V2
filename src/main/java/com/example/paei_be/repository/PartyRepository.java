package com.example.paei_be.repository;

import com.example.paei_be.entity.Party;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public interface PartyRepository extends CrudRepository<Party, Long> {
    @Override
    ArrayList<Party> findAll();

    @Query(value="SELECT * FROM party WHERE category_id = :categoryId", nativeQuery = true)
    List<Party> findByCategory(Long categoryId);

    @Query(value="SELECT * FROM party WHERE party_title LIKE :partyTitle", nativeQuery = true)
    List<Party> findByPartyTitle(String partyTitle);
}
