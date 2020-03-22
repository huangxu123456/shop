package com.apesource.shop.dao;

import com.apesource.shop.pojo.ContentCategory;
import io.lettuce.core.dynamic.annotation.Param;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ContentCategoryDao {

    @Insert("INSERT into tb_content_category(`name`,state) VALUES(#{name},#{state})")
    int insert(ContentCategory contentCategory);

    @Delete("DELETE from tb_content_category where id=#{id}")
    int delectByid(int id);

   @Update("UPDATE tb_content_category set `name`=#{name},state=#{state} where id=#{id}")
    int updateByid(ContentCategory contentCategory);

    @SelectProvider(type = SqlUtils.class,method = "selectContentCategory" )
    List<ContentCategory> selsetContentCategory(String name,int page, int pageSize);


    @Delete("<script> delete from tb_content_category where id in <foreach collection='list' index='index' item='id' open='(' separator=',' close=')'>  #{id} </foreach> </script>")
     //@DeleteProvider(type =SqlUtils.class,method = "delectContentCategorys")
    void deletebatch(@Param("list") List<Integer> list);

    @Select("select count(id) from tb_content_category")
    public int selectcount();

    @Select("SELECT * from tb_content_category where id=#{id}")
    ContentCategory seletebyid(@Param("id")int id);


}
