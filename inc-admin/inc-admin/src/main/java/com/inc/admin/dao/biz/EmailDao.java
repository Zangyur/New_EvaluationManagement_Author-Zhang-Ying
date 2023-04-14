package com.inc.admin.dao.biz;

import com.github.pagehelper.Page;
import com.inc.admin.domain.biz.Email;
import com.inc.admin.domain.biz.EmailCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 邮件Dao类
 * 
 * @author tanzibiao
 * @date 2022/01/25
 *
 * @mbg.generated 2022/01/25
 */
@Mapper
public interface EmailDao {
    /**
     * countByCriteria
     * @param example
     * @return 
     */
    long countByCriteria(EmailCriteria example);

    /**
     * deleteByCriteria
     * @param example
     * @return 
     */
    int deleteByCriteria(EmailCriteria example);

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
    int insert(Email record);

    /**
     * insertSelective
     * @param record
     * @return 
     */
    int insertSelective(Email record);

    /**
     * selectByCriteria
     * @param example
     * @return 
     */
    Page<Email> selectByCriteria(EmailCriteria example);

    /**
     * selectByPrimaryKey
     * @param id
     * @return 
     */
    Email selectByPrimaryKey(Integer id);

    /**
     * updateByCriteriaSelective
     * @param record
     * @param example
     * @return 
     */
    int updateByCriteriaSelective(@Param("record") Email record, @Param("example") EmailCriteria example);

    /**
     * updateByCriteria
     * @param record
     * @param example
     * @return 
     */
    int updateByCriteria(@Param("record") Email record, @Param("example") EmailCriteria example);

    /**
     * updateByPrimaryKeySelective
     * @param record
     * @return 
     */
    int updateByPrimaryKeySelective(Email record);

    /**
     * updateByPrimaryKey
     * @param record
     * @return 
     */
    int updateByPrimaryKey(Email record);
}