package com.apesource.shop.service.impl;

import com.apesource.shop.dao.ModelDao;
import com.apesource.shop.pojo.Model;
import com.apesource.shop.service.base.IModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ModelService  implements IModelService{
    @Autowired(required = false)
    ModelDao modelDao;

    @Override
    public int insertModel(Model model) {
        return modelDao.insertModel(model);
    }

    @Override
    public int deleteModel(Model model) {
        return modelDao.deleteModel(model);
    }

    @Override
    public int updateModel(Model model) {
        return modelDao.updateModel(model);
    }

    @Override
    public List<Model> seleteModels(Model model) {
        return modelDao.seleteModels(model);
    }

    @Override
    public int dels(List<Integer> list) {
        return modelDao.dels(list);
    }

    @Override
    public Model seleteByid(Model model) {
        return modelDao.seleteByid(model);
    }

    @Override
    public int countmodel() {
        return modelDao.countmodel();
    }
}
