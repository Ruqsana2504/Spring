package org.productapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    private String productName;
    private Integer productId;
    private String brand;
    private String category;
    private double price;

    public ProductDTO(String productName, String brand, String category, double price) {
        this.productName = productName;
        this.brand = brand;
        this.category = category;
        this.price = price;
    }
}
