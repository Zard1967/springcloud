package com.tan.controller;

import com.tan.TestApplication;
import com.tan.pojo.Dept;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class DeptControllerTest extends TestApplication {
    @Resource
    private DeptController deptController;

    @Test
    public void addDept() {
        Dept dept = deptController.addDept("综合部");
        System.out.println(dept);
    }

    @Test
    public void findDeptById() {
        Dept dept = deptController.findDeptById((long) 1);
        System.out.println(dept);
    }

    @Test
    public void findAll() {
        List<Dept> list = deptController.findAll();
        for (Dept dept : list) {
            System.out.println(dept);
        }
    }
}