package com.inc.admin.service.biz.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.inc.admin.dao.biz.YiyiDao;
import com.inc.admin.domain.biz.Yiyi;
import com.inc.admin.domain.biz.YiyiCriteria;
import com.inc.admin.service.biz.YiyiService;
import java.util.List;
import javax.annotation.Resource;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * 消息Service实现类
 * 
 * @author tanzibiao
 * @date 2022/01/24
 *
 * @mbg.generated 2022/01/24
 */
@Service("yiyiService")
public class YiyiServiceImpl implements YiyiService {
    @Resource
    private YiyiDao yiyiDao;

    /**
     * 分页查询
     * @param req
     * @return 
     */
    @Override
    public PageInfo<Yiyi> listByPage(Yiyi req) {
        PageHelper.startPage(req.getPageNo(), req.getPageSize());
        return new PageInfo<>(yiyiDao.selectByCriteria(buildCriteria(req)));
    }

    /**
     * 查询list
     * @param req
     * @return 
     */
    @Override
    public List<Yiyi> getList(Yiyi req) {
        return yiyiDao.selectByCriteria(buildCriteria(req));
    }

    /**
     * 单个查询
     * @param req
     * @return 
     */
    @Override
    public Yiyi getOne(Yiyi req) {
        List<Yiyi> list = getList(req);
        if(CollectionUtils.isNotEmpty(list)) {return list.get(0);}
        return null;
    }

    /**
     * 新增
     * @param record
     * @return 
     */
    @Override
    public int insert(Yiyi record) {
        return yiyiDao.insertSelective(record);
    }

    /**
     * 根据主键更新不为空的值
     * @param record
     * @return 
     */
    @Override
    public int update(Yiyi record) {
        return yiyiDao.updateByPrimaryKeySelective(record);
    }

    /**
     * 根据主键删除该记录
     * @param id
     * @return 
     */
    @Override
    public int delete(Integer id) {
        return yiyiDao.deleteByPrimaryKey(id);
    }

    /**
     * 构建查询条件
     * @param req
     * @return 
     */
    private YiyiCriteria buildCriteria(Yiyi req) {
        YiyiCriteria yiyiCriteria= new YiyiCriteria();
        YiyiCriteria.Criteria criteria = yiyiCriteria.createCriteria();
        if (req != null) {
            if (req.getId() != null) {criteria.andIdEqualTo(req.getId());}
            if (StringUtils.isNotBlank(req.getContent())) {criteria.andContentEqualTo(req.getContent());}
            if (req.getUserId() != null) {criteria.andUserIdEqualTo(req.getUserId());}
            if (StringUtils.isNotBlank(req.getUserName())) {criteria.andUserNameEqualTo(req.getUserName());}
            if (req.getStatus() != null) {criteria.andStatusEqualTo(req.getStatus());}
            
        }
        return yiyiCriteria;
    }
}