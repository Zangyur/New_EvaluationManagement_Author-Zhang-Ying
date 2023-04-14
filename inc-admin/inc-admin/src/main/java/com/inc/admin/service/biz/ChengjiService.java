package com.inc.admin.service.biz;

import com.github.pagehelper.PageInfo;
import com.inc.admin.domain.biz.Chengji;
import java.util.List;

/**
 * 综测成绩Service类
 * 
 * @author tanzibiao
 * @date 2022/01/24
 *
 * @mbg.generated 2022/01/24
 */
public interface ChengjiService {
    /**
     * 分页查询
     * @param req
     * @return 
     */
    PageInfo<Chengji> listByPage(Chengji req);

    /**
     * 获取list
     * @param req
     * @return 
     */
    List<Chengji> getList(Chengji req);

    /**
     * 单个查询
     * @param req
     * @return 
     */
    Chengji getOne(Chengji req);

    /**
     * 新增
     * @param record
     * @return 
     */
    int insert(Chengji record);

    /**
     * 根据主键修改该记录
     * @param record
     * @return 
     */
    int update(Chengji record);

    /**
     * 根据主键删除该记录
     * @param zongceId
     * @return 
     */
    int delete(Integer zongceId);

    Object yiyi(Chengji req);
}