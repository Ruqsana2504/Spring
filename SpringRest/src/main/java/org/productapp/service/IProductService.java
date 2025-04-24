package org.productapp.service;

import org.product.exception.ProductNotFoundException;
import org.product.model.ProductDTO;

import java.util.List;

public interface IProductService {
    //inbuilt methods
    void addProduct(ProductDTO product);

    void updateProduct(ProductDTO product);

    void deleteProduct(int productId);

    List<ProductDTO> getAllProducts();

    ProductDTO getById(int productId);

    //querying the database
    //Derived query
    List<ProductDTO> getByBrand(String brand) throws ProductNotFoundException;

    List<ProductDTO> getByBrandNameContains(String brand, String productName) throws ProductNotFoundException;

    //Custom query
    List<ProductDTO> getByCat(String category) throws ProductNotFoundException;

    List<ProductDTO> getByBrandPriceLess(String brand, double price) throws ProductNotFoundException;

    //Native query
    List<ProductDTO> getByLesserPrice(double price) throws ProductNotFoundException;

    List<ProductDTO> getByCatNameContains(String category, String productName) throws ProductNotFoundException;

    //Named query
    List<ProductDTO> getProductByBrand(String brand) throws ProductNotFoundException;

    List<ProductDTO> getByCatPriceLess(String category, double price) throws ProductNotFoundException;
}
