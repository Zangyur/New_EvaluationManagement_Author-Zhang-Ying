package com.inc.admin.service.biz;

import com.github.pagehelper.PageInfo;
import com.inc.admin.domain.biz.Gonggao;
import java.util.List;

/**
 * 公告Service类
 * 
 * @author tanzibiao
 * @date 2021/12/16
 *
 * @mbg.generated 2021/12/16
 */
public interface GonggaoService {
    /**
     * 分页查询
     * @param req
     * @return 
     */
    PageInfo<Gonggao> listByPage(Gonggao req);

    /**
     * 获取list
     * @param req
     * @return 
     */
    List<Gonggao> getList(Gonggao req);

    /**
     * 单个查询
     * @param req
     * @return 
     */
    Gonggao getOne(Gonggao req);

    /**
     * 新增
     * @param record
     * @return 
     */
    int insert(Gonggao record);

    /**
     * 根据主键修改该记录
     * @param record
     * @return 
     */
    int update(Gonggao record);

    /**
     * 根据主键删除该记录
     * @param id
     * @return 
     */
    int delete(Integer id);
}