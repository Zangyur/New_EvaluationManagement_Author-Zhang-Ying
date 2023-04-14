package com.inc.admin.service.biz;

import com.github.pagehelper.PageInfo;
import com.inc.admin.domain.biz.Xueyuan;
import java.util.List;

/**
 * 学院Service类
 * 
 * @author tanzibiao
 * @date 2021/12/16
 *
 * @mbg.generated 2021/12/16
 */
public interface XueyuanService {
    /**
     * 分页查询
     * @param req
     * @return 
     */
    PageInfo<Xueyuan> listByPage(Xueyuan req);

    /**
     * 获取list
     * @param req
     * @return 
     */
    List<Xueyuan> getList(Xueyuan req);

    /**
     * 单个查询
     * @param req
     * @return 
     */
    Xueyuan getOne(Xueyuan req);

    /**
     * 新增
     * @param record
     * @return 
     */
    int insert(Xueyuan record);

    /**
     * 根据主键修改该记录
     * @param record
     * @return 
     */
    int update(Xueyuan record);

    /**
     * 根据主键删除该记录
     * @param xueyuanId
     * @return 
     */
    int delete(Integer xueyuanId);
}