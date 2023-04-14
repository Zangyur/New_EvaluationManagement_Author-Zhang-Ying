package com.inc.admin.service.biz;

import com.github.pagehelper.PageInfo;
import com.inc.admin.domain.biz.Canjia;
import java.util.List;

/**
 * 活动参与Service类
 * 
 * @author tanzibiao
 * @date 2022/01/21
 *
 * @mbg.generated 2022/01/21
 */
public interface CanjiaService {
    /**
     * 分页查询
     * @param req
     * @return 
     */
    PageInfo<Canjia> listByPage(Canjia req);
    PageInfo<Canjia> selfPage(Canjia req);

    /**
     * 获取list
     * @param req
     * @return 
     */
    List<Canjia> getList(Canjia req);

    /**
     * 单个查询
     * @param req
     * @return 
     */
    Canjia getOne(Canjia req);

    /**
     * 新增
     * @param record
     * @return 
     */
    int insert(Canjia record);

    /**
     * 根据主键修改该记录
     * @param record
     * @return 
     */
    int update(Canjia record);

    /**
     * 根据主键删除该记录
     * @param id
     * @return 
     */
    int delete(Integer id);

    int insertBatch(List<Canjia> list);
}