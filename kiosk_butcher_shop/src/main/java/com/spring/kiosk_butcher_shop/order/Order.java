package com.spring.kiosk_butcher_shop.order;

import com.spring.kiosk_butcher_shop.orderBasket.OrderBasket;
import com.spring.kiosk_butcher_shop.user.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

// 참고 블로그 https://web2eye.tistory.com/202

@Entity
@Table(name = "orders")
public class Order {

    // 주문 번호
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long id;

    // 주문 자
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User orderUser;

    // 장바구니
    @OneToMany(mappedBy = "order")
    private List<OrderBasket> orderBaskets = new ArrayList<>();

    //할인 가격
    private Long discountPrice;

    // 총 가격
    private Long totalPrice;


}
