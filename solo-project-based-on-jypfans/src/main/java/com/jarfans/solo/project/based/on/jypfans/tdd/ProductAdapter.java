package com.jarfans.solo.project.based.on.jypfans.tdd;

public class ProductAdapter implements ProductPort {
  private final ProductRepository productRepository;

  public ProductAdapter(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }


  @Override
  public void save(final Product product) {
    productRepository.save(product);
  }
}
