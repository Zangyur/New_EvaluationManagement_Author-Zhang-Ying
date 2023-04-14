package com.inc.admin.domain.biz;

import com.inc.admin.domain.sys.BaseEntity;

/**
 * 综测成绩实体类
 * 
 * @author tanzibiao
 * @date 2022/01/24
 *
 * @mbg.generated 2022/01/24
 */
public class Chengji extends BaseEntity {
    /**
     * id
     */
    private Integer zongceId;

    /**
     * 学期
     */
    private String xueqi;

    /**
     * 学院
     */
    private String xueyuan;

    /**
     * 班级id
     */
    private Integer banjiId;

    /**
     * 班级
     */
    private String banjiName;

    /**
     * 学生id
     */
    private Integer xueshengId;

    /**
     * 学生
     */
    private String xueshengName;

    /**
     * 德育成绩
     */
    private Double deyuChengji;

    /**
     * 学业成绩
     */
    private Double xueyeChengji;

    /**
     * 文体成绩
     */
    private Double wentiChengji;

    /**
     * 综测成绩
     */
    private Double zongceChengji;

    /**
     * 异议状态
     */
    private Byte yiyiStatus;

    private String cat1;

    /**
     * 异议内容
     */
    private String yiyiDesc;

    public Integer getZongceId() {
        return zongceId;
    }

    public void setZongceId(Integer zongceId) {
        this.zongceId = zongceId;
    }

    public String getXueqi() {
        return xueqi;
    }

    public void setXueqi(String xueqi) {
        this.xueqi = xueqi == null ? null : xueqi.trim();
    }

    public String getXueyuan() {
        return xueyuan;
    }

    public void setXueyuan(String xueyuan) {
        this.xueyuan = xueyuan == null ? null : xueyuan.trim();
    }

    public Integer getBanjiId() {
        return banjiId;
    }

    public void setBanjiId(Integer banjiId) {
        this.banjiId = banjiId;
    }

    public String getBanjiName() {
        return banjiName;
    }

    public void setBanjiName(String banjiName) {
        this.banjiName = banjiName == null ? null : banjiName.trim();
    }

    public Integer getXueshengId() {
        return xueshengId;
    }

    public void setXueshengId(Integer xueshengId) {
        this.xueshengId = xueshengId;
    }

    public String getXueshengName() {
        return xueshengName;
    }

    public void setXueshengName(String xueshengName) {
        this.xueshengName = xueshengName == null ? null : xueshengName.trim();
    }

    public Double getDeyuChengji() {
        return deyuChengji;
    }

    public void setDeyuChengji(Double deyuChengji) {
        this.deyuChengji = deyuChengji;
    }

    public Double getXueyeChengji() {
        return xueyeChengji;
    }

    public void setXueyeChengji(Double xueyeChengji) {
        this.xueyeChengji = xueyeChengji;
    }

    public Double getWentiChengji() {
        return wentiChengji;
    }

    public void setWentiChengji(Double wentiChengji) {
        this.wentiChengji = wentiChengji;
    }

    public Double getZongceChengji() {
        return zongceChengji;
    }

    public void setZongceChengji(Double zongceChengji) {
        this.zongceChengji = zongceChengji;
    }

    public Byte getYiyiStatus() {
        return yiyiStatus;
    }

    public void setYiyiStatus(Byte yiyiStatus) {
        this.yiyiStatus = yiyiStatus;
    }

    public String getYiyiDesc() {
        return yiyiDesc;
    }

    public void setYiyiDesc(String yiyiDesc) {
        this.yiyiDesc = yiyiDesc == null ? null : yiyiDesc.trim();
    }

    public String getCat1() {
        return cat1;
    }

    public void setCat1(String cat1) {
        this.cat1 = cat1;
    }
}