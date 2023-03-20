package com.hjf.sms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description 学院信息实体类
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    /**
     * id
     */
    private Integer id;
    /**
     * 学院名
     */
    private String name;

}
