package com.hjf.sms.service.Department;

import com.hjf.sms.dto.Department;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Description 学院信息service层
 **/
@Transactional
public interface DepartmentService {
    /**
     * description: 获取学院信息
     */
    List<Department> getDepartmentList();

    /**
     * 添加一个学院
     * @param department
     * @return
     */
    boolean save(Department department);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    boolean delete(Integer id);

}
