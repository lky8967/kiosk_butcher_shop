package com.spring.kiosk_butcher_shop.product;

import javax.persistence.*;

@Entity
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    @Column(nullable = false)
    private String productName;

    //원산지
    @Column(nullable = false)
    private String productOrigin;

    // 고기 카테고리
    @Column(nullable = false)
    private String MeatCategory;

    // 가격
    @Column(nullable = false)
    private Long productPrice;

    // 세일 가격
    @Column
    private Long productDiscountPrice;


}
