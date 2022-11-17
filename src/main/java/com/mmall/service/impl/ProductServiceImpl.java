package com.mmall.service.impl;

import com.mmall.mapper.ProductMapper;
import com.mmall.pojo.Product;
import com.mmall.service.ProductService;
import com.mmall.service.ex.IdNotFoundException;
import com.mmall.service.ex.ProductDeleteException;
import com.mmall.service.ex.ProductInsertException;
import com.mmall.service.ex.ProductUpdateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public void add(Product product) {
        Integer rows = productMapper.insert(product);
        if(rows!=1){
            throw new ProductInsertException("添加商品时发生未知错误");
        }
    }

    @Override
    public void update(Product product) {
        if(productMapper.get_by_id(product.getId()) == null){
            throw  new IdNotFoundException("商品id不存在");
        }
        Integer rows = productMapper.update(product);
        if(rows!=1){
            throw new ProductUpdateException("修改商品信息时产生了未知错误");
        }
    }

    @Override
    public void delete(Integer id) {
        if(productMapper.get_by_id(id)==null){
            throw  new IdNotFoundException("商品id不存在");
        }
        Integer rows = productMapper.delete(id);
        if(rows!=1){
            throw new ProductDeleteException("删除商品时发生未知错误");
        }
    }

    @Override
    public Product get_by_id(Integer id) {
        Product result = productMapper.get_by_id(id);
        if(result==null){
            throw new IdNotFoundException("商品id不存在");
        }
        return result;
    }

    @Override
    public ArrayList<Product> selectAll() {
        ArrayList<Product> goods = productMapper.selectAll();
        return goods;
    }
}
