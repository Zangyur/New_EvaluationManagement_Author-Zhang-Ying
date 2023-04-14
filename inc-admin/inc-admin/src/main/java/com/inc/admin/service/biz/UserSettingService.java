package com.inc.admin.service.biz;

import com.github.pagehelper.PageInfo;
import com.inc.admin.domain.biz.UserSetting;
import java.util.List;

/**
 * 用户设置Service类
 * 
 * @author tanzibiao
 * @date 2022/01/20
 *
 * @mbg.generated 2022/01/20
 */
public interface UserSettingService {
    /**
     * 分页查询
     * @param req
     * @return 
     */
    PageInfo<UserSetting> listByPage(UserSetting req);

    /**
     * 获取list
     * @param req
     * @return 
     */
    List<UserSetting> getList(UserSetting req);

    /**
     * 单个查询
     * @param req
     * @return 
     */
    UserSetting getOne(UserSetting req);

    /**
     * 新增
     * @param record
     * @return 
     */
    int insert(UserSetting record);

    /**
     * 根据主键修改该记录
     * @param record
     * @return 
     */
    int update(UserSetting record);

    /**
     * 根据主键删除该记录
     * @param userId
     * @return 
     */
    int delete(Integer userId);
}