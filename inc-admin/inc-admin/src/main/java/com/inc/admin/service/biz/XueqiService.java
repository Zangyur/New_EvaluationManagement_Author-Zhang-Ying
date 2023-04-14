package com.inc.admin.service.biz;

import com.github.pagehelper.PageInfo;
import com.inc.admin.domain.biz.Xueqi;
import java.util.List;

/**
 * 学期Service类
 * 
 * @author tanzibiao
 * @date 2021/12/16
 *
 * @mbg.generated 2021/12/16
 */
public interface XueqiService {
    /**
     * 分页查询
     * @param req
     * @return 
     */
    PageInfo<Xueqi> listByPage(Xueqi req);

    /**
     * 获取list
     * @param req
     * @return 
     */
    List<Xueqi> getList(Xueqi req);

    /**
     * 单个查询
     * @param req
     * @return 
     */
    Xueqi getOne(Xueqi req);

    /**
     * 新增
     * @param record
     * @return 
     */
    int insert(Xueqi record);

    /**
     * 根据主键删除该记录
     * @param xueqi
     * @return 
     */
    int delete(String xueqi);
}