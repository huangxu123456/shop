package com.apesource.shop.dao;

import com.apesource.shop.pojo.Seller;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;

import java.lang.reflect.Type;
import java.util.List;

public interface SellerDao {

    //@SelectProvider(type = SqlUtils.class,method = "seleteseller")
    //@Select("select * from seller")
     List<Seller> seleteSeller(Seller seller);

    @Update("UPDATE seller set `status`=#{status} where seller_id=#{sellerId}")
    int updateSeller(Seller seller);


    @Select("SELECT count(seller_id) from seller")
    int countSeller();

}
