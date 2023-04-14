package com.inc.admin.dao.biz;

import com.github.pagehelper.Page;
import com.inc.admin.domain.biz.Banji;
import com.inc.admin.domain.biz.BanjiCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 班级Dao类
 * 
 * @author tanzibiao
 * @date 2021/12/13
 *
 * @mbg.generated 2021/12/13
 */
@Mapper
public interface BanjiDao {
    /**
     * countByCriteria
     * @param example
     * @return 
     */
    long countByCriteria(BanjiCriteria example);

    /**
     * deleteByCriteria
     * @param example
     * @return 
     */
    int deleteByCriteria(BanjiCriteria example);

    /**
     * deleteByPrimaryKey
     * @param banjiId
     * @return 
     */
    int deleteByPrimaryKey(Integer banjiId);

    /**
     * insert
     * @param record
     * @return 
     */
    int insert(Banji record);

    /**
     * insertSelective
     * @param record
     * @return 
     */
    int insertSelective(Banji record);

    /**
     * selectByCriteria
     * @param example
     * @return 
     */
    Page<Banji> selectByCriteria(BanjiCriteria example);

    /**
     * selectByPrimaryKey
     * @param banjiId
     * @return 
     */
    Banji selectByPrimaryKey(Integer banjiId);

    /**
     * updateByCriteriaSelective
     * @param record
     * @param example
     * @return 
     */
    int updateByCriteriaSelective(@Param("record") Banji record, @Param("example") BanjiCriteria example);

    /**
     * updateByCriteria
     * @param record
     * @param example
     * @return 
     */
    int updateByCriteria(@Param("record") Banji record, @Param("example") BanjiCriteria example);

    /**
     * updateByPrimaryKeySelective
     * @param record
     * @return 
     */
    int updateByPrimaryKeySelective(Banji record);

    /**
     * updateByPrimaryKey
     * @param record
     * @return 
     */
    int updateByPrimaryKey(Banji record);

    int insertBatch(List<Banji> list);

    List<Integer> findClass(Object userId);

}