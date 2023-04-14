package com.inc.admin.domain.biz;

import com.inc.admin.domain.sys.BaseEntity;
import java.util.Date;

/**
 * 活动实体类
 * 
 * @author inc
 * @date 2022/01/17
 *
 * @mbg.generated 2022/01/17
 */
public class Huodong extends BaseEntity {
    /**
     */
    private Integer huodongId;
    private Integer studentId;

    /**
     * 活动名称
     */
    private String huodongName;

    /**
     * 活动类别
     */
    private Integer huodongLeibie;

    private String huodongLeibieName;

    /**
     * 活动内容
     */
    private String huodongDesc;

    /**
     * 活动地点
     */
    private String huodongPlace;
    private String huodongStatus;

    /**
     * 活动发布人
     */
    private String huodongProducer;

    /**
     * 活动分值
     */
    private Double huodongFen;

    /**
     * 活动证明
     */
    private String huodongZhengming;

    /**
     * 活动时间
     */
    private String huodongTime;

    public Integer getHuodongId() {
        return huodongId;
    }

    public void setHuodongId(Integer huodongId) {
        this.huodongId = huodongId;
    }

    public String getHuodongName() {
        return huodongName;
    }

    public void setHuodongName(String huodongName) {
        this.huodongName = huodongName == null ? null : huodongName.trim();
    }

    public Integer getHuodongLeibie() {
        return huodongLeibie;
    }

    public void setHuodongLeibie(Integer huodongLeibie) {
        this.huodongLeibie = huodongLeibie;
    }

    public String getHuodongDesc() {
        return huodongDesc;
    }

    public void setHuodongDesc(String huodongDesc) {
        this.huodongDesc = huodongDesc == null ? null : huodongDesc.trim();
    }

    public String getHuodongPlace() {
        return huodongPlace;
    }

    public void setHuodongPlace(String huodongPlace) {
        this.huodongPlace = huodongPlace == null ? null : huodongPlace.trim();
    }

    public String getHuodongProducer() {
        return huodongProducer;
    }

    public void setHuodongProducer(String huodongProducer) {
        this.huodongProducer = huodongProducer == null ? null : huodongProducer.trim();
    }

    public Double getHuodongFen() {
        return huodongFen;
    }

    public void setHuodongFen(Double huodongFen) {
        this.huodongFen = huodongFen;
    }

    public String getHuodongZhengming() {
        return huodongZhengming;
    }

    public void setHuodongZhengming(String huodongZhengming) {
        this.huodongZhengming = huodongZhengming == null ? null : huodongZhengming.trim();
    }

    public String getHuodongTime() {
        return huodongTime;
    }

    public void setHuodongTime(String huodongTime) {
        this.huodongTime = huodongTime;
    }

    public String getHuodongLeibieName() {
        return huodongLeibieName;
    }

    public void setHuodongLeibieName(String huodongLeibieName) {
        this.huodongLeibieName = huodongLeibieName;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getHuodongStatus() {
        return huodongStatus;
    }

    public void setHuodongStatus(String huodongStatus) {
        this.huodongStatus = huodongStatus;
    }
}