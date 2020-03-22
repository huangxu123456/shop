package com.apesource.shop.controller;

import com.apesource.shop.pojo.Content;
import com.apesource.shop.service.base.IContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class ContentController {
    @Autowired
    IContentService contentService;

    @RequestMapping("/contentall")
    public List<Content> seleteContent(@RequestBody Map<String,String> map){
        int page = (Integer.parseInt(map.get("page"))-1)*5;
        int pagesize = Integer.parseInt(map.get("pagesize"));
        List<Content> contents = contentService.seleteContent(page,pagesize);
        return contents;
    }

    @RequestMapping("/contentcount")
    public int count(){
        int count = contentService.count();
        return count;
    }

    @RequestMapping("/contentpic")
    public String contentpic(@RequestPart("uploadFile") MultipartFile multipartFile,HttpServletRequest request){
        String originalFilename = multipartFile.getOriginalFilename();
        //System.out.println(originalFilename);
        String newfilename=null;
        String suff = originalFilename.substring(originalFilename.lastIndexOf("."));
        if(".jpg".equals(suff) || ".png".equals(suff)){
            String name=System.currentTimeMillis()+"";
           // System.out.println(name);
            newfilename = name+suff;
            System.out.println("==="+newfilename);
        }
        String newpath="E:\\IDEA\\shop\\src\\main\\resources\\static\\img";
        String endpath=newpath+"\\"+newfilename;
        System.out.println(endpath);
        try {
            multipartFile.transferTo(new File(endpath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return newfilename;
    }

    @RequestMapping("/contentinsert")
    public int contentinsert(@RequestBody Content content){
       // System.out.println(content);
        int i = contentService.insertContent(content);
        return i;
    }


    @RequestMapping("/contentdel")
    public int delect(@RequestBody Map<String,String> map){
        int id = Integer.parseInt(map.get("id"));
        int i = contentService.deleteContent(id);
        return i;
    }


    @RequestMapping("/delscontents")
    public int delscontent(@RequestBody Content contents){
        List<Integer> list=new ArrayList<>();
        for (Content content:
                contents.getContents()) {
            list.add(content.getId());
        }
        int i = contentService.delContents(list);
        return i;
    }


    @RequestMapping("/updetecont")
    public int updeteContent(@RequestBody Content content){
        System.out.println(content);
        int i = contentService.updateContent(content);
        return i;
    }



}
