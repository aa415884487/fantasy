package com.hjf.sms.service.Department.impl;

import com.hjf.sms.dao.Department.DepartmentMapper;
import com.hjf.sms.dto.Department;
import com.hjf.sms.service.Department.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * Description 学院信息service层
 **/
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;


    @Override
    public List<Department> getDepartmentList() {
        return departmentMapper.getDepartmentList();
    }

    @Override
    public boolean save(Department department) {
        return departmentMapper.save(department) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return departmentMapper.delete(id) > 0;
    }






}
