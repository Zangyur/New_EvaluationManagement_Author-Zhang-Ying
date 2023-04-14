package com.inc.admin.dao.biz;

import com.github.pagehelper.Page;
import com.inc.admin.domain.biz.Gonggao;
import com.inc.admin.domain.biz.GonggaoCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 公告Dao类
 * 
 * @author tanzibiao
 * @date 2021/12/16
 *
 * @mbg.generated 2021/12/16
 */
@Mapper
public interface GonggaoDao {
    /**
     * countByCriteria
     * @param example
     * @return 
     */
    long countByCriteria(GonggaoCriteria example);

    /**
     * deleteByCriteria
     * @param example
     * @return 
     */
    int deleteByCriteria(GonggaoCriteria example);

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
    int insert(Gonggao record);

    /**
     * insertSelective
     * @param record
     * @return 
     */
    int insertSelective(Gonggao record);

    /**
     * selectByCriteria
     * @param example
     * @return 
     */
    Page<Gonggao> selectByCriteria(GonggaoCriteria example);

    /**
     * selectByPrimaryKey
     * @param id
     * @return 
     */
    Gonggao selectByPrimaryKey(Integer id);

    /**
     * updateByCriteriaSelective
     * @param record
     * @param example
     * @return 
     */
    int updateByCriteriaSelective(@Param("record") Gonggao record, @Param("example") GonggaoCriteria example);

    /**
     * updateByCriteria
     * @param record
     * @param example
     * @return 
     */
    int updateByCriteria(@Param("record") Gonggao record, @Param("example") GonggaoCriteria example);

    /**
     * updateByPrimaryKeySelective
     * @param record
     * @return 
     */
    int updateByPrimaryKeySelective(Gonggao record);

    /**
     * updateByPrimaryKey
     * @param record
     * @return 
     */
    int updateByPrimaryKey(Gonggao record);
}