package com.apesource.shop.controller;

import com.apesource.shop.pojo.Brand;
import com.apesource.shop.service.base.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class BrandController {
    @Autowired
    IBrandService brandService;

    @RequestMapping("/selectBrand")
    public List<Brand> selectBrand(@RequestBody Brand brand){
        brand.setPage((brand.getPage()-1)*5);
        List<Brand> brands = brandService.selectBrand(brand);
        return brands;
    }

   @RequestMapping("/insertBrand")
    public int insertBrand(@RequestBody Brand brand){
        int i = brandService.insertBrand(brand);
        return i;
    }

    @RequestMapping("/countBrand")
    public int countBrand(){
        int i = brandService.countBrand();
        return i;
    }


    @RequestMapping("/updateBrand")
    public int updateBrand(@RequestBody Brand brand) {
        int i = brandService.updateBrand(brand);
        return i;
    }
    
    @RequestMapping("/delectBrand")
    public int delectBrand(@RequestBody Brand brand){
        int i = brandService.deleteBrand(brand);
        return i;
    }

   @RequestMapping("/delectBrands")
    public int delectBrands(@RequestBody Map<String,Brand[]> map){
        List<Integer> list=new ArrayList<>();
        Brand[] brands = map.get("brands");
       System.out.println(brands);
       for (Brand brand:
               brands) {
           list.add(brand.getId());
       }
       int i = brandService.delectBrands(list);
       System.out.println("批量删除"+i);
       return i;
   }
}
