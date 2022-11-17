package com.mmall.service;

import com.mmall.pojo.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductServiceTests {
    @Autowired
    private ProductService productService;

    @Test
    public void update(){
        Product product = new Product();
        product.setTitle("几把猫");
        product.setId(3);
        productService.update(product);
    }

    @Test
    public void delete(){
        productService.delete(2);
    }
}
