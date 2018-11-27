package com.baizhi.cmfz.dao;


import com.baizhi.cmfz.entity.Admin;
import org.apache.ibatis.annotations.Param;

public interface AdminDao {

    public Admin login(@Param("u") String username, @Param("p") String password);

}
