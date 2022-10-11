package com.spring.kiosk_butcher_shop.orderBasket;

import com.spring.kiosk_butcher_shop.product.Product;
import com.spring.kiosk_butcher_shop.user.User;
import lombok.Getter;

@Getter
public class OrderBasketRequestDto {

    private User user;
    private Product product;
//    private Long userId;
//    private Long productId;
}
