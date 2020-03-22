package com.apesource.shop.service.base;

import com.apesource.shop.pojo.Content;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IContentService {

    int insertContent(Content content);


    int deleteContent(@Param("id")int id);


    int updateContent(Content content);


    List<Content> seleteContent(int page,int pagesize);

    int count();


    int delContents(List<Integer>  list);
}
