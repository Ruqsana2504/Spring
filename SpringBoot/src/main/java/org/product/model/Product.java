package org.product.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@Table(name="product_details")
@NamedQuery(name = "getProductsByBrand", query = "from Product p where p.brand=?1")
@NamedQuery(name = "getByCatPrice", query = "from Product p where p.category=?1 and p.price<?2")
public class Product {

    @Column(length = 30)
    private String productName;
    @Id
    @GeneratedValue
    private Integer productId;
    @Column(length = 30)
    private String brand;
    @Column(length = 30)
    private String category;
    @Column(name = "cost")
    private double price;

}
