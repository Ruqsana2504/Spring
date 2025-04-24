package org.product.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductMapper {

    public List<ProductDTO> convertEntityToDtoList(List<Product> productList) {
        List<ProductDTO> productDTOList = new ArrayList<>();
        productList.forEach(product -> productDTOList.add(convertEntityToDto(product)));
        return productDTOList;
    }

    public ProductDTO convertEntityToDto(Product product) {
        return new ProductDTO(product.getProductName(), product.getProductId(), product.getBrand(), product.getCategory(), product.getPrice());
    }

    public Product convertDtoToEntity(ProductDTO productDTO) {
        return new Product(productDTO.getProductName(), productDTO.getProductId(), productDTO.getBrand(), productDTO.getCategory(), productDTO.getPrice());
    }

}