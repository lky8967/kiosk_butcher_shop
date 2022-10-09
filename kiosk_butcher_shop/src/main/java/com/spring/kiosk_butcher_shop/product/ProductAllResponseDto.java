package com.spring.kiosk_butcher_shop.product;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class ProductAllResponseDto {

    private List<ProductResponseDto> productResponseDtoList;

    public ProductAllResponseDto(List<ProductResponseDto> result){
        this. productResponseDtoList = result;
    }
}
