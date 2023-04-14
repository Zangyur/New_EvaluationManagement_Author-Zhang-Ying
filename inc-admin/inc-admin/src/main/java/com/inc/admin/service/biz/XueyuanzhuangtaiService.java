package com.inc.admin.service.biz;

import com.github.pagehelper.PageInfo;
import com.inc.admin.domain.biz.Xueyuanzhuangtai;
import java.util.List;

/**
 * 学生状态Service类
 * 
 * @author tanzibiao
 * @date 2021/12/16
 *
 * @mbg.generated 2021/12/16
 */
public interface XueyuanzhuangtaiService {
    /**
     * 分页查询
     * @param req
     * @return 
     */
    PageInfo<Xueyuanzhuangtai> listByPage(Xueyuanzhuangtai req);

    /**
     * 获取list
     * @param req
     * @return 
     */
    List<Xueyuanzhuangtai> getList(Xueyuanzhuangtai req);

    /**
     * 单个查询
     * @param req
     * @return 
     */
    Xueyuanzhuangtai getOne(Xueyuanzhuangtai req);

    /**
     * 新增
     * @param record
     * @return 
     */
    int insert(Xueyuanzhuangtai record);

    /**
     * 根据主键修改该记录
     * @param record
     * @return 
     */
    int update(Xueyuanzhuangtai record);

    /**
     * 根据主键删除该记录
     * @param id
     * @return 
     */
    int delete(Integer id);
}