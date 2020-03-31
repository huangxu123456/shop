package com.apesource.shop.dao;

import com.apesource.shop.pojo.Size;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface SizeDao {

    @Insert("INSERT into size(`sname`,`dec`) VALUES(#{sname},#{dec})")
    int insertSize(Size size);

    @Delete("DELETE from size where sid=#{sid}")
    int deleteSize(Size size);

    @Update(" UPDATE size set `sname`=#{sname},`dec`=#{dec} where sid=#{sid}")
    int updateSize(Size size);

    @Select(" SELECT * from size")
    List<Size> seleteSize();


    /**
     * 批量增加
     */
    @Insert("<script> INSERT into size (`sname`,mid) VALUES <foreach collection='list' index='index' item='size' separator=',' >(#{size.name},#{size.mid})</foreach>  </script>")
    int insertsizes(@Param("list") List<Size> list);

    /**
     * 按id查询
     * @return
     */
    @Select(" SELECT * from `size` where mid=#{0}")
    List<Size> seleteSizebymid(int mid);

    @Update("<script> UPDATE size   <foreach collection='list' index='index' item='size' > set  `sname`=#{size.name}  where sid=#{size.id} </foreach> </script>")
    int updateSizes(@Param("list") List<Object> list);
}
