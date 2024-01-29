package com.example.paei_be.repository;

import com.example.paei_be.entity.ShortParty;
import com.example.paei_be.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public interface ShortPartyRepository extends CrudRepository<ShortParty, Long> {
    @Override
    ArrayList<ShortParty> findAll();

    // 특정 게시글의 모든 댓글 조회 (@Query 어노테이션을 이용)
//    @Query(value="SELECT * FROM comment WHERE article_id = :articleId", nativeQuery = true)
//    List<Comment> findByArticleId(Long articleId);
    @Query(value="SELECT * FROM party WHERE category_id = :categoryId", nativeQuery = true)
    List<ShortParty> findByCategory(Long categoryId);

    @Query(value="SELECT * FROM party WHERE party_title LIKE :partyTitle", nativeQuery = true)
    List<ShortParty> findByPartyTitle(String partyTitle);
}
