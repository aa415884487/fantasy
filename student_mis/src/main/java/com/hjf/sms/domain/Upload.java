package com.hjf.sms.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description 上传
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Upload {
    /**
     * id
     */
    private Integer id;
    /**
     * 用户 id
     */
    private String userId;
    /**
     * 用户等级
     */
    private Integer level;
    /**
     * 储存地址
     */
    private String url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
