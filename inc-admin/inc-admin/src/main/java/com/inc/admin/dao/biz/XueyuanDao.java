package com.inc.admin.dao.biz;

import com.github.pagehelper.Page;
import com.inc.admin.domain.biz.Xueyuan;
import com.inc.admin.domain.biz.XueyuanCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 学院Dao类
 * 
 * @author tanzibiao
 * @date 2021/12/16
 *
 * @mbg.generated 2021/12/16
 */
@Mapper
public interface XueyuanDao {
    /**
     * countByCriteria
     * @param example
     * @return 
     */
    long countByCriteria(XueyuanCriteria example);

    /**
     * deleteByCriteria
     * @param example
     * @return 
     */
    int deleteByCriteria(XueyuanCriteria example);

    /**
     * deleteByPrimaryKey
     * @param xueyuanId
     * @return 
     */
    int deleteByPrimaryKey(Integer xueyuanId);

    /**
     * insert
     * @param record
     * @return 
     */
    int insert(Xueyuan record);

    /**
     * insertSelective
     * @param record
     * @return 
     */
    int insertSelective(Xueyuan record);

    /**
     * selectByCriteria
     * @param example
     * @return 
     */
    Page<Xueyuan> selectByCriteria(XueyuanCriteria example);

    /**
     * selectByPrimaryKey
     * @param xueyuanId
     * @return 
     */
    Xueyuan selectByPrimaryKey(Integer xueyuanId);

    /**
     * updateByCriteriaSelective
     * @param record
     * @param example
     * @return 
     */
    int updateByCriteriaSelective(@Param("record") Xueyuan record, @Param("example") XueyuanCriteria example);

    /**
     * updateByCriteria
     * @param record
     * @param example
     * @return 
     */
    int updateByCriteria(@Param("record") Xueyuan record, @Param("example") XueyuanCriteria example);

    /**
     * updateByPrimaryKeySelective
     * @param record
     * @return 
     */
    int updateByPrimaryKeySelective(Xueyuan record);

    /**
     * updateByPrimaryKey
     * @param record
     * @return 
     */
    int updateByPrimaryKey(Xueyuan record);
}