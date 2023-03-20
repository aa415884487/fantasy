package com.hjf.sms.dao.Department;

import com.hjf.sms.dto.Department;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface DepartmentMapper {


    /**
     * 插入一条数据
     *
     * @param department
     */
    @Insert("insert into department values(null,#{name})")
    int save(Department department);


    /**
     * 删除一条数据
     *
     * @param id
     */
    @Delete("delete from department where id = #{id}")
    int delete(Integer id);





    /**
     * description: 获取所有学院
     * return: List<Department>
     */
    List<Department> getDepartmentList();


    /**
     * description: 新增学院
     * @param: Department
     * return: void
     * @return
     */
    boolean addDepartment(Department department);

    /**
     * description: 删除学院
     * @param: Integer
     * return: void
     */
    void deleteDepartment(@Param("ids") Integer ids);


    /**
     * description: 根据学院名查询专业信息
     * @param: String
     * return: Department
     */
    Department getDepartmentIdByName(@Param("name") String name);
}
