package com.inc.admin.domain.biz;

import com.inc.admin.domain.sys.BaseEntity;

/**
 * 班级实体类
 * 
 * @author tanzibiao
 * @date 2021/12/13
 *
 * @mbg.generated 2021/12/13
 */
public class Banji extends BaseEntity {
    /**
     * id
     */
    private Integer banjiId;

    /**
     * 学期
     */
    private String xueqi;

    /**
     * 学院
     */
    private String xueyuan;

    /**
     * 班级
     */
    private String banjiName;

    /**
     * 班主任id
     */
    private Integer banzhurenId;

    /**
     * 班主任
     */
    private String banzhurenName;

    /**
     * 辅导员id
     */
    private Integer fudaoyuanId;

    /**
     * 辅导员
     */
    private String fudaoyuanName;

    public Integer getBanjiId() {
        return banjiId;
    }

    public void setBanjiId(Integer banjiId) {
        this.banjiId = banjiId;
    }

    public String getXueqi() {
        return xueqi;
    }

    public void setXueqi(String xueqi) {
        this.xueqi = xueqi;
    }

    public String getXueyuan() {
        return xueyuan;
    }

    public void setXueyuan(String xueyuan) {
        this.xueyuan = xueyuan;
    }

    public String getBanjiName() {
        return banjiName;
    }

    public void setBanjiName(String banjiName) {
        this.banjiName = banjiName == null ? null : banjiName.trim();
    }

    public Integer getBanzhurenId() {
        return banzhurenId;
    }

    public void setBanzhurenId(Integer banzhurenId) {
        this.banzhurenId = banzhurenId;
    }

    public String getBanzhurenName() {
        return banzhurenName;
    }

    public void setBanzhurenName(String banzhurenName) {
        this.banzhurenName = banzhurenName == null ? null : banzhurenName.trim();
    }

    public Integer getFudaoyuanId() {
        return fudaoyuanId;
    }

    public void setFudaoyuanId(Integer fudaoyuanId) {
        this.fudaoyuanId = fudaoyuanId;
    }

    public String getFudaoyuanName() {
        return fudaoyuanName;
    }

    public void setFudaoyuanName(String fudaoyuanName) {
        this.fudaoyuanName = fudaoyuanName == null ? null : fudaoyuanName.trim();
    }
}