package com.spring.kiosk_butcher_shop.user;

import lombok.Getter;

@Getter
public class UserRequestDto {
    private String phoneNum;
    private String username;
    private Long reservesPoint;
}
