package com.apesource.shop.service.impl;

import com.apesource.shop.dao.SizeDao;
import com.apesource.shop.pojo.Size;
import com.apesource.shop.service.base.ISizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SizeService implements ISizeService{
    @Autowired(required = false)
    SizeDao sizeDao;

    @Override
    public int insertSize(Size size) {

        return sizeDao.insertSize(size);
    }

    @Override
    public int deleteSize(Size size) {
        return sizeDao.deleteSize(size);
    }

    @Override
    public int updateSize(Size size) {
        return sizeDao.updateSize(size);
    }

    @Override
    public List<Size> seleteSize() {
        return sizeDao.seleteSize();
    }

    @Override
    public int insertsizes(List<Size> list) {
        return sizeDao.insertsizes(list);
    }

    @Override
    public List<Size> seleteSizebymid(int mid) {
        return sizeDao.seleteSizebymid(mid);
    }

    @Override
    public int updateSizes(List<Object> list) {
        return sizeDao.updateSizes(list);
    }
}
