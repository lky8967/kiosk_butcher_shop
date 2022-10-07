package com.spring.kiosk_butcher_shop.orderBasket;

import com.spring.kiosk_butcher_shop.product.Product;
import com.spring.kiosk_butcher_shop.user.User;

import javax.persistence.*;

@Entity
public class OrderBasket {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "basket_id")
    private Long id;

    // 구매자
    @OneToOne
    private User user;

    //상품명
    @OneToMany
    private Product product;

    private Long discountPrice;

    private Long totalPrice;
}
