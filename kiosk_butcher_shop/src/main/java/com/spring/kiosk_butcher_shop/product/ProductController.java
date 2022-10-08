package com.spring.kiosk_butcher_shop.product;

import com.spring.kiosk_butcher_shop.exception.ApiResponseMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("/api/product/create")
    private ResponseEntity<ApiResponseMessage> saveProduct(@RequestBody ProductRequestDto productRequestDto){

        productService.productSave(productRequestDto);
        ApiResponseMessage message = new ApiResponseMessage("Success", "상품 등록이 완료되었습니다", "", "");
        return new ResponseEntity<ApiResponseMessage>(message, HttpStatus.OK);
    }

    @PutMapping("/api/product/update/{productId}")
    private ResponseEntity<ApiResponseMessage> updateProduct(@RequestBody ProductRequestDto productRequestDto,
                                 @PathVariable("productId") Long productId){
        productService.productUpdate(productRequestDto, productId);
        ApiResponseMessage message = new ApiResponseMessage("Success", "상품 수정이 완료되었습니다", "", "");
        return new ResponseEntity<ApiResponseMessage>(message, HttpStatus.OK);
    }

    @DeleteMapping("/api/product/delete/{productId}")
    private ResponseEntity<ApiResponseMessage> deleteProduct(@PathVariable("productId") Long productId) {
        productService.productDelete(productId);
        ApiResponseMessage message = new ApiResponseMessage("Success", "상품 삭제가 완료되었습니다", "", "");
        return new ResponseEntity<ApiResponseMessage>(message, HttpStatus.OK);
    }

    @GetMapping("/api/product/read/{productId}")
    private ProductResponseDto readProduct(@PathVariable("productId") Long productId) {
        return productService.productRead(productId);
    }

}
