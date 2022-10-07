package com.spring.kiosk_butcher_shop.orderBasket;

import com.spring.kiosk_butcher_shop.order.Order;
import com.spring.kiosk_butcher_shop.product.Product;

import javax.persistence.*;

@Entity
public class OrderBasket {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "basket_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    //상품명
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

}
