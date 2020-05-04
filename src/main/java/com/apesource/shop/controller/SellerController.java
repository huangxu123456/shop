package com.apesource.shop.controller;

import com.alibaba.fastjson.JSON;
import com.apesource.shop.pojo.Seller;
import com.apesource.shop.service.base.ISellerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@Slf4j
public class SellerController {
    @Autowired
    ISellerService sellerService;
    @RequestMapping("seleteSeller")
    public List<Seller> seleteSeller(@RequestBody Seller seller ){
        seller.setPage((seller.getPage()-1)*5);
        List<Seller> sellers = sellerService.seleteSeller(seller);
        System.out.println(sellers);
        String s = JSON.toJSONString(sellers);
        log.info("==============================:{}",s);
        return sellers;
    }

    @RequestMapping("/updateSeller")
    public int updateSeller(@RequestBody Seller seller){
        System.out.println(seller.getStatus());
        int i = sellerService.updateSeller(seller);
        return i;
    }



    @RequestMapping("/countSeller")
    public int countSeller(){
        int i = sellerService.countSeller();
        return i;
    }
}
