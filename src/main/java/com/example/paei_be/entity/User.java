package com.example.paei_be.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="User_Table")
@NoArgsConstructor
@ToString
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String account;

//    @OneToMany(mappedBy = "user")
//    private List<ShortParty> parties = new ArrayList<>();
//
//    // 파티 추가 메서드
//    public void addParty(ShortParty party) {
//        this.parties.add(party);
//    }
}
