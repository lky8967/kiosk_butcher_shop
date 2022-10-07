package com.spring.kiosk_butcher_shop.order;

import com.spring.kiosk_butcher_shop.orderBasket.OrderBasket;
import com.spring.kiosk_butcher_shop.user.User;

import java.util.ArrayList;
import java.util.List;

public class OrderResponseDto {
    private Long id;
    private User user;
    private List<OrderBasket> orderBaskets = new ArrayList<>();
    //할인 가격
    private Long discountPrice;
    // 총 가격
    private Long totalPrice;
}
