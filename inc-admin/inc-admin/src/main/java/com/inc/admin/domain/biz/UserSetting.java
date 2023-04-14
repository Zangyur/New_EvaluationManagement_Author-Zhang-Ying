package com.inc.admin.domain.biz;

import com.inc.admin.domain.sys.BaseEntity;

/**
 * 用户设置实体类
 * 
 * @author tanzibiao
 * @date 2022/01/20
 *
 * @mbg.generated 2022/01/20
 */
public class UserSetting extends BaseEntity {
    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 类别
     */
    private String leibie;

    /**
     * 接收消息
     */
    private Integer isMsg;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLeibie() {
        return leibie;
    }

    public void setLeibie(String leibie) {
        this.leibie = leibie == null ? null : leibie.trim();
    }

    public Integer getIsMsg() {
        return isMsg;
    }

    public void setIsMsg(Integer isMsg) {
        this.isMsg = isMsg;
    }
}