package com.mmall.controller;

import com.mmall.pojo.Product;
import com.mmall.service.ProductService;
import com.mmall.service.ex.ImageIOException;
import com.mmall.service.ex.ImageIsNullException;
import com.mmall.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

@RestController
@RequestMapping("products")
public class ProductController extends BaseController{
    @Autowired
    private ProductService productService;

    @RequestMapping("add")
    public JsonResult<Void> add(Product product){
        productService.add(product);
        //如果出现异常，由基类的handleException函数捕获并返回
        return new JsonResult<Void>(OK);
    }

    @RequestMapping("get_by_id")
    public JsonResult<Product> get_by_id(Integer id){
        Product data = productService.get_by_id(id);
        return new JsonResult<Product>(OK,data);
    }

    @RequestMapping("update")
    public JsonResult<Void> update(Product product){
        productService.update(product);
        return new JsonResult<Void>(OK);
    }

    @RequestMapping("delete")
    public JsonResult<Void> delete(Integer id){
        productService.delete(id);
        return new JsonResult<>(OK);
    }

    @RequestMapping("selectAll")
    public JsonResult<ArrayList<Product>> selectAll(){
        ArrayList<Product> data = productService.selectAll();
        return new JsonResult<ArrayList<Product>>(OK,data);
    }

    @RequestMapping("uploadImage")
    public JsonResult<String> uploadImage(
            HttpSession session,
            MultipartFile file){
        if(file.isEmpty()){
            throw new ImageIsNullException("图片为空");
        }
        String parent =
                session.getServletContext().
                        getRealPath("/upload/");
        File dir = new File(parent);
        // 如果目录不存在，创建目录
        if(!dir.exists()){
            dir.mkdir();
        }
        String originalFilename = file.getOriginalFilename();
        int index = originalFilename.lastIndexOf(".");
        String suffix = originalFilename.substring(index);
        String filename =
                UUID.randomUUID().toString().toUpperCase() + suffix;
        // 创建空文件
        File dest = new File(dir,filename);
        // 将file写入到dest空文件中
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            throw new ImageIOException("文件写入异常");
        }
        String imgName = "/upload/" + filename;
        return new JsonResult<>(OK,imgName);
    }
}
