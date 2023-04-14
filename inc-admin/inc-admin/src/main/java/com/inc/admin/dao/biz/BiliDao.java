package com.inc.admin.dao.biz;

import com.github.pagehelper.Page;
import com.inc.admin.domain.biz.Bili;
import com.inc.admin.domain.biz.BiliCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 成绩比例Dao类
 * 
 * @author tanzibiao
 * @date 2022/01/24
 *
 * @mbg.generated 2022/01/24
 */
@Mapper
public interface BiliDao {
    /**
     * countByCriteria
     * @param example
     * @return 
     */
    long countByCriteria(BiliCriteria example);

    /**
     * deleteByCriteria
     * @param example
     * @return 
     */
    int deleteByCriteria(BiliCriteria example);

    /**
     * deleteByPrimaryKey
     * @param id
     * @return 
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert
     * @param record
     * @return 
     */
    int insert(Bili record);

    /**
     * insertSelective
     * @param record
     * @return 
     */
    int insertSelective(Bili record);

    /**
     * selectByCriteria
     * @param example
     * @return 
     */
    Page<Bili> selectByCriteria(BiliCriteria example);

    /**
     * selectByPrimaryKey
     * @param id
     * @return 
     */
    Bili selectByPrimaryKey(Integer id);

    /**
     * updateByCriteriaSelective
     * @param record
     * @param example
     * @return 
     */
    int updateByCriteriaSelective(@Param("record") Bili record, @Param("example") BiliCriteria example);

    /**
     * updateByCriteria
     * @param record
     * @param example
     * @return 
     */
    int updateByCriteria(@Param("record") Bili record, @Param("example") BiliCriteria example);

    /**
     * updateByPrimaryKeySelective
     * @param record
     * @return 
     */
    int updateByPrimaryKeySelective(Bili record);

    /**
     * updateByPrimaryKey
     * @param record
     * @return 
     */
    int updateByPrimaryKey(Bili record);
}