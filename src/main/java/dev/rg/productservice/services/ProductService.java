package dev.rg.productservice.services;

import dev.rg.productservice.dtos.UpdateProductDto;
import dev.rg.productservice.models.Product;

import java.util.List;

public interface ProductService {
    public Product getSingleProduct(Long id);

    public List<Product> getAllProducts();

    public Product updateProduct(Long id, UpdateProductDto updateProductDto);

}
