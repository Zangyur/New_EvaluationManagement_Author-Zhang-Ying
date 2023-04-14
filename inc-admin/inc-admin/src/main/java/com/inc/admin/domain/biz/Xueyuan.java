package com.inc.admin.domain.biz;

import com.inc.admin.domain.sys.BaseEntity;

/**
 * 学院实体类
 * 
 * @author tanzibiao
 * @date 2021/12/16
 *
 * @mbg.generated 2021/12/16
 */
public class Xueyuan extends BaseEntity {
    /**
     * id
     */
    private Integer xueyuanId;

    /**
     * 学院
     */
    private String xueyuanName;

    /**
     * 学院领导
     */
    private String xueyuanLingdao;

    /**
     * 学院领导id
     */
    private Integer xueyuanLingdaoId;

    public Integer getXueyuanId() {
        return xueyuanId;
    }

    public void setXueyuanId(Integer xueyuanId) {
        this.xueyuanId = xueyuanId;
    }

    public String getXueyuanName() {
        return xueyuanName;
    }

    public void setXueyuanName(String xueyuanName) {
        this.xueyuanName = xueyuanName == null ? null : xueyuanName.trim();
    }

    public String getXueyuanLingdao() {
        return xueyuanLingdao;
    }

    public void setXueyuanLingdao(String xueyuanLingdao) {
        this.xueyuanLingdao = xueyuanLingdao == null ? null : xueyuanLingdao.trim();
    }

    public Integer getXueyuanLingdaoId() {
        return xueyuanLingdaoId;
    }

    public void setXueyuanLingdaoId(Integer xueyuanLingdaoId) {
        this.xueyuanLingdaoId = xueyuanLingdaoId;
    }
}