package com.inc.admin.dao.biz;

import com.github.pagehelper.Page;
import com.inc.admin.domain.biz.Kecheng;
import com.inc.admin.domain.biz.KechengCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 课程Dao类
 * 
 * @author tanzibiao
 * @date 2021/12/14
 *
 * @mbg.generated 2021/12/14
 */
@Mapper
public interface KechengDao {
    /**
     * countByCriteria
     * @param example
     * @return 
     */
    long countByCriteria(KechengCriteria example);

    /**
     * deleteByCriteria
     * @param example
     * @return 
     */
    int deleteByCriteria(KechengCriteria example);

    /**
     * deleteByPrimaryKey
     * @param kechengId
     * @return 
     */
    int deleteByPrimaryKey(Integer kechengId);

    /**
     * insert
     * @param record
     * @return 
     */
    int insert(Kecheng record);

    /**
     * insertSelective
     * @param record
     * @return 
     */
    int insertSelective(Kecheng record);

    /**
     * selectByCriteria
     * @param example
     * @return 
     */
    Page<Kecheng> selectByCriteria(KechengCriteria example);

    /**
     * selectByPrimaryKey
     * @param kechengId
     * @return 
     */
    Kecheng selectByPrimaryKey(Integer kechengId);

    /**
     * updateByCriteriaSelective
     * @param record
     * @param example
     * @return 
     */
    int updateByCriteriaSelective(@Param("record") Kecheng record, @Param("example") KechengCriteria example);

    /**
     * updateByCriteria
     * @param record
     * @param example
     * @return 
     */
    int updateByCriteria(@Param("record") Kecheng record, @Param("example") KechengCriteria example);

    /**
     * updateByPrimaryKeySelective
     * @param record
     * @return 
     */
    int updateByPrimaryKeySelective(Kecheng record);

    /**
     * updateByPrimaryKey
     * @param record
     * @return 
     */
    int updateByPrimaryKey(Kecheng record);

    int insertBatch(List<Kecheng> list);
}