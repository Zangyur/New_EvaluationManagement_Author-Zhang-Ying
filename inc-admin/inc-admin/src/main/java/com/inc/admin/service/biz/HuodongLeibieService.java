package com.inc.admin.service.biz;

import com.github.pagehelper.PageInfo;
import com.inc.admin.domain.biz.HuodongLeibie;
import java.util.List;

/**
 * 活动类别Service类
 * 
 * @author tanzibiao
 * @date 2022/01/22
 *
 * @mbg.generated 2022/01/22
 */
public interface HuodongLeibieService {
    /**
     * 分页查询
     * @param req
     * @return 
     */
    PageInfo<HuodongLeibie> listByPage(HuodongLeibie req);

    /**
     * 获取list
     * @param req
     * @return 
     */
    List<HuodongLeibie> getList(HuodongLeibie req);

    /**
     * 单个查询
     * @param req
     * @return 
     */
    HuodongLeibie getOne(HuodongLeibie req);

    /**
     * 新增
     * @param record
     * @return 
     */
    int insert(HuodongLeibie record);

    /**
     * 根据主键修改该记录
     * @param record
     * @return 
     */
    int update(HuodongLeibie record);

    /**
     * 根据主键删除该记录
     * @param huodongleibieId
     * @return 
     */
    int delete(Integer huodongleibieId);
}