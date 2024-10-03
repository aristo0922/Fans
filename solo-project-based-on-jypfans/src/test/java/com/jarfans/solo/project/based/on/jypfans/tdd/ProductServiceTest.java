package com.jarfans.solo.project.based.on.jypfans.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

class ProductServiceTest {
  private ProductService productService;

  @BeforeEach
  void setUp(){
    productService = new ProductService();
  }

  private class ProductService{
    public void addProduct(final AddProductRequest request){
      throw new UnsupportedOperationException("Unsupported addProduct");
    }
  }

  @Test
  void 상품등록(){
    final String name = "상품명";
    final int price = 1000;
    final DiscountPolicy discountPolicy = DiscountPolicy.NONE;
    final AddProductRequest request = new AddProductRequest(name, price, discountPolicy);
    productService.addProduct(request);
  }

  private record AddProductRequest(String name, int price, DiscountPolicy discountPolicy){
    private AddProductRequest{
      Assert.hasText(name, "상품명은 필수입니다.");
      Assert.isTrue(price > 0, "상품 가격은 0보다 커야 합니다.");
      Assert.notNull(discountPolicy, "할인 정책은 필수입니다.");
    }
  }

  private enum DiscountPolicy{
    NONE
  }

}