package com.inc.admin.service.biz;

import com.github.pagehelper.PageInfo;
import com.inc.admin.domain.biz.Banji;
import com.inc.admin.domain.biz.Kecheng;
import java.util.List;

/**
 * 课程Service类
 * 
 * @author tanzibiao
 * @date 2021/12/14
 *
 * @mbg.generated 2021/12/14
 */
public interface KechengService {
    /**
     * 分页查询
     * @param req
     * @return 
     */
    PageInfo<Kecheng> listByPage(Kecheng req);

    /**
     * 获取list
     * @param req
     * @return 
     */
    List<Kecheng> getList(Kecheng req);

    /**
     * 单个查询
     * @param req
     * @return 
     */
    Kecheng getOne(Kecheng req);

    /**
     * 新增
     * @param record
     * @return 
     */
    int insert(Kecheng record);

    /**
     * 根据主键修改该记录
     * @param record
     * @return 
     */
    int update(Kecheng record);

    /**
     * 根据主键删除该记录
     * @param kechengId
     * @return 
     */
    int delete(Integer kechengId);

    int insertBatch(List<Kecheng> list);
}