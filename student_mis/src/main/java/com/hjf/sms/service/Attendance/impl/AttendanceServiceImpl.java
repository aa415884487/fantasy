package com.hjf.sms.service.Attendance.impl;

import com.github.pagehelper.PageRowBounds;
import com.hjf.sms.dao.Attendance.AttendanceMapper;
import com.hjf.sms.dto.Attendance;
import com.hjf.sms.service.Attendance.AttendanceService;
import com.hjf.sms.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class AttendanceServiceImpl implements AttendanceService {
    @Resource
    private AttendanceMapper attendanceMapper;
    @Override
    public void addAttendance(Attendance attendance) {
        attendanceMapper.addAttendance(attendance);
    }

    @Override
    public void delete(List<Integer> ids) {
        attendanceMapper.delete(ids);
    }

    @Override
    public void update(Attendance attendance) {
        attendanceMapper.update(attendance);
    }

    @Override
    public PagingResult<Attendance> getAttendanceList(RowBounds rowBounds, Map<String, Object> condition) {
        PageRowBounds pageRowBounds = new PageRowBounds(rowBounds.getOffset(), rowBounds.getLimit());
        List<Attendance> CourseList = attendanceMapper.getAttendanceList(pageRowBounds, condition);
        return new PagingResult<>(CourseList, pageRowBounds.getTotal());
    }

    @Override
    public List<Attendance> getAttendanceByMap(Map<String, Object> condition) {
        return attendanceMapper.getAttendanceByMap(condition);
    }
}
