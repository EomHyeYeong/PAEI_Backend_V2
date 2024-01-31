package com.example.paei_be.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class Party {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long partyId;

    @Column
    private Long partyType;

    @ManyToOne
    @JoinColumn(name="created_by")
    private User createdBy;

    @CreationTimestamp
    @Column // 파티 생성 날짜
    private Timestamp createdAt;

    @Column // 같이배달.같이타요.같이해요
    private Long categoryId;

    @Column // 파티 이름
    private String partyTitle;

    @Column // 파티 설명
    private String partyDescription;

    @Column // 파티 정원
    private int maxCount;

    //@Column // 현재 참여 인원
    @ColumnDefault("0")
    private int participantCount;
}
