package com.inc.admin.dao.biz;

import com.github.pagehelper.Page;
import com.inc.admin.domain.biz.Huodong;
import com.inc.admin.domain.biz.HuodongCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 活动Dao类
 * 
 * @author inc
 * @date 2022/01/17
 *
 * @mbg.generated 2022/01/17
 */
@Mapper
public interface HuodongDao {
    /**
     * countByCriteria
     * @param example
     * @return 
     */
    long countByCriteria(HuodongCriteria example);

    /**
     * deleteByCriteria
     * @param example
     * @return 
     */
    int deleteByCriteria(HuodongCriteria example);

    /**
     * deleteByPrimaryKey
     * @param huodongId
     * @return 
     */
    int deleteByPrimaryKey(Integer huodongId);

    /**
     * insert
     * @param record
     * @return 
     */
    int insert(Huodong record);

    /**
     * insertSelective
     * @param record
     * @return 
     */
    int insertSelective(Huodong record);

    /**
     * selectByCriteria
     * @param example
     * @return 
     */
    Page<Huodong> selectByCriteria(HuodongCriteria example);
    Page<Huodong> canjialist(HuodongCriteria example);

    /**
     * selectByPrimaryKey
     * @param huodongId
     * @return 
     */
    Huodong selectByPrimaryKey(Integer huodongId);

    /**
     * updateByCriteriaSelective
     * @param record
     * @param example
     * @return 
     */
    int updateByCriteriaSelective(@Param("record") Huodong record, @Param("example") HuodongCriteria example);

    /**
     * updateByCriteria
     * @param record
     * @param example
     * @return 
     */
    int updateByCriteria(@Param("record") Huodong record, @Param("example") HuodongCriteria example);

    /**
     * updateByPrimaryKeySelective
     * @param record
     * @return 
     */
    int updateByPrimaryKeySelective(Huodong record);

    /**
     * updateByPrimaryKey
     * @param record
     * @return 
     */
    int updateByPrimaryKey(Huodong record);
}