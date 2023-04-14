package com.inc.admin.dao.biz;

import com.github.pagehelper.Page;
import com.inc.admin.domain.biz.Yiyi;
import com.inc.admin.domain.biz.YiyiCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 消息Dao类
 * 
 * @author tanzibiao
 * @date 2022/01/24
 *
 * @mbg.generated 2022/01/24
 */
@Mapper
public interface YiyiDao {
    /**
     * countByCriteria
     * @param example
     * @return 
     */
    long countByCriteria(YiyiCriteria example);

    /**
     * deleteByCriteria
     * @param example
     * @return 
     */
    int deleteByCriteria(YiyiCriteria example);

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
    int insert(Yiyi record);

    /**
     * insertSelective
     * @param record
     * @return 
     */
    int insertSelective(Yiyi record);

    /**
     * selectByCriteria
     * @param example
     * @return 
     */
    Page<Yiyi> selectByCriteria(YiyiCriteria example);

    /**
     * selectByPrimaryKey
     * @param id
     * @return 
     */
    Yiyi selectByPrimaryKey(Integer id);

    /**
     * updateByCriteriaSelective
     * @param record
     * @param example
     * @return 
     */
    int updateByCriteriaSelective(@Param("record") Yiyi record, @Param("example") YiyiCriteria example);

    /**
     * updateByCriteria
     * @param record
     * @param example
     * @return 
     */
    int updateByCriteria(@Param("record") Yiyi record, @Param("example") YiyiCriteria example);

    /**
     * updateByPrimaryKeySelective
     * @param record
     * @return 
     */
    int updateByPrimaryKeySelective(Yiyi record);

    /**
     * updateByPrimaryKey
     * @param record
     * @return 
     */
    int updateByPrimaryKey(Yiyi record);
}