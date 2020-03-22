package com.apesource.shop.dao;

import com.apesource.shop.pojo.Brand;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author hx
 */
@Mapper
public interface BrandDao {

    @Insert("INSERT into brand(`name`, first_name) VALUES(#{name},#{firstName})")
    int insertBrand(Brand brand);

     @Delete("DELETE from brand where id=#{id}")
    int deleteBrand(Brand brand);

     @Update("UPDATE brand set `name`=#{name},first_name=#{firstName} where id=#{id}")
     int updateBrand(Brand brand);

    @Select("SELECT * from brand limit #{page},#{pagesize}")
     List<Brand> selectBrand(Brand brand);

    @Select("SELECT count(id) from brand")
    int countBrand();

    @Delete("<script> DELETE from brand where id in <foreach collection='list' index='index' item='id' open='(' separator=',' close=')'> #{id} </foreach></script> ")
    int delectBrands(List<Integer> list);

}
