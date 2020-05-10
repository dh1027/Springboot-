package com.heyuanjun.mapper2;

import com.heyuanjun.entity.Clazz;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ClazzMapper {
    @Select("SELECT * FROM t_clazz WHERE CLAZZ = #{clazz}")
    Clazz findByClazz(@Param("clazz") String clazz);
}
 