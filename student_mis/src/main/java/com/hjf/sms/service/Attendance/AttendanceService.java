package com.hjf.sms.service.Attendance;

import com.hjf.sms.dto.Attendance;
import com.hjf.sms.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

public interface AttendanceService {

    void addAttendance(Attendance Attendance);

    void delete(List<Integer> ids);


    void update(Attendance Attendance);

    PagingResult<Attendance> getAttendanceList(RowBounds rowBounds, Map<String, Object> condition);


    List<Attendance> getAttendanceByMap(Map<String, Object> condition);
}
