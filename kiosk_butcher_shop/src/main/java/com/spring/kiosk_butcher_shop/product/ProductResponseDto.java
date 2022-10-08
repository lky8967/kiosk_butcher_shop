package com.spring.kiosk_butcher_shop.product;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class ProductResponseDto {
    // 상품 번호
    private Long id;
    //상품 이름
    private String productName;
    //원산지
    private String productOrigin;
    // 고기 카테고리
    private String meatCategory;
    // 가격
    private String productPrice;
    // 세일 가격
    private String productDiscountPrice;

    public ProductResponseDto(Product product) {
        this.id = product.getId();
        this.productName = product.getProductName();
        this.productOrigin = product.getProductOrigin();
        this.meatCategory = product.getMeatCategory();
        this.productPrice = product.getProductPrice();
        this.productDiscountPrice = product.getProductDiscountPrice();
    }
}
