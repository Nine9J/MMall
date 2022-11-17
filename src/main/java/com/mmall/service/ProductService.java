package com.mmall.service;

import com.mmall.pojo.Product;

import java.util.ArrayList;

/**
 * 商品模块服务层接口
 */
public interface ProductService {
    /**
     * 添加商品
     * @param product
     */
    void add(Product product);

    /**
     * 修改商品信息
     * @param product
     */
    void update(Product product);

    /**
     * 根据 id 删除商品
     * @param id
     * @return 影响的行数
     */
    void delete(Integer id);

    /**
     * 根据 id 获取商品信息
     * @param id
     * @return Product
     */
    Product get_by_id(Integer id);

    /**
     * 查询全部数据
     * @return
     */
    ArrayList<Product> selectAll();

}
