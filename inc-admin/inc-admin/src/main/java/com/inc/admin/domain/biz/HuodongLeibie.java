package com.inc.admin.domain.biz;

import com.inc.admin.domain.sys.BaseEntity;

/**
 * 活动类别实体类
 * 
 * @author tanzibiao
 * @date 2022/01/22
 *
 * @mbg.generated 2022/01/22
 */
public class HuodongLeibie extends BaseEntity {
    /**
     */
    private Integer huodongleibieId;

    /**
     * 活动类别
     */
    private String huodongleibieName;

    /**
     * 分值
     */
    private Double huodongleibieFen;
    private Double bili;

    public Integer getHuodongleibieId() {
        return huodongleibieId;
    }

    public void setHuodongleibieId(Integer huodongleibieId) {
        this.huodongleibieId = huodongleibieId;
    }

    public String getHuodongleibieName() {
        return huodongleibieName;
    }

    public void setHuodongleibieName(String huodongleibieName) {
        this.huodongleibieName = huodongleibieName == null ? null : huodongleibieName.trim();
    }

    public Double getHuodongleibieFen() {
        return huodongleibieFen;
    }

    public void setHuodongleibieFen(Double huodongleibieFen) {
        this.huodongleibieFen = huodongleibieFen;
    }

    public Double getBili() {
        return bili;
    }

    public void setBili(Double bili) {
        this.bili = bili;
    }
}