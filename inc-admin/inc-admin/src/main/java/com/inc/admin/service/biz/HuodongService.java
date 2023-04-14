package com.inc.admin.service.biz;

import com.github.pagehelper.PageInfo;
import com.inc.admin.domain.biz.Huodong;
import java.util.List;

/**
 * 活动Service类
 * 
 * @author inc
 * @date 2022/01/17
 *
 * @mbg.generated 2022/01/17
 */
public interface HuodongService {
    /**
     * 分页查询
     * @param req
     * @return 
     */
    PageInfo<Huodong> listByPage(Huodong req);
    PageInfo<Huodong> canjialist(Huodong req);

    /**
     * 获取list
     * @param req
     * @return 
     */
    List<Huodong> getList(Huodong req);

    /**
     * 单个查询
     * @param req
     * @return 
     */
    Huodong getOne(Huodong req);

    /**
     * 新增
     * @param record
     * @return 
     */
    int insert(Huodong record);

    /**
     * 根据主键修改该记录
     * @param record
     * @return 
     */
    int update(Huodong record);

    /**
     * 根据主键删除该记录
     * @param huodongId
     * @return 
     */
    int delete(Integer huodongId);
}