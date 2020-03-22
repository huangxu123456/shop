package com.apesource.shop.service.impl;

import com.apesource.shop.dao.SellerDao;
import com.apesource.shop.pojo.Seller;
import com.apesource.shop.service.base.ISellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SellerService implements ISellerService {
    @Autowired(required = false)
    SellerDao sellerDao;

    @Override
    public List<Seller> seleteSeller(Seller seller) {
        return sellerDao.seleteSeller(seller);
    }

    @Override
    public int updateSeller(Seller seller) {
        return sellerDao.updateSeller(seller);
    }

    @Override
    public int countSeller() {
        return sellerDao.countSeller();
    }




}
