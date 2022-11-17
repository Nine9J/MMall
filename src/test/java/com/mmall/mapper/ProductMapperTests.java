package com.mmall.mapper;

import com.mmall.pojo.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductMapperTests {
    @Autowired
    private ProductMapper productMapper;

    @Test
    public void insert(){
        Product product = new Product();
        product.setTitle("一幅画");
        product.setDescription("我画的");
        product.setPrice(10);
        productMapper.insert(product);
    }

    @Test
    public void update(){
        Product product = new Product();
        product.setId(2);
        product.setTitle("一幅画");
        product.setDescription("她画的");
        product.setPrice(10);
        productMapper.update(product);
    }

    @Test
    public void get_by_id(){
        Integer id = new Integer(2);
        Product result = productMapper.get_by_id(id);
        System.out.println(result);
    }

    @Test
    public void delete(){
        productMapper.delete(3);
    }

    @Test
    public void selectAll(){
        ArrayList<Product> goods =  productMapper.selectAll();
        System.out.println(goods);
    }
}
