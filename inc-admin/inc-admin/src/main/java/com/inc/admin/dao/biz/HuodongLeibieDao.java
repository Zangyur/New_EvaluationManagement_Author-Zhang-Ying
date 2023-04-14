package com.inc.admin.dao.biz;

import com.github.pagehelper.Page;
import com.inc.admin.domain.biz.HuodongLeibie;
import com.inc.admin.domain.biz.HuodongLeibieCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 活动类别Dao类
 * 
 * @author tanzibiao
 * @date 2022/01/22
 *
 * @mbg.generated 2022/01/22
 */
@Mapper
public interface HuodongLeibieDao {
    /**
     * countByCriteria
     * @param example
     * @return 
     */
    long countByCriteria(HuodongLeibieCriteria example);

    /**
     * deleteByCriteria
     * @param example
     * @return 
     */
    int deleteByCriteria(HuodongLeibieCriteria example);

    /**
     * deleteByPrimaryKey
     * @param huodongleibieId
     * @return 
     */
    int deleteByPrimaryKey(Integer huodongleibieId);

    /**
     * insert
     * @param record
     * @return 
     */
    int insert(HuodongLeibie record);

    /**
     * insertSelective
     * @param record
     * @return 
     */
    int insertSelective(HuodongLeibie record);

    /**
     * selectByCriteria
     * @param example
     * @return 
     */
    Page<HuodongLeibie> selectByCriteria(HuodongLeibieCriteria example);

    /**
     * selectByPrimaryKey
     * @param huodongleibieId
     * @return 
     */
    HuodongLeibie selectByPrimaryKey(Integer huodongleibieId);

    /**
     * updateByCriteriaSelective
     * @param record
     * @param example
     * @return 
     */
    int updateByCriteriaSelective(@Param("record") HuodongLeibie record, @Param("example") HuodongLeibieCriteria example);

    /**
     * updateByCriteria
     * @param record
     * @param example
     * @return 
     */
    int updateByCriteria(@Param("record") HuodongLeibie record, @Param("example") HuodongLeibieCriteria example);

    /**
     * updateByPrimaryKeySelective
     * @param record
     * @return 
     */
    int updateByPrimaryKeySelective(HuodongLeibie record);

    /**
     * updateByPrimaryKey
     * @param record
     * @return 
     */
    int updateByPrimaryKey(HuodongLeibie record);
}