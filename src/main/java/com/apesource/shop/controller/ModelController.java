package com.apesource.shop.controller;

import com.apesource.shop.pojo.Model;
import com.apesource.shop.pojo.Size;
import com.apesource.shop.service.base.IModelService;
import com.apesource.shop.service.base.ISizeService;
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
public class ModelController {
    @Autowired
    IModelService modelService;
    @Autowired
    ISizeService sizeService;

    @RequestMapping("/seleteModel")
    public List<Model> seleteModel(@RequestBody Model model){
        model.setPage((model.getPage()-1)*5);
        System.out.println(model);
        List<Model> models = modelService.seleteModels(model);
        System.out.println("chaxun"+models);
        return models;
    }

    @RequestMapping("/delsmodel")
    public int deleteModels(@RequestBody Map<String,Model[]> map){
        List<Integer> list=new ArrayList<>();
        Model[] models = map.get("models");
        for (Model model:
        models) {
            list.add(model.getId());
        }
        int dels = modelService.dels(list);
        return dels;
    }

    @RequestMapping("/delmodel")
    public int delmodel(@RequestBody Model model){
        //System.out.println(model);
        int i = modelService.deleteModel(model);
        return i;
    }


    @RequestMapping("/insertModel")
    public List<Integer> insertModel(@RequestBody Model model){
        List<Integer> list=new ArrayList<>();
        int i = modelService.insertModel(model);
        int id = model.getId();
        list.add(i);
        list.add(id);
        return list;
    }

    //批量添加
   @RequestMapping("/insertSizes")
    public int insertSizes(@RequestBody Map<String,Object> map){
        List<Size> list=new ArrayList<>();
        List<String> sizenames = (List<String>)map.get("sizenames");
       Integer mkey = (Integer)map.get("mkey");
       for (Object obj:
               sizenames) {
           Size size=new Size();
           size.setName(obj.toString());
           size.setMid(mkey);
           list.add(size);
       }
       System.out.println(list);
       int insertsizes = sizeService.insertsizes(list);
       return insertsizes;
   }

     @RequestMapping("/selectmodelbyid")
   public Model selectmodelbyid(@RequestBody Model model){
        // System.out.println(model);
         Model model1 = modelService.seleteByid(model);
        // System.out.println(model1);
         return model1;
     }


     @RequestMapping("/countmodel")
     public int countmodel(){
         int countmodel = modelService.countmodel();
         return countmodel;
     }

    /**
     * 按id删除model
     */
    @RequestMapping("/delmodelbyid")
    public int delmodelbyid(@RequestBody Model model){
       // System.out.println(model);
        int i = modelService.deleteModel(model);
        return i;
    }
    /**
     * 修改model
     */

    @RequestMapping("/updatemodel")
    public int updatemodel(@RequestBody Model model){
        int i = modelService.updateModel(model);
        return i;
    }


    @RequestMapping("/updatesizes")
    public int updatesizes(@RequestBody Map<String, Object> map){
        List<Object> list=new ArrayList<>();
        List<Object> sizenames = (List<Object>)map.get("sizenames");
        for (Object obj:
        sizenames) {
            list.add(obj);
        }
       // System.out.println(list);

        int i = sizeService.updateSizes(list);
        return i;
    }


}
