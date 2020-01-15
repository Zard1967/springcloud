package com.tan.service.impl;

import com.tan.mapper.DeptMapper;
import com.tan.pojo.Dept;
import com.tan.service.IDeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class DeptServiceImpl implements IDeptService {
    @Resource
    private DeptMapper deptMapper;
    @Override
    public boolean addDept(Dept dept) {
        return deptMapper.addDept(dept);
    }

    @Override
    public Dept findDeptById(Long id) {
        return deptMapper.findDeptById(id);
    }

    @Override
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }
}
