package org.product;

import org.product.model.ProductDTO;
import org.product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@SpringBootApplication
public class SpringBootApp implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApp.class, args);
    }

    @Autowired
    IProductService productService;

    @Override
    public void run(String... args) {
        ProductDTO productDTO = new ProductDTO("Microphone", "Moana", "Electronics", 20000);
        productService.addProduct(productDTO);
//
//        Product product1 = new Product("Laptop", "Dell", "Electronics", 200000);
//        productService.addProduct(product1);
//        product1 = new Product("Television", "Samsung", "Electronics", 200000);
//        productService.addProduct(product1);
//        product1 = new Product("Head phones", "Samsung", "Electronics", 8000);
//        productService.addProduct(product1);
//        product1 = new Product("ear phones", "Samsung", "Electronics", 2000);
//        productService.addProduct(product1);
//        product1 = new Product("Speakers", "Samsung", "Electronics", 2000);
//        productService.addProduct(product1);
//        product1 = new Product("headphones", "Bose", "Electronics", 5000);
//        productService.addProduct(product1);
//        product1 = new Product("Pencils", "Camlin", "Stationary", 200);
//        productService.addProduct(product1);
//        product1 = new Product("Pen", "Classmate", "Stationary", 500);
//        productService.addProduct(product1);
//        product1 = new Product("Color pencils", "Camlin", "Stationary", 120);
//        productService.addProduct(product1);

        productService.getAllProducts().forEach(System.out::println);

//        System.out.println("By Id");
//        Product nproduct = productService.getById(1);
//        System.out.println(nproduct);
//
//        System.out.println();
//        System.out.println("updating");
//        nproduct.setPrice(30000);
//        nproduct.setBrand("OnePlus");
//        productService.updateProduct(nproduct);

        //Derived queries
       /* System.out.println();
        System.out.println("#####Derived queries#####");
        System.out.println("Get By Brand");
        productService.getByBrand("Samsung").forEach(System.out::println);

        System.out.println();
        System.out.println("Get By Brand and name");
        productService.getByBrandNameContains("Camlin", "pen").forEach(System.out::println);*/

        //Custom queries
       /* System.out.println();
       System.out.println("#####Custom queries#####");
        System.out.println("Get By Category");
        productService.getByCat("Electronics").forEach(System.out::println);

        System.out.println();
        System.out.println("Get By Brand and Price");
        productService.getByBrandPriceLess("Camlin", 150).forEach(System.out::println);*/

        //Native queries
        /*System.out.println();
        System.out.println("#####Native queries#####");
        System.out.println("Get By Price");
        productService.getByLesserPrice(2000).forEach(System.out::println);

        System.out.println();
        System.out.println("Get By Category Name");
        productService.getByCatNameContains("Electronics", "Laptop").forEach(System.out::println);*/

        //Named queries
        System.out.println();
        System.out.println("#####Named queries#####");
        System.out.println("Get By Brand");
        productService.getProductByBrand("Dell").forEach(System.out::println);

        System.out.println();
        System.out.println("Get By Price");
        productService.getByCatPriceLess("Electronics", 5000).forEach(System.out::println);

        System.out.println();

    }
}
