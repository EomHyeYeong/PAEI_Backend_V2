package com.example.paei_be.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name="party")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class ShortParty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long party_id;

    @ManyToOne                      // Comment 엔티티와 Article 엔티티를 다대일 관계로 설정
    @JoinColumn(name="user_id")     // 외래키 생성, Article 엔티티의 기본키(id)와 매핑
    private User user;              // 해당 댓글의 부모 게시글

    @OneToOne
    @JoinColumn(name="location_id")
    private Location location;

    @CreationTimestamp
    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column
    private Long categoryId;

    @Column
    private String party_title;

    @Column
    private String party_description;

    @Column
    private Long max_count;
}
