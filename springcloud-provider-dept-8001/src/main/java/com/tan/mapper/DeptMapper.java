package com.tan.mapper;

import com.tan.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeptMapper {
    boolean addDept(Dept dept);//添加部门

    Dept findDeptById(Long id);//根据id查询部门

    List<Dept> findAll();//查询所有部门
}
