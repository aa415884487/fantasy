package com.hjf.sms.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description 课程表具体排布实体类
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeekCourse {
    /**
     * id
     */
    private Integer id;
    /**
     * 周一
     */
    private String monday;
    /**
     * 周二
     */
    private String tuesday;
    /**
     * 周三
     */
    private String wednesday;
    /**
     * 周四
     */
    private String thursday;
    /**
     * 周五
     */
    private String friday;
    /**
     * 周六
     */
    private String saturday;
    /**
     * 周日
     */
    private String sunday;
    /**
     * 专业
     */
    private String profession;
    /**
     * 班级
     */
    private String grade;
    /**
     * 学年
     */
    private Integer year;
    /**
     * 学期
     */
    private Integer term;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMonday() {
        return monday;
    }

    public void setMonday(String monday) {
        this.monday = monday;
    }

    public String getTuesday() {
        return tuesday;
    }

    public void setTuesday(String tuesday) {
        this.tuesday = tuesday;
    }

    public String getWednesday() {
        return wednesday;
    }

    public void setWednesday(String wednesday) {
        this.wednesday = wednesday;
    }

    public String getThursday() {
        return thursday;
    }

    public void setThursday(String thursday) {
        this.thursday = thursday;
    }

    public String getFriday() {
        return friday;
    }

    public void setFriday(String friday) {
        this.friday = friday;
    }

    public String getSaturday() {
        return saturday;
    }

    public void setSaturday(String saturday) {
        this.saturday = saturday;
    }

    public String getSunday() {
        return sunday;
    }

    public void setSunday(String sunday) {
        this.sunday = sunday;
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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }
}
