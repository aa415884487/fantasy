package com.hjf.sms.controller.Attendance;

import com.hjf.sms.dto.Attendance;
import com.hjf.sms.service.Attendance.AttendanceService;
import com.hjf.sms.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/sms/attendance")
public class AttendanceController {
    @Autowired
    private AttendanceService attendanceService;

    @PostMapping
    public void addAttendance(@RequestBody Attendance attendance) {
        attendanceService.addAttendance(attendance);
    }

    @DeleteMapping("/{ids}")
    public void delete(@PathVariable("ids") Integer[] ids) {
        List<Integer> idsList = Arrays.asList(ids);
        attendanceService.delete(idsList);
    }

    @PutMapping
    public void update(@RequestBody Attendance attendance) {
        attendanceService.update(attendance);
    }

    @GetMapping("/getAttendanceList")
    private PagingResult<Attendance> getCourseList (@RequestParam Map<String, Object> condition,
                                                @RequestParam(required = false, name = "$limit", defaultValue = "10") Integer limit,
                                                @RequestParam(required = false, name = "$offset", defaultValue = "0") Integer offset) {
        RowBounds rowBounds = new RowBounds(offset, limit);
        return attendanceService.getAttendanceList(rowBounds, condition);
    }

    @GetMapping("/getAttendanceByMap")
    private List<Attendance> getAttendanceByMap (@RequestParam Map<String, Object> condition) {
        return attendanceService.getAttendanceByMap(condition);
    }
}
