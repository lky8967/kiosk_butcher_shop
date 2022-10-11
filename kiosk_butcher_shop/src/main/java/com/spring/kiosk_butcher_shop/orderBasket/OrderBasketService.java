package com.spring.kiosk_butcher_shop.orderBasket;

import com.spring.kiosk_butcher_shop.product.Product;
import com.spring.kiosk_butcher_shop.product.ProductRepository;
import com.spring.kiosk_butcher_shop.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderBasketService {

    private final OrderBasketRepository orderBasketRepository;
    private final ProductRepository productRepository;

    public void createBacket(OrderBasketRequestDto orderBasketRequestDto, Long productId) {

        User user = orderBasketRequestDto.getUser();
        Optional<Product> product = productRepository.findById(productId);
        

//        Long userId = orderBasketRequestDto.getUserId();
//        if(userId == null){
//            userId = Long.valueOf("비회원 주문");
//        }
//        Long productId = orderBasketRequestDto.getProductId();

        OrderBasket orderBasket = new OrderBasket(user , product);

        orderBasketRepository.save(orderBasket);



    }
}
