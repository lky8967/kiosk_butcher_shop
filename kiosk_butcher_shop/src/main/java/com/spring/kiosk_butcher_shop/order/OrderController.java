package com.spring.kiosk_butcher_shop.order;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    @PostMapping("/api/orders/create")
    private String createOrders(@RequestBody OrderRequestDto orderRequestDto){

        orderService.ordersCreate(orderRequestDto);


        return "주문 완료";
    }

}
