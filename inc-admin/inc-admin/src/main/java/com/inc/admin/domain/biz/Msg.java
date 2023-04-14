package com.inc.admin.domain.biz;

import com.inc.admin.domain.sys.BaseEntity;

import java.util.Date;

/**
 * 消息实体类
 * 
 * @author tanzibiao
 * @date 2022/01/20
 *
 * @mbg.generated 2022/01/20
 */
public class Msg extends BaseEntity {
    /**
     * id
     */
    private Integer id;

    /**
     */
    private String content;

    /**
     */
    private Integer userId;

    /**
     */
    private String userName;

    private Date time;

    /**
     * 状态
     */
    private Byte status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Msg( Integer userId, String content) {
        this.content = content;
        this.userId = userId;
        this.time = new Date();
    }

    public Msg() {
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}