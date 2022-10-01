package com.spring.kiosk_butcher_shop.orderBasket;

import javax.persistence.*;

@Entity
public class OrderBasket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "basket_id")
    private Long id;

    private Long discountPrice;

    private Long totalPrice;
}
