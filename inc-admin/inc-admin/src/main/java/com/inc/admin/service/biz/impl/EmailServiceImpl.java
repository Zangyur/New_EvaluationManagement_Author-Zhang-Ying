package com.inc.admin.service.biz.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.inc.admin.dao.biz.EmailDao;
import com.inc.admin.domain.biz.Email;
import com.inc.admin.domain.biz.EmailCriteria;
import com.inc.admin.service.biz.EmailService;
import java.util.List;
import javax.annotation.Resource;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * 邮件Service实现类
 * 
 * @author tanzibiao
 * @date 2022/01/25
 *
 * @mbg.generated 2022/01/25
 */
@Service("emailService")
public class EmailServiceImpl implements EmailService {
    @Resource
    private EmailDao emailDao;

    /**
     * 分页查询
     * @param req
     * @return 
     */
    @Override
    public PageInfo<Email> listByPage(Email req) {
        PageHelper.startPage(req.getPageNo(), req.getPageSize());
        return new PageInfo<>(emailDao.selectByCriteria(buildCriteria(req)));
    }

    /**
     * 查询list
     * @param req
     * @return 
     */
    @Override
    public List<Email> getList(Email req) {
        return emailDao.selectByCriteria(buildCriteria(req));
    }

    /**
     * 单个查询
     * @param req
     * @return 
     */
    @Override
    public Email getOne(Email req) {
        List<Email> list = getList(req);
        if(CollectionUtils.isNotEmpty(list)) {return list.get(0);}
        return null;
    }

    /**
     * 新增
     * @param record
     * @return 
     */
    @Override
    public int insert(Email record) {
        return emailDao.insertSelective(record);
    }

    /**
     * 根据主键更新不为空的值
     * @param record
     * @return 
     */
    @Override
    public int update(Email record) {
        return emailDao.updateByPrimaryKeySelective(record);
    }

    /**
     * 根据主键删除该记录
     * @param id
     * @return 
     */
    @Override
    public int delete(Integer id) {
        return emailDao.deleteByPrimaryKey(id);
    }

    /**
     * 构建查询条件
     * @param req
     * @return 
     */
    private EmailCriteria buildCriteria(Email req) {
        EmailCriteria emailCriteria= new EmailCriteria();
        EmailCriteria.Criteria criteria = emailCriteria.createCriteria();
        if (req != null) {
            if (req.getId() != null) {criteria.andIdEqualTo(req.getId());}
            if (StringUtils.isNotBlank(req.getUserName())) {criteria.andUserNameEqualTo(req.getUserName());}
            if (StringUtils.isNotBlank(req.getSid())) {criteria.andSidEqualTo(req.getSid());}
            if (req.getOutTime() != null) {criteria.andOutTimeEqualTo(req.getOutTime());}
            
        }
        return emailCriteria;
    }
}