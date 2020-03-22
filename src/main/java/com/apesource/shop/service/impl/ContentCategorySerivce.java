package com.apesource.shop.service.impl;

import com.apesource.shop.dao.ContentCategoryDao;
import com.apesource.shop.pojo.ContentCategory;
import com.apesource.shop.service.base.IContentCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContentCategorySerivce implements IContentCategoryService {
    @Autowired(required = false)
    ContentCategoryDao contentCategoryDao;
    @Override
    public int insert(ContentCategory contentCategory) {
        return contentCategoryDao.insert(contentCategory);
    }

    @Override
    public int delectByid(int id) {
        return contentCategoryDao.delectByid(id);
    }

    @Override
    public int updateByid(ContentCategory contentCategory) {
        return contentCategoryDao.updateByid(contentCategory);
    }

    @Override
    public List<ContentCategory> selsetContentCategory(String name,int page, int pageSize) {
         List<ContentCategory> result=null;

//        PageHelper.startPage(page,pageSize);
//        PageHelper.orderBy("id ASC");
        result=contentCategoryDao.selsetContentCategory(name,page, pageSize);
        return result;
    }

    @Override
    public void deletebatch(List<Integer> list) {
         contentCategoryDao.deletebatch(list);
    }


    @Override
    public int selectcount() {
        return contentCategoryDao.selectcount();
    }

    @Override
    public ContentCategory seletebyid(int id) {
        return contentCategoryDao.seletebyid(id);
    }
}
