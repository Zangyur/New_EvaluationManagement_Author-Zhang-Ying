package com.inc.admin.service.biz.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.inc.admin.dao.biz.MsgDao;
import com.inc.admin.domain.biz.Msg;
import com.inc.admin.domain.biz.MsgCriteria;
import com.inc.admin.service.biz.MsgService;
import java.util.List;
import javax.annotation.Resource;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * 消息Service实现类
 * 
 * @author tanzibiao
 * @date 2022/01/20
 *
 * @mbg.generated 2022/01/20
 */
@Service("msgService")
public class MsgServiceImpl implements MsgService {
    @Resource
    private MsgDao msgDao;

    /**
     * 分页查询
     * @param req
     * @return 
     */
    @Override
    public PageInfo<Msg> listByPage(Msg req) {
        PageHelper.startPage(req.getPageNo(), req.getPageSize());
        return new PageInfo<>(msgDao.selectByCriteria(buildCriteria(req)));
    }

    /**
     * 查询list
     * @param req
     * @return 
     */
    @Override
    public List<Msg> getList(Msg req) {
        return msgDao.selectByCriteria(buildCriteria(req));
    }

    /**
     * 单个查询
     * @param req
     * @return 
     */
    @Override
    public Msg getOne(Msg req) {
        List<Msg> list = getList(req);
        if(CollectionUtils.isNotEmpty(list)) {return list.get(0);}
        return null;
    }

    /**
     * 新增
     * @param record
     * @return 
     */
    @Override
    public int insert(Msg record) {
        return msgDao.insertSelective(record);
    }

    /**
     * 根据主键更新不为空的值
     * @param record
     * @return 
     */
    @Override
    public int update(Msg record) {
        return msgDao.updateByPrimaryKeySelective(record);
    }

    /**
     * 根据主键删除该记录
     * @param id
     * @return 
     */
    @Override
    public int delete(Integer id) {
        return msgDao.deleteByPrimaryKey(id);
    }

    /**
     * 构建查询条件
     * @param req
     * @return 
     */
    private MsgCriteria buildCriteria(Msg req) {
        MsgCriteria msgCriteria= new MsgCriteria();
        MsgCriteria.Criteria criteria = msgCriteria.createCriteria();
        if (req != null) {
            if (req.getId() != null) {criteria.andIdEqualTo(req.getId());}
            if (StringUtils.isNotBlank(req.getContent())) {criteria.andContentEqualTo(req.getContent());}
            if (req.getUserId() != null) {criteria.andUserIdEqualTo(req.getUserId());}
            if (StringUtils.isNotBlank(req.getUserName())) {criteria.andUserNameEqualTo(req.getUserName());}
            if (req.getStatus() != null) {criteria.andStatusEqualTo(req.getStatus());}
            
        }
        return msgCriteria;
    }
}