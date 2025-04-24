package org.productapp.controller;

import org.productapp.exception.ProductNotFoundException;
import org.productapp.model.ProductDTO;
import org.productapp.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product-api")
public class ProductController {

    @Autowired
    IProductService productService;

    @PostMapping("/products")
    void addProduct(ProductDTO product) {
    }

    @PutMapping("/products")
    void updateProduct(ProductDTO product) {
    }

    @DeleteMapping("/products")
    void deleteProduct(int productId) {
    }

    @GetMapping("/products")
    List<ProductDTO> getAllProducts() {
    }

    @GetMapping("/products/productId")
    ProductDTO getById(int productId) {
    }

    @GetMapping("/products")
    List<ProductDTO> getByBrand(String brand) throws ProductNotFoundException {
    }

    @GetMapping("/products")
    List<ProductDTO> getByBrandNameContains(String brand, String productName) throws ProductNotFoundException {
    }

    @GetMapping("/products")
    List<ProductDTO> getByCat(String category) throws ProductNotFoundException {
    }

    @GetMapping("/products")
    List<ProductDTO> getByBrandPriceLess(String brand, double price) throws ProductNotFoundException {
    }

    @GetMapping("/products")
    List<ProductDTO> getByLesserPrice(double price) throws ProductNotFoundException {
    }

    @GetMapping("/products")
    List<ProductDTO> getByCatNameContains(String category, String productName) throws ProductNotFoundException {
    }

    @GetMapping("/products")
    List<ProductDTO> getProductByBrand(String brand) throws ProductNotFoundException {
    }

    @GetMapping("/products")
    List<ProductDTO> getByCatPriceLess(String category, double price) throws ProductNotFoundException {
    }

}
