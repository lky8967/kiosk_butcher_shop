package com.spring.kiosk_butcher_shop.user;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Table(name ="users")
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column
    private String phoneNum;

    // 적립금
    @Column
    private Long reservesPoint;


    public static void save(String username, String phoneNum, Long reservesPoint) {

        User user = new User();
        user.username = username;
        user.phoneNum = phoneNum;
        user.reservesPoint = reservesPoint;

    }
}

