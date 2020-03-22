package com.apesource.shop.service.base;

import com.apesource.shop.dao.SqlUtils;
import com.apesource.shop.pojo.Seller;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ISellerService {

    List<Seller> seleteSeller(Seller seller);


    int updateSeller(Seller seller);

    int countSeller();
}
