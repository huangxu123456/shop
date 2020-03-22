package com.apesource.shop.controller;

import com.apesource.shop.pojo.ContentCategory;
import com.apesource.shop.service.base.IContentCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class ContentCategoryController {
    @Autowired
    IContentCategoryService contentCategoryService;

    @RequestMapping("/findcontent")
    public List<ContentCategory> selectContentCategory(@RequestBody(required = false) Map<String,String> map){
        //System.out.println(map);
        String name = map.get("name0");
        int page = (Integer.parseInt(map.get("page"))-1)*5;
        //System.out.println("page###"+page);
        int pageSize = Integer.parseInt(map.get("pageSize"));
        List<ContentCategory> result = contentCategoryService.selsetContentCategory(name,page, pageSize);
//        PageInfo<ContentCategory> pi = new PageInfo<ContentCategory>(result);
        return result;
    }
    

    @RequestMapping("/findcontent1")
    public List<ContentCategory> selectContentCategory1(@RequestBody Map<String,String> map){
        //System.out.println(map);
        String name = map.get("name0");
        System.out.println(name);
        int page = (Integer.parseInt(map.get("page"))-1)*5;
        //System.out.println("page###"+page);
        int pageSize = Integer.parseInt(map.get("pageSize"));
        List<ContentCategory> result = contentCategoryService.selsetContentCategory(name,page, pageSize);
//        PageInfo<ContentCategory> pi = new PageInfo<ContentCategory>(result);
        return result;
    }


    @RequestMapping("/addcontent")
    public  int insertContentCategory(@RequestBody ContentCategory contentCategory){
        int n = contentCategoryService.insert(contentCategory);
        return n;
    }

    @RequestMapping("/delcontent")
    public int delectContentCategory(@RequestBody ContentCategory contentCategory){
        int i = contentCategoryService.delectByid(contentCategory.getId());
        return i;
    }


    @RequestMapping("/updatecontent")
    public int updateContentCategory(@RequestBody ContentCategory contentCategory){
        System.out.println("====="+contentCategory);
        int i = contentCategoryService.updateByid(contentCategory);

        return i;
    }

    @RequestMapping("/delectcontentbatchs")
    public void delectbatchs(@RequestBody ContentCategory contentCategories){
        List<Integer> list=new ArrayList<>();
        System.out.println(contentCategories);
        for (ContentCategory contentCategory:
        contentCategories.getContentCategories()) {
            list.add(contentCategory.getId());
        }
        System.out.println("---------------------------"+list);
        contentCategoryService.deletebatch(list);
    }


    @RequestMapping("/selectcount")
    public int selectcount(){
        int selectcount = contentCategoryService.selectcount();
        return selectcount;
    }
}
