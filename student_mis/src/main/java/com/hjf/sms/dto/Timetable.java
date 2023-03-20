package com.hjf.sms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description 课程表实体类
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Timetable {
    /**
     * id
     */
    private Integer id;
    /**
     * week id
     */
    private Integer weekId;
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

    public Integer getWeekId() {
        return weekId;
    }

    public void setWeekId(Integer weekId) {
        this.weekId = weekId;
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
