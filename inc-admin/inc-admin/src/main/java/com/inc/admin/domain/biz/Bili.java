package com.inc.admin.domain.biz;

import com.inc.admin.domain.sys.BaseEntity;

/**
 * 成绩比例实体类
 * 
 * @author tanzibiao
 * @date 2022/01/24
 *
 * @mbg.generated 2022/01/24
 */
public class Bili extends BaseEntity {
    /**
     * ID
     */
    private Integer id;

    /**
     * 德育
     */
    private Float deyu;

    /**
     * 学业
     */
    private Float xueye;

    /**
     * 文体
     */
    private Float wenti;

    /**
     * 其他
     */
    private Float qita;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getDeyu() {
        return deyu;
    }

    public void setDeyu(Float deyu) {
        this.deyu = deyu;
    }

    public Float getXueye() {
        return xueye;
    }

    public void setXueye(Float xueye) {
        this.xueye = xueye;
    }

    public Float getWenti() {
        return wenti;
    }

    public void setWenti(Float wenti) {
        this.wenti = wenti;
    }

    public Float getQita() {
        return qita;
    }

    public void setQita(Float qita) {
        this.qita = qita;
    }
}