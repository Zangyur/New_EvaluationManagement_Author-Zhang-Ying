package com.inc.admin.dao.biz;

import com.github.pagehelper.Page;
import com.inc.admin.domain.biz.UserSetting;
import com.inc.admin.domain.biz.UserSettingCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 用户设置Dao类
 * 
 * @author tanzibiao
 * @date 2022/01/20
 *
 * @mbg.generated 2022/01/20
 */
@Mapper
public interface UserSettingDao {
    /**
     * countByCriteria
     * @param example
     * @return 
     */
    long countByCriteria(UserSettingCriteria example);

    /**
     * deleteByCriteria
     * @param example
     * @return 
     */
    int deleteByCriteria(UserSettingCriteria example);

    /**
     * deleteByPrimaryKey
     * @param userId
     * @return 
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * insert
     * @param record
     * @return 
     */
    int insert(UserSetting record);

    /**
     * insertSelective
     * @param record
     * @return 
     */
    int insertSelective(UserSetting record);

    /**
     * selectByCriteria
     * @param example
     * @return 
     */
    Page<UserSetting> selectByCriteria(UserSettingCriteria example);

    /**
     * selectByPrimaryKey
     * @param userId
     * @return 
     */
    UserSetting selectByPrimaryKey(Integer userId);

    /**
     * updateByCriteriaSelective
     * @param record
     * @param example
     * @return 
     */
    int updateByCriteriaSelective(@Param("record") UserSetting record, @Param("example") UserSettingCriteria example);

    /**
     * updateByCriteria
     * @param record
     * @param example
     * @return 
     */
    int updateByCriteria(@Param("record") UserSetting record, @Param("example") UserSettingCriteria example);

    /**
     * updateByPrimaryKeySelective
     * @param record
     * @return 
     */
    int updateByPrimaryKeySelective(UserSetting record);

    /**
     * updateByPrimaryKey
     * @param record
     * @return 
     */
    int updateByPrimaryKey(UserSetting record);
}