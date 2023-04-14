package com.inc.admin.dao.biz;

import com.github.pagehelper.Page;
import com.inc.admin.domain.biz.Canjia;
import com.inc.admin.domain.biz.CanjiaCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 活动参与Dao类
 * 
 * @author tanzibiao
 * @date 2022/01/21
 *
 * @mbg.generated 2022/01/21
 */
@Mapper
public interface CanjiaDao {
    /**
     * countByCriteria
     * @param example
     * @return 
     */
    long countByCriteria(CanjiaCriteria example);

    /**
     * deleteByCriteria
     * @param example
     * @return 
     */
    int deleteByCriteria(CanjiaCriteria example);

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
    int insert(Canjia record);

    /**
     * insertSelective
     * @param record
     * @return 
     */
    int insertSelective(Canjia record);

    /**
     * selectByCriteria
     * @param example
     * @return 
     */
    Page<Canjia> selectByCriteria(CanjiaCriteria example);

    /**
     * selectByPrimaryKey
     * @param id
     * @return 
     */
    Canjia selectByPrimaryKey(Integer id);

    /**
     * updateByCriteriaSelective
     * @param record
     * @param example
     * @return 
     */
    int updateByCriteriaSelective(@Param("record") Canjia record, @Param("example") CanjiaCriteria example);

    /**
     * updateByCriteria
     * @param record
     * @param example
     * @return 
     */
    int updateByCriteria(@Param("record") Canjia record, @Param("example") CanjiaCriteria example);

    /**
     * updateByPrimaryKeySelective
     * @param record
     * @return 
     */
    int updateByPrimaryKeySelective(Canjia record);

    /**
     * updateByPrimaryKey
     * @param record
     * @return 
     */
    int updateByPrimaryKey(Canjia record);

    int insertBatch(List<Canjia> list);
}