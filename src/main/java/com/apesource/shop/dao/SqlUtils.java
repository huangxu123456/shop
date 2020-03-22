package com.apesource.shop.dao;

import com.apesource.shop.pojo.ContentCategory;
import com.apesource.shop.pojo.Model;
import com.apesource.shop.pojo.Seller;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public class SqlUtils {

    public String selectContentCategory(String name,int page, int pageSize){
        StringBuilder sb=new StringBuilder();
        sb.append("SELECT * from tb_content_category where 1=1 ");
        if(!"".equals(name) && name!=null){
            sb.append(" and `name` like  '%"+name+"%'");
        }
        sb.append(" limit "+page+","+pageSize);
        System.out.println(sb);
        return sb.toString();
    }

    public String delectContentCategorys( List<Integer> list){
        System.out.println("动态spl"+list);
        StringBuilder sb=new StringBuilder();
        sb.append("<script>");
        sb.append(" delete from tb_content_category where id in ");
        sb.append("<foreach collection='list' item='id' open='(' separator=',' close=')'> ");
        sb.append("  #{id}");
        sb.append(" </foreach>");
        sb.append(" </script>");
        return sb.toString();
    }


    public String seleteseller(Seller seller){
        StringBuilder sb=new StringBuilder();
        sb.append("SELECT * from seller where 1=1  ");
        if(!"".equals(seller.getName()) && seller.getName()!=null){
            sb.append(" and `name`=#{name}" );
        }
        if(!"".equals(seller.getNickName()) && seller.getNickName()!=null){
            sb.append(" and nick_name=#{nickName} " );
        }
        if(seller.getStatus()!=0){
            sb.append(" and `status`=#{status} " );
        }
        sb.append(" limit #{page},#{pagesize}");
        return sb.toString();

    }


    public String seleteModels(Model model){
        StringBuilder sb=new StringBuilder();
        sb.append(" SELECT * from model where 1=1 ");
        if(!"".equals(model.getName()) && model.getName()!=null ){
            sb.append(" and `name`=#{name}");
        }
        sb.append(" limit #{page},#{pagesize}");
        return  sb.toString();
    }

}
