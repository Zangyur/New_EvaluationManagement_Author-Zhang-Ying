package com.inc.admin.domain.biz;

import com.inc.admin.domain.sys.BaseEntity;

/**
 * 课程实体类
 * 
 * @author tanzibiao
 * @date 2021/12/14
 *
 * @mbg.generated 2021/12/14
 */
public class Kecheng extends BaseEntity {
    /**
     * id
     */
    private Integer kechengId;

    /**
     * 课程
     */
    private String kechengName;

    /**
     * 教师id
     */
    private Integer laoshiId;

    /**
     * 教师
     */
    private String laoshiName;

    /**
     * 学期
     */
    private String xueqi;

    /**
     * 学院
     */
    private String xueyuan;

    public Integer getKechengId() {
        return kechengId;
    }

    public void setKechengId(Integer kechengId) {
        this.kechengId = kechengId;
    }

    public String getKechengName() {
        return kechengName;
    }

    public void setKechengName(String kechengName) {
        this.kechengName = kechengName == null ? null : kechengName.trim();
    }

    public Integer getLaoshiId() {
        return laoshiId;
    }

    public void setLaoshiId(Integer laoshiId) {
        this.laoshiId = laoshiId;
    }

    public String getLaoshiName() {
        return laoshiName;
    }

    public void setLaoshiName(String laoshiName) {
        this.laoshiName = laoshiName == null ? null : laoshiName.trim();
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
}