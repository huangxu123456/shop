package com.apesource.shop.dao;

import com.apesource.shop.pojo.Content;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ContentDao {

    @Insert("INSERT into tb_content(category_id,title,url,pic,status1,sort_order) VALUES(#{categoryId},#{title},#{url},#{pic},#{status1},#{sortOrder})")
    int insertContent(Content content);


    @Delete("DELETE from tb_content where id=#{id}")
    int deleteContent(@Param("id")int id);

    @Update("UPDATE tb_content set category_id=#{categoryId},title=#{title},url=#{url},pic=#{pic},status1=#{status1},sort_order=#{sortOrder}  where id=#{id}")
    int updateContent(Content content);


    @Select("SELECT * from tb_content LIMIT #{page},#{pagesize}")
    @Results(value = {
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "categoryId",column = "category_id"),
            @Result(property = "title",column = "title"),
            @Result(property = "url",column = "url"),
            @Result(property = "pic",column = "pic"),
            @Result(property = "status1",column = "status1"),
            @Result(property = "sortOrder",column = "sortOrder"),
            @Result(property = "contentCategory" ,one = @One(select = "com.apesource.shop.dao.ContentCategoryDao.seletebyid"),column = "category_id")
    })
    List<Content> seleteContent(@Param("page") int page,@Param("pagesize") int pagesize);

    @Select("SELECT count(id) from tb_content")
    int count();

    //批量删除
    @Delete("<script> delete from tb_content where id in <foreach collection='list' index='index' item='id' open='(' separator=',' close=')'> #{id} </foreach> </script>")
    int delContents(List<Integer>  list);

}
