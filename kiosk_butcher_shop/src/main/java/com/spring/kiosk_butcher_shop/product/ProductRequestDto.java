package com.spring.kiosk_butcher_shop.product;

import lombok.Getter;

@Getter
public class ProductRequestDto {
    private String productName;
    //원산지
    private String productOrigin;
    // 고기 카테고리
    private String meatCategory;
    // 가격
    private String productPrice;
    // 세일 가격
    private String productDiscountPrice;
}
