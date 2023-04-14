package com.inc.admin.dao.biz;

import com.github.pagehelper.Page;
import com.inc.admin.domain.biz.Chengji;
import com.inc.admin.domain.biz.ChengjiCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 综测成绩Dao类
 * 
 * @author tanzibiao
 * @date 2022/01/24
 *
 * @mbg.generated 2022/01/24
 */
@Mapper
public interface ChengjiDao {
    /**
     * countByCriteria
     * @param example
     * @return 
     */
    long countByCriteria(ChengjiCriteria example);

    /**
     * deleteByCriteria
     * @param example
     * @return 
     */
    int deleteByCriteria(ChengjiCriteria example);

    /**
     * deleteByPrimaryKey
     * @param zongceId
     * @return 
     */
    int deleteByPrimaryKey(Integer zongceId);

    /**
     * insert
     * @param record
     * @return 
     */
    int insert(Chengji record);

    /**
     * insertSelective
     * @param record
     * @return 
     */
    int insertSelective(Chengji record);

    /**
     * selectByCriteria
     * @param example
     * @return 
     */
    Page<Chengji> selectByCriteria(ChengjiCriteria example);

    /**
     * selectByPrimaryKey
     * @param zongceId
     * @return 
     */
    Chengji selectByPrimaryKey(Integer zongceId);

    /**
     * updateByCriteriaSelective
     * @param record
     * @param example
     * @return 
     */
    int updateByCriteriaSelective(@Param("record") Chengji record, @Param("example") ChengjiCriteria example);

    /**
     * updateByCriteria
     * @param record
     * @param example
     * @return 
     */
    int updateByCriteria(@Param("record") Chengji record, @Param("example") ChengjiCriteria example);

    /**
     * updateByPrimaryKeySelective
     * @param record
     * @return 
     */
    int updateByPrimaryKeySelective(Chengji record);

    /**
     * updateByPrimaryKey
     * @param record
     * @return 
     */
    int updateByPrimaryKey(Chengji record);
}