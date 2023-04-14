package com.inc.admin.service.biz;

import com.github.pagehelper.PageInfo;
import com.inc.admin.domain.biz.Email;
import java.util.List;

/**
 * 邮件Service类
 * 
 * @author tanzibiao
 * @date 2022/01/25
 *
 * @mbg.generated 2022/01/25
 */
public interface EmailService {
    /**
     * 分页查询
     * @param req
     * @return 
     */
    PageInfo<Email> listByPage(Email req);

    /**
     * 获取list
     * @param req
     * @return 
     */
    List<Email> getList(Email req);

    /**
     * 单个查询
     * @param req
     * @return 
     */
    Email getOne(Email req);

    /**
     * 新增
     * @param record
     * @return 
     */
    int insert(Email record);

    /**
     * 根据主键修改该记录
     * @param record
     * @return 
     */
    int update(Email record);

    /**
     * 根据主键删除该记录
     * @param id
     * @return 
     */
    int delete(Integer id);
}