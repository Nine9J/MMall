package com.mmall.mapper;

import com.mmall.pojo.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface ProductMapper {
    /**
     * 添加商品信息
     * @param product
     */
    Integer insert(Product product);

    /**
     * 修改商品信息
     * @param product
     * @return
     */
    Integer update(Product product);

    /**
     * 使用 id 获取商品信息
     * @param id
     * @return
     */
    Product get_by_id(Integer id);

    /**
     * 根据 id 删除商品
     * @param id
     * @return
     */
    Integer delete(Integer id);

    /**
     * 导出 t_product 的全部数据
     * @return ArrayList<Product>
     */
    ArrayList<Product> selectAll();
}
