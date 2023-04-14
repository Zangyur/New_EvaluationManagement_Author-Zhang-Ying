package com.inc.admin.dao.biz;

import com.github.pagehelper.Page;
import com.inc.admin.domain.biz.Xueyuanzhuangtai;
import com.inc.admin.domain.biz.XueyuanzhuangtaiCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 学生状态Dao类
 * 
 * @author tanzibiao
 * @date 2021/12/16
 *
 * @mbg.generated 2021/12/16
 */
@Mapper
public interface XueyuanzhuangtaiDao {
    /**
     * countByCriteria
     * @param example
     * @return 
     */
    long countByCriteria(XueyuanzhuangtaiCriteria example);

    /**
     * deleteByCriteria
     * @param example
     * @return 
     */
    int deleteByCriteria(XueyuanzhuangtaiCriteria example);

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
    int insert(Xueyuanzhuangtai record);

    /**
     * insertSelective
     * @param record
     * @return 
     */
    int insertSelective(Xueyuanzhuangtai record);

    /**
     * selectByCriteria
     * @param example
     * @return 
     */
    Page<Xueyuanzhuangtai> selectByCriteria(XueyuanzhuangtaiCriteria example);

    /**
     * selectByPrimaryKey
     * @param id
     * @return 
     */
    Xueyuanzhuangtai selectByPrimaryKey(Integer id);

    /**
     * updateByCriteriaSelective
     * @param record
     * @param example
     * @return 
     */
    int updateByCriteriaSelective(@Param("record") Xueyuanzhuangtai record, @Param("example") XueyuanzhuangtaiCriteria example);

    /**
     * updateByCriteria
     * @param record
     * @param example
     * @return 
     */
    int updateByCriteria(@Param("record") Xueyuanzhuangtai record, @Param("example") XueyuanzhuangtaiCriteria example);

    /**
     * updateByPrimaryKeySelective
     * @param record
     * @return 
     */
    int updateByPrimaryKeySelective(Xueyuanzhuangtai record);

    /**
     * updateByPrimaryKey
     * @param record
     * @return 
     */
    int updateByPrimaryKey(Xueyuanzhuangtai record);
}