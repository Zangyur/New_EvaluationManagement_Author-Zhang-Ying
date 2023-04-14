package com.inc.admin.service.biz.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.inc.admin.dao.biz.UserSettingDao;
import com.inc.admin.domain.biz.UserSetting;
import com.inc.admin.domain.biz.UserSettingCriteria;
import com.inc.admin.service.biz.UserSettingService;
import java.util.List;
import javax.annotation.Resource;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * 用户设置Service实现类
 * 
 * @author tanzibiao
 * @date 2022/01/20
 *
 * @mbg.generated 2022/01/20
 */
@Service("userSettingService")
public class UserSettingServiceImpl implements UserSettingService {
    @Resource
    private UserSettingDao userSettingDao;

    /**
     * 分页查询
     * @param req
     * @return 
     */
    @Override
    public PageInfo<UserSetting> listByPage(UserSetting req) {
        PageHelper.startPage(req.getPageNo(), req.getPageSize());
        return new PageInfo<>(userSettingDao.selectByCriteria(buildCriteria(req)));
    }

    /**
     * 查询list
     * @param req
     * @return 
     */
    @Override
    public List<UserSetting> getList(UserSetting req) {
        return userSettingDao.selectByCriteria(buildCriteria(req));
    }

    /**
     * 单个查询
     * @param req
     * @return 
     */
    @Override
    public UserSetting getOne(UserSetting req) {
        List<UserSetting> list = getList(req);
        if(CollectionUtils.isNotEmpty(list)) {return list.get(0);}
        return null;
    }

    /**
     * 新增
     * @param record
     * @return 
     */
    @Override
    public int insert(UserSetting record) {
        return userSettingDao.insertSelective(record);
    }

    /**
     * 根据主键更新不为空的值
     * @param record
     * @return 
     */
    @Override
    public int update(UserSetting record) {
        return userSettingDao.updateByPrimaryKeySelective(record);
    }

    /**
     * 根据主键删除该记录
     * @param userId
     * @return 
     */
    @Override
    public int delete(Integer userId) {
        return userSettingDao.deleteByPrimaryKey(userId);
    }

    /**
     * 构建查询条件
     * @param req
     * @return 
     */
    private UserSettingCriteria buildCriteria(UserSetting req) {
        UserSettingCriteria userSettingCriteria= new UserSettingCriteria();
        UserSettingCriteria.Criteria criteria = userSettingCriteria.createCriteria();
        if (req != null) {
            if (req.getUserId() != null) {criteria.andUserIdEqualTo(req.getUserId());}
            if (StringUtils.isNotBlank(req.getLeibie())) {criteria.andLeibieEqualTo(req.getLeibie());}
            if (req.getIsMsg() != null) {criteria.andIsMsgEqualTo(req.getIsMsg());}
            
        }
        return userSettingCriteria;
    }
}