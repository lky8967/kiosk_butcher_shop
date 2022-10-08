package com.spring.kiosk_butcher_shop.product;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity @NoArgsConstructor
@Getter
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
    private String meatCategory;

    // 가격
    @Column(nullable = false)
    private String productPrice;

    // 세일 가격
    @Column
    private String productDiscountPrice;


    public Product(String productName, String productOrigin, String meatCategory, String productPrice, String productDiscountPrice) {
        this.productName = productName;
        this.meatCategory = meatCategory;
        this.productOrigin = productOrigin;
        this.productPrice = productPrice;
        this.productDiscountPrice = productDiscountPrice;
    }

    public void updateProduct(String productName, String productOrigin, String meatCategory, String productPrice, String productDiscountPrice) {
        this.productName = productName;
        this.meatCategory = meatCategory;
        this.productOrigin = productOrigin;
        this.productPrice = productPrice;
        this.productDiscountPrice = productDiscountPrice;
    }
}
