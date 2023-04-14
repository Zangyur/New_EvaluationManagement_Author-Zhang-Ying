package com.inc.admin.domain.biz;

import com.inc.admin.domain.sys.BaseEntity;
import java.util.Date;

/**
 * 公告实体类
 * 
 * @author tanzibiao
 * @date 2022/01/27
 *
 * @mbg.generated 2022/01/27
 */
public class Gonggao extends BaseEntity {
    /**
     * id
     */
    private Integer id;

    /**
     * 公告内容
     */
    private String msg;

    /**
     * 公告附件
     */
    private String files;

    /**
     */
    private Date time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }

    public String getFiles() {
        return files;
    }

    public void setFiles(String files) {
        this.files = files == null ? null : files.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}