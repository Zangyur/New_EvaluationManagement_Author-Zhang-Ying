package com.inc.admin.dao.biz;

import com.github.pagehelper.Page;
import com.inc.admin.domain.biz.Xueqi;
import com.inc.admin.domain.biz.XueqiCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 学期Dao类
 * 
 * @author tanzibiao
 * @date 2021/12/16
 *
 * @mbg.generated 2021/12/16
 */
@Mapper
public interface XueqiDao {
    /**
     * countByCriteria
     * @param example
     * @return 
     */
    long countByCriteria(XueqiCriteria example);

    /**
     * deleteByCriteria
     * @param example
     * @return 
     */
    int deleteByCriteria(XueqiCriteria example);

    /**
     * deleteByPrimaryKey
     * @param xueqi
     * @return 
     */
    int deleteByPrimaryKey(String xueqi);

    /**
     * insert
     * @param record
     * @return 
     */
    int insert(Xueqi record);

    /**
     * insertSelective
     * @param record
     * @return 
     */
    int insertSelective(Xueqi record);

    /**
     * selectByCriteria
     * @param example
     * @return 
     */
    Page<Xueqi> selectByCriteria(XueqiCriteria example);

    /**
     * updateByCriteriaSelective
     * @param record
     * @param example
     * @return 
     */
    int updateByCriteriaSelective(@Param("record") Xueqi record, @Param("example") XueqiCriteria example);

    /**
     * updateByCriteria
     * @param record
     * @param example
     * @return 
     */
    int updateByCriteria(@Param("record") Xueqi record, @Param("example") XueqiCriteria example);
}