package com.hjf.sms.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Attendance {
    /**
     * id
     */
    private String id;
    /**
     * 课程名
     */
    private String name;
    /**
     * 学分
     */
    private Double credits;
    /**
     * 学生姓名
     */
    private String student_name;
    /**
     * 课时
     */
    private Integer number;
    /** 签到时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date time;
    /**
     * 地址
     */
    private String address;
    /**
     * 类型 1： 必修  2：选修
     */
    private Integer type;
    /**
     * 专业
     */
    private String profession;
    /**
     * 班级
     */
    private String grade;
    /**
     * 姓名
     */
    private String realName;
    /**
     * 学号
     */
    private String no;
    /**
     * 学生账号
     */
    private String studentId;
    /**
     * 查询的学生绩点
     */
    private String pointByUser;
    /**
     * 查询的学生分数
     */
    private String scoreByUser;
    /**
     * 查询的学生学分
     */
    private String creditsByUser;
    /**
     * 周数 start
     */
    private Integer start;
    /**
     * 周数 end
     */
    private Integer end;
    /**
     * 教室
     */
    private String room;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCredits() {
        return credits;
    }

    public void setCredits(Double credits) {
        this.credits = credits;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getPointByUser() {
        return pointByUser;
    }

    public void setPointByUser(String pointByUser) {
        this.pointByUser = pointByUser;
    }

    public String getScoreByUser() {
        return scoreByUser;
    }

    public void setScoreByUser(String scoreByUser) {
        this.scoreByUser = scoreByUser;
    }

    public String getCreditsByUser() {
        return creditsByUser;
    }

    public void setCreditsByUser(String creditsByUser) {
        this.creditsByUser = creditsByUser;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
}
