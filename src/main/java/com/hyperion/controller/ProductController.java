package com.hyperion.controller;


import com.hyperion.domain.Product;
import com.hyperion.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @Autowired
    private ProductRepo productRepo;

    @GetMapping("/add")
    public String saveProduct(){
        Product product = new Product();
        product.setProductId("100");
        product.setDescription("iPhone");
        product.setPrice(700);
        product.setUrl("abcd.jpg");

        productRepo.save(product);
        return "success";
    }
}
