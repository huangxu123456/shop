package com.apesource.shop.service.impl;

import com.apesource.shop.dao.BrandDao;
import com.apesource.shop.pojo.Brand;
import com.apesource.shop.service.base.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BrandService implements IBrandService {
    @Autowired(required = false)
    BrandDao brandDao;
    @Override
    public int insertBrand(Brand brand) {
        return brandDao.insertBrand(brand);
    }

    @Override
    public int deleteBrand(Brand brand) {
        return brandDao.deleteBrand(brand);
    }

    @Override
    public int updateBrand(Brand brand) {
        return brandDao.updateBrand(brand);
    }

    @Override
    public List<Brand> selectBrand(Brand brand) {
        return brandDao.selectBrand(brand);
    }

    @Override
    public int countBrand() {
        return brandDao.countBrand();
    }


    @Override
    public int delectBrands(List<Integer> list) {
        return brandDao.delectBrands(list);
    }
}
