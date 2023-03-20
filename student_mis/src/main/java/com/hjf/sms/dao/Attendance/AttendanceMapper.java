package com.hjf.sms.dao.Attendance;

import com.github.pagehelper.PageRowBounds;

import com.hjf.sms.dto.Attendance;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
@Mapper
public interface AttendanceMapper {
    void addAttendance(Attendance attendance);

    void delete(@Param("ids") List<Integer> ids);

    void update(Attendance attendance);

    List<Attendance> getAttendanceList(PageRowBounds rowBounds, @Param("condition") Map<String, Object> condition);

    String checkCodeCount(@Param("condition") Map<String, Object> condition);

    List<Attendance> getAttendanceByMap(@Param("condition") Map<String, Object> condition);

    Attendance getAttendanceById(@Param("id") String id);
}
