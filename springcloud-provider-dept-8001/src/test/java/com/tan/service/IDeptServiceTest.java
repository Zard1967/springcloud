package com.tan.service;

import com.tan.TestApplication;
import com.tan.pojo.Dept;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

public class IDeptServiceTest extends TestApplication {
@Resource
private IDeptService deptService;
    @Test
    public void addDept() {
    }

    @Test
    public void findDeptById() {
    }

    @Test
    public void findAll() {
        List<Dept> list = deptService.findAll();
        for (Dept dept : list) {
            System.out.println(dept);
        }
    }
}