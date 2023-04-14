package com.inc.admin.service.biz;

import com.github.pagehelper.PageInfo;
import com.inc.admin.domain.biz.Bili;
import java.util.List;

/**
 * 成绩比例Service类
 * 
 * @author tanzibiao
 * @date 2022/01/24
 *
 * @mbg.generated 2022/01/24
 */
public interface BiliService {
    /**
     * 分页查询
     * @param req
     * @return 
     */
    PageInfo<Bili> listByPage(Bili req);

    /**
     * 获取list
     * @param req
     * @return 
     */
    List<Bili> getList(Bili req);

    /**
     * 单个查询
     * @param req
     * @return 
     */
    Bili getOne(Bili req);

    /**
     * 新增
     * @param record
     * @return 
     */
    int insert(Bili record);

    /**
     * 根据主键修改该记录
     * @param record
     * @return 
     */
    int update(Bili record);

    /**
     * 根据主键删除该记录
     * @param id
     * @return 
     */
    int delete(Integer id);
}