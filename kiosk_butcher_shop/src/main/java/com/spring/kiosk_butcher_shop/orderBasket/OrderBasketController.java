package com.spring.kiosk_butcher_shop.orderBasket;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderBasketController {

    private final OrderBasketService orderBasketService;

    @PostMapping("/api/orderBaskets/create/{productId}")
    private String basketCreate(@RequestBody OrderBasketRequestDto orderBasketRequestDto,
                                @PathVariable("productId") Long productId){

        orderBasketService.createBacket(orderBasketRequestDto , productId);

        return "장바구니 담기 완료";
    }

}
