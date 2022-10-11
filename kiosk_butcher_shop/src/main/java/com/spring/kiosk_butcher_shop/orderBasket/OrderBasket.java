package com.spring.kiosk_butcher_shop.orderBasket;

import com.spring.kiosk_butcher_shop.order.Order;
import com.spring.kiosk_butcher_shop.product.Product;
import com.spring.kiosk_butcher_shop.user.User;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Optional;

@Entity @NoArgsConstructor

public class OrderBasket {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "basket_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    //상품명
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Optional<Product> product;

    public OrderBasket(User user, Optional<Product> product) {
        this.user = user;
        this.product = product;
    }
}
