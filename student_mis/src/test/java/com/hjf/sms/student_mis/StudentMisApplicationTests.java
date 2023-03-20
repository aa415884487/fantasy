package com.hjf.sms.student_mis;

import com.hjf.sms.dao.Attend.AttendMapper;
import com.hjf.sms.dao.Attendance.AttendanceMapper;
import com.hjf.sms.dao.Course.CourseMapper;
import com.hjf.sms.dao.Department.DepartmentMapper;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Collections;


@SpringBootTest
class StudentMisApplicationTests {

  @Autowired
  private AttendMapper attendMapper;

  @Autowired
  private DepartmentMapper departmentMapper;

  @Autowired
  private CourseMapper courseMapper;

  @Autowired
  private AttendanceMapper attendanceMapper;

  @Test
  void test(){
    System.out.println(attendanceMapper.getAttendanceById(String.valueOf(132)));
    attendanceMapper.delete(Collections.singletonList(132));
  }

  @Test
  void getCourse() {
    courseMapper.delete(Arrays.asList(2023011001,2023011002));
    System.out.println("========================================");
    System.out.println(courseMapper.getCourseById("12312311001"));

  }

  @Test
  void contextLoads() {
//    System.out.println(attendMapper.delete((long) 81));
    System.out.println(attendMapper.selectAll());
  }

  @Test
  void get(){
    System.out.println(departmentMapper.getDepartmentList());
    System.out.println(departmentMapper.getDepartmentIdByName("设计"));
    System.out.println(departmentMapper.delete(2));
  }
}
