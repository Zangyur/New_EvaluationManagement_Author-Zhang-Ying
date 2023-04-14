package com.inc.admin.domain.biz;

import com.inc.admin.domain.sys.BaseEntity;

/**
 * 活动参与实体类
 *
 * @author tanzibiao
 * @date 2022/01/22
 *
 * @mbg.generated 2022/01/22
 */
public class Canjia extends BaseEntity {
    /**
     * ID
     */
    private Integer id;

    /**
     * 学生id
     */
    private Integer studentId;
    private String studentName;

    /**
     * 活动id
     */
    private Integer huodongId;
    private Integer xiaonei;

    /**
     * 活动证明
     */
    private String canjiaZhengming;

    /**
     * 参加状态
     */
    private Integer canjiaStatus;

    /**
     * 分值
     */
    private Float fen;

    /**
     * 活动主题
     */
    private String huodongName;

    /**
     * 活动内容
     */
    private String huodongContent;

    /**
     * 活动类型
     */
    private String huodongLeibie;
    private String huodongTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getHuodongId() {
        return huodongId;
    }

    public void setHuodongId(Integer huodongId) {
        this.huodongId = huodongId;
    }

    public String getCanjiaZhengming() {
        return canjiaZhengming;
    }

    public void setCanjiaZhengming(String canjiaZhengming) {
        this.canjiaZhengming = canjiaZhengming == null ? null : canjiaZhengming.trim();
    }

    public Integer getCanjiaStatus() {
        return canjiaStatus;
    }

    public void setCanjiaStatus(Integer canjiaStatus) {
        this.canjiaStatus = canjiaStatus;
    }

    public Float getFen() {
        return fen;
    }

    public void setFen(Float fen) {
        this.fen = fen;
    }

    public String getHuodongName() {
        return huodongName;
    }

    public void setHuodongName(String huodongName) {
        this.huodongName = huodongName == null ? null : huodongName.trim();
    }

    public String getHuodongContent() {
        return huodongContent;
    }

    public void setHuodongContent(String huodongContent) {
        this.huodongContent = huodongContent == null ? null : huodongContent.trim();
    }

    public String getHuodongLeibie() {
        return huodongLeibie;
    }

    public void setHuodongLeibie(String huodongLeibie) {
        this.huodongLeibie = huodongLeibie == null ? null : huodongLeibie.trim();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getXiaonei() {
        return xiaonei;
    }

    public void setXiaonei(Integer xiaonei) {
        this.xiaonei = xiaonei;
    }

    public String getHuodongTime() {
        return huodongTime;
    }

    public void setHuodongTime(String huodongTime) {
        this.huodongTime = huodongTime;
    }
}