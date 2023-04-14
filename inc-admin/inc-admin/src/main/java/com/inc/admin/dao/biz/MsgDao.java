package com.inc.admin.dao.biz;

import com.github.pagehelper.Page;
import com.inc.admin.domain.biz.Msg;
import com.inc.admin.domain.biz.MsgCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 消息Dao类
 * 
 * @author tanzibiao
 * @date 2022/01/20
 *
 * @mbg.generated 2022/01/20
 */
@Mapper
public interface MsgDao {
    /**
     * countByCriteria
     * @param example
     * @return 
     */
    long countByCriteria(MsgCriteria example);

    /**
     * deleteByCriteria
     * @param example
     * @return 
     */
    int deleteByCriteria(MsgCriteria example);

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
    int insert(Msg record);

    /**
     * insertSelective
     * @param record
     * @return 
     */
    int insertSelective(Msg record);

    /**
     * selectByCriteria
     * @param example
     * @return 
     */
    Page<Msg> selectByCriteria(MsgCriteria example);

    /**
     * selectByPrimaryKey
     * @param id
     * @return 
     */
    Msg selectByPrimaryKey(Integer id);

    /**
     * updateByCriteriaSelective
     * @param record
     * @param example
     * @return 
     */
    int updateByCriteriaSelective(@Param("record") Msg record, @Param("example") MsgCriteria example);

    /**
     * updateByCriteria
     * @param record
     * @param example
     * @return 
     */
    int updateByCriteria(@Param("record") Msg record, @Param("example") MsgCriteria example);

    /**
     * updateByPrimaryKeySelective
     * @param record
     * @return 
     */
    int updateByPrimaryKeySelective(Msg record);

    /**
     * updateByPrimaryKey
     * @param record
     * @return 
     */
    int updateByPrimaryKey(Msg record);
}