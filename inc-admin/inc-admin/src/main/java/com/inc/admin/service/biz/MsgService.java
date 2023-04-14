package com.inc.admin.service.biz;

import com.github.pagehelper.PageInfo;
import com.inc.admin.domain.biz.Msg;
import java.util.List;

/**
 * 消息Service类
 * 
 * @author tanzibiao
 * @date 2022/01/20
 *
 * @mbg.generated 2022/01/20
 */
public interface MsgService {
    /**
     * 分页查询
     * @param req
     * @return 
     */
    PageInfo<Msg> listByPage(Msg req);

    /**
     * 获取list
     * @param req
     * @return 
     */
    List<Msg> getList(Msg req);

    /**
     * 单个查询
     * @param req
     * @return 
     */
    Msg getOne(Msg req);

    /**
     * 新增
     * @param record
     * @return 
     */
    int insert(Msg record);

    /**
     * 根据主键修改该记录
     * @param record
     * @return 
     */
    int update(Msg record);

    /**
     * 根据主键删除该记录
     * @param id
     * @return 
     */
    int delete(Integer id);
}