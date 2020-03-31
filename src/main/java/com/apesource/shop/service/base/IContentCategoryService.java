package com.apesource.shop.service.base;

import com.apesource.shop.dao.SqlUtils;
import com.apesource.shop.pojo.ContentCategory;
import io.lettuce.core.dynamic.annotation.Param;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IContentCategoryService {


    int insert(ContentCategory contentCategory);


    int delectByid(int  id);


    int updateByid(ContentCategory contentCategory);


    List<ContentCategory> selsetContentCategory(String name,int page, int pageSize);


    void deletebatch( List<Integer> list);

    public int selectcount();


    ContentCategory seletebyid(@Param("id")int id);
}
