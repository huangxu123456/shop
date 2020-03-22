package com.apesource.shop.service.base;

import com.apesource.shop.pojo.Brand;


import java.util.List;

public interface IBrandService {
    int insertBrand(Brand brand);


    int deleteBrand(Brand brand);


    int updateBrand(Brand brand);


    List<Brand> selectBrand(Brand brand);


    int countBrand();



    int delectBrands(List<Integer> list);


}
