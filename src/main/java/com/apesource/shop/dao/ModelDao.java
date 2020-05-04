package com.apesource.shop.dao;

import com.apesource.shop.pojo.Model;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface ModelDao {

    @Insert("INSERT into model (`name`) VALUES(#{name})")
    @Options(keyProperty = "id",useGeneratedKeys = true)
    int insertModel(Model model);

    @Delete("DELETE from model where id=#{id}")
    int deleteModel(Model model);

    @Update("UPDATE model set `name`=#{name} where id=#{id}")
    int updateModel(Model model);

    @SelectProvider(type = SqlUtils.class,method = "seleteModels")
    List<Model> seleteModels(Model model);


    @Delete("<script> delete from model where id in <foreach collection='list' index='index' item='id' open='(' separator=',' close=')'> #{id} </foreach> </script>")
    int dels(List<Integer> list);


    Model seleteByid(Model model);


    /**
     * 技术
     */
    @Select("SELECT count(*) from model")
    int countmodel();

}
