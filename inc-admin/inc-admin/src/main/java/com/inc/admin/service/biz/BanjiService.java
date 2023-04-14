package com.inc.admin.service.biz;

import com.github.pagehelper.PageInfo;
import com.inc.admin.domain.biz.Banji;
import java.util.List;

/**
 * 班级Service类
 * 
 * @author tanzibiao
 * @date 2021/12/13
 *
 * @mbg.generated 2021/12/13
 */
public interface BanjiService {
    /**
     * 分页查询
     * @param req
     * @return 
     */
    PageInfo<Banji> listByPage(Banji req);

    /**
     * 获取list
     * @param req
     * @return 
     */
    List<Banji> getList(Banji req);

    /**
     * 单个查询
     * @param req
     * @return 
     */
    Banji getOne(Banji req);

    /**
     * 新增
     * @param record
     * @return 
     */
    int insert(Banji record);

    /**
     * 根据主键修改该记录
     * @param record
     * @return 
     */
    int update(Banji record);

    /**
     * 根据主键删除该记录
     * @param banjiId
     * @return 
     */
    int delete(Integer banjiId);

    int insertBatch(List<Banji> list);
}