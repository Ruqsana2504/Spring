package org.product.service;

import org.product.exception.ProductNotFoundException;
import org.product.model.Product;
import org.product.model.ProductDTO;
import org.product.model.ProductMapper;
import org.product.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    IProductRepository productRepository;

    @Autowired
    ProductMapper productMapper;

    @Override
    public void addProduct(ProductDTO productDTO) {
        Product product = productMapper.convertDtoToEntity(productDTO);
        productRepository.save(product);
    }

    @Override
    public void updateProduct(ProductDTO productDTO) {
        //check if productId is available, if so update the product else create a new row.
        Product product = productMapper.convertDtoToEntity(productDTO);
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(int productId) {
        productRepository.deleteById(productId);
    }

    @Override
    public List<ProductDTO> getAllProducts() {
        List<Product> productList = productRepository.findAll();
        return productMapper.convertEntityToDtoList(productList);
    }

    @Override
    public ProductDTO getById(int productId) {
        Optional<Product> product = productRepository.findById(productId);
        return product.map(value -> productMapper.convertEntityToDto(value)).orElse(null);
    }

    @Override
    public List<ProductDTO> getByBrand(String brand) {
        List<Product> productList = productRepository.findByBrand(brand);
        List<ProductDTO> productDTOList = productMapper.convertEntityToDtoList(productList);
        if (CollectionUtils.isEmpty(productDTOList))
            throw new ProductNotFoundException("Product with this brand not found");
        return productDTOList;
    }

    @Override
    public List<ProductDTO> getByBrandNameContains(String brand, String productName) {
        List<Product> productList = productRepository.findByBrandAndProductNameContaining(brand, productName);
        List<ProductDTO> productDTOList = productMapper.convertEntityToDtoList(productList);
        if (CollectionUtils.isEmpty(productDTOList))
            throw new ProductNotFoundException("Product with this brand and name not found");
        return productDTOList;
    }

    @Override
    public List<ProductDTO> getByCat(String category) {
        List<Product> productList = productRepository.getByCat(category);
        List<ProductDTO> productDTOList = productMapper.convertEntityToDtoList(productList);
        if (CollectionUtils.isEmpty(productDTOList))
            throw new ProductNotFoundException("Product with this category not found");
        return productDTOList;
    }

    @Override
    public List<ProductDTO> getByBrandPriceLess(String brand, double price) {
        List<Product> productList = productRepository.getByBrandPriceLess(brand, price);
        List<ProductDTO> productDTOList = productMapper.convertEntityToDtoList(productList);
        if (CollectionUtils.isEmpty(productDTOList))
            throw new ProductNotFoundException("Product with this brand and price not found");
        return productDTOList;
    }

    @Override
    public List<ProductDTO> getByLesserPrice(double price) {
        List<Product> productList = productRepository.getByLesserPrice(price);
        List<ProductDTO> productDTOList = productMapper.convertEntityToDtoList(productList);
        if (CollectionUtils.isEmpty(productDTOList))
            throw new ProductNotFoundException("Product with less price not found");
        return productDTOList;
    }

    @Override
    public List<ProductDTO> getByCatNameContains(String category, String productName) {
        List<Product> productList = productRepository.getByCatNameContains(category, "%" + productName + "%");
        List<ProductDTO> productDTOList = productMapper.convertEntityToDtoList(productList);
        if (CollectionUtils.isEmpty(productDTOList))
            throw new ProductNotFoundException("Product with this category and productName not found");
        return productDTOList;
    }

    @Override
    public List<ProductDTO> getProductByBrand(String brand) {
        List<Product> productList = productRepository.getProductByBrand(brand);
        List<ProductDTO> productDTOList = productMapper.convertEntityToDtoList(productList);
        if (CollectionUtils.isEmpty(productDTOList))
            throw new ProductNotFoundException("Product with this productName and brand not found");
        return productDTOList;
    }

    @Override
    public List<ProductDTO> getByCatPriceLess(String category, double price) {
        List<Product> productList = productRepository.getByCatPriceLess(category, price);
        List<ProductDTO> productDTOList = productMapper.convertEntityToDtoList(productList);
        if (CollectionUtils.isEmpty(productDTOList))
            throw new ProductNotFoundException("Product with this category and price not found");
        return productDTOList;
    }

}
