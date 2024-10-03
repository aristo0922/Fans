package com.jarfans.solo.project.based.on.jypfans.tdd;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

class ProductServiceTest {

  private ProductService productService;
  private ProductPort productPort;
  private ProductRepository productRepository;
  @BeforeEach
  void setUp() {
    productRepository = new ProductRepository();
    productPort = new ProductAdapter(productRepository);
    productService = new ProductService(productPort);
  }
  @Test
  void 상품등록() {
    final String name = "상품명";
    final int price = 1000;
    final DiscountPolicy discountPolicy = DiscountPolicy.NONE;
    final AddProductRequest request = new AddProductRequest(name, price, discountPolicy);
    productService.addProduct(request);
  }
}