package com.dreamtank.mapper;
import org.apache.ibatis.annotations.*;

@Mapper
public interface EmpMapper {
    @Delete("delete from emp where id = #{num}")
    public void delete(int num);

}
