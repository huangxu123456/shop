package com.apesource.shop.service.base;

import com.apesource.shop.dao.SqlUtils;
import com.apesource.shop.pojo.Model;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IModelService {


    int insertModel(com.apesource.shop.pojo.Model model);


    int deleteModel(com.apesource.shop.pojo.Model model);


    int updateModel(com.apesource.shop.pojo.Model model);


    List<Model> seleteModels(Model model);



    int dels(List<Integer> list);


    Model seleteByid(Model model);



    int countmodel();
}
