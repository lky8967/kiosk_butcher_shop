package com.spring.kiosk_butcher_shop.user;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity @NoArgsConstructor
@Table(name ="users")
public class User {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String phoneNum;

    // 적립금
    @Column(nullable = false)
    private Long reservesPoint;

    public User(String username, String phoneNum, Long reservesPoint){
        this.username = username;
        this.phoneNum = phoneNum;
        this.reservesPoint = reservesPoint;
    }

}

