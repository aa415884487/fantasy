package com.hjf.sms.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description 专业实体类
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Profession {
    /**
     * 专业id
     */
    private Integer id;
    /**
     * 专业名
     */
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
