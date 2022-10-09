package com.spring.kiosk_butcher_shop.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public void productSave(ProductRequestDto productRequestDto) {
        String productName = productRequestDto.getProductName();
        //원산지
        String productOrigin = productRequestDto.getProductOrigin();
        // 고기 카테고리
        String meatCategory = productRequestDto.getMeatCategory();
        // 가격
        String productPrice = productRequestDto.getProductPrice();
        // 세일 가격
        String productDiscountPrice = productRequestDto.getProductDiscountPrice();

        Product product = new Product(productName , productOrigin, meatCategory, productPrice , productDiscountPrice);

        productRepository.save(product);
    }

    @Transactional
    public void productUpdate(ProductRequestDto productRequestDto , Long productId) {
        Product product = productRepository.findById(productId).orElseThrow(
                () -> new NullPointerException("해당 상품이 없습니다")
        );
        //상품 명
        String productName = productRequestDto.getProductName();
        //원산지
        String productOrigin = productRequestDto.getProductOrigin();
        // 고기 카테고리
        String meatCategory = productRequestDto.getMeatCategory();
        // 가격
        String productPrice = productRequestDto.getProductPrice();
        // 세일 가격
        String productDiscountPrice = productRequestDto.getProductDiscountPrice();

//        if(productRequestDto.getProductName().equals("")){
//            productName = product.getProductName();
//        }
//        if(productRequestDto.getProductOrigin().equals("")){
//            productOrigin = product.getProductName();
//        }
//        if(productRequestDto.getMeatCategory().equals("")){
//            meatCategory = product.getProductName();
//        }
//        if(productRequestDto.getProductPrice().equals("")){
//            productPrice = product.getProductName();
//        }
//        if(productRequestDto.getProductDiscountPrice().equals("")){
//            productDiscountPrice = product.getProductName();
//        }

        if(productName.equals("")){
            productName = product.getProductName();
        }
        if(productOrigin.equals("")){
            productOrigin = product.getProductOrigin();
        }
        if(meatCategory.equals("")){
            meatCategory = product.getMeatCategory();
        }
        if(productPrice.equals("")){
            productPrice = product.getProductPrice();
        }
        if(productDiscountPrice.equals("")){
            productDiscountPrice = product.getProductDiscountPrice();
        }
        product.updateProduct(productName, productOrigin , meatCategory , productPrice ,productDiscountPrice);
    }

    @Transactional
    public void productDelete(Long productId) {
        Product product = productRepository.findById(productId).orElseThrow(
                () -> new NullPointerException("해당 상품이 없습니다")
        );
        productRepository.delete(product);
    }

    public ProductResponseDto productRead(Long productId) {
        Product product = productRepository.findById(productId).orElseThrow(
                () -> new NullPointerException("해당 상품이 없습니다")
        );
        return new ProductResponseDto(product);
    }

    public ProductAllResponseDto productAllRead() {
        List<Product> products = productRepository.findAll();
        List<ProductResponseDto> result = products.stream()
                .map(ProductResponseDto::new)
                .collect(Collectors.toList());
        return new ProductAllResponseDto(result);
    }

    public ProductAllResponseDto productPigsRead() {
        List<Product> products = productRepository.findAll();
        List<ProductResponseDto> result = products.stream()
                .map(ProductResponseDto::new)
                .filter(x -> x.getMeatCategory().equals("돼지") )
                .collect(Collectors.toList());
        return new ProductAllResponseDto(result);
    }

    public ProductAllResponseDto productCowsRead() {
        List<Product> products = productRepository.findAll();
        List<ProductResponseDto> result = products.stream()
                .map(ProductResponseDto::new)
                .filter(x -> x.getMeatCategory().equals("소") )
                .collect(Collectors.toList());
        return new ProductAllResponseDto(result);
    }

    public ProductAllResponseDto productChickenRead() {
        List<Product> products = productRepository.findAll();
        List<ProductResponseDto> result = products.stream()
                .map(ProductResponseDto::new)
                .filter(x -> x.getMeatCategory().equals("닭") )
                .collect(Collectors.toList());
        return new ProductAllResponseDto(result);
    }
}
