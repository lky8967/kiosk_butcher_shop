package com.spring.kiosk_butcher_shop.order;

import com.spring.kiosk_butcher_shop.orderBasket.OrderBasket;
import com.spring.kiosk_butcher_shop.user.User;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;

@Entity
public class Order {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User orderUser;

    @OneToMany
    private OrderBasket orderBasket;

    private Long discountPrice;

    private Long totalPrice;



}
