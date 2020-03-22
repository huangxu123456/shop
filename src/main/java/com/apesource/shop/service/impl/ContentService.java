package com.apesource.shop.service.impl;

import com.apesource.shop.dao.ContentDao;
import com.apesource.shop.pojo.Content;
import com.apesource.shop.service.base.IContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContentService implements IContentService{
    @Autowired(required = false)
    ContentDao contentDao;
    @Override
    public int insertContent(Content content) {
        return contentDao.insertContent(content);
    }

    @Override
    public int deleteContent(int id) {
        return contentDao.deleteContent(id);
    }

    @Override
    public int updateContent(Content content) {
        return contentDao.updateContent(content);
    }

    @Override
    public List<Content> seleteContent(int page,int pagesize) {
        return contentDao.seleteContent(page,pagesize);
    }

    @Override
    public int count() {
        return contentDao.count();
    }

    @Override
    public int delContents(List<Integer> list) {
        return contentDao.delContents(list);
    }
}
