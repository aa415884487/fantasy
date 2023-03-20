package com.hjf.sms.controller.Department;

import com.hjf.sms.dto.Department;
import com.hjf.sms.service.Department.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Description 所有学院控制层
 **/
@RestController
@RequestMapping("/api/sms/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    /**
     * 添加
     * @param department
     */
    @PostMapping
    public void save(@RequestBody Department department){
        departmentService.save(department);
    }

    /**
     * 删除
     * @param id
     */
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        departmentService.delete(id);
    }

}
