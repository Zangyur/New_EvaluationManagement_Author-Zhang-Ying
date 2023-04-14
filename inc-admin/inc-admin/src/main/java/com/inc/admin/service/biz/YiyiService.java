package com.inc.admin.service.biz;

import com.github.pagehelper.PageInfo;
import com.inc.admin.domain.biz.Yiyi;
import java.util.List;

/**
 * 消息Service类
 * 
 * @author tanzibiao
 * @date 2022/01/24
 *
 * @mbg.generated 2022/01/24
 */
public interface YiyiService {
    /**
     * 分页查询
     * @param req
     * @return 
     */
    PageInfo<Yiyi> listByPage(Yiyi req);

    /**
     * 获取list
     * @param req
     * @return 
     */
    List<Yiyi> getList(Yiyi req);

    /**
     * 单个查询
     * @param req
     * @return 
     */
    Yiyi getOne(Yiyi req);

    /**
     * 新增
     * @param record
     * @return 
     */
    int insert(Yiyi record);

    /**
     * 根据主键修改该记录
     * @param record
     * @return 
     */
    int update(Yiyi record);

    /**
     * 根据主键删除该记录
     * @param id
     * @return 
     */
    int delete(Integer id);
}