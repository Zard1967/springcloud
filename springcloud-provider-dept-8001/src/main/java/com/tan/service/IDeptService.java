package com.tan.service;

import com.tan.pojo.Dept;

import java.util.List;

public interface IDeptService {
    boolean addDept(Dept dept);//添加部门

    Dept findDeptById(Long id);//根据id查询部门

    List<Dept> findAll();//查询所有部门
}
