package com.apesource.shop.service.base;

import com.apesource.shop.pojo.Size;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ISizeService {


    int insertSize(Size size);


    int deleteSize(Size size);


    int updateSize(Size size);


    List<Size> seleteSize();

    int insertsizes(List<Size> list);


    List<Size> seleteSizebymid(int mid);


    int updateSizes(@Param("list") List<Object> list);
}
