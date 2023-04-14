package com.inc.admin.service.biz.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.inc.admin.dao.biz.BiliDao;
import com.inc.admin.domain.biz.Bili;
import com.inc.admin.domain.biz.BiliCriteria;
import com.inc.admin.service.biz.BiliService;
import java.util.List;
import javax.annotation.Resource;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;

/**
 * 成绩比例Service实现类
 * 
 * @author tanzibiao
 * @date 2022/01/24
 *
 * @mbg.generated 2022/01/24
 */
@Service("biliService")
public class BiliServiceImpl implements BiliService {
    @Resource
    private BiliDao biliDao;

    /**
     * 分页查询
     * @param req
     * @return 
     */
    @Override
    public PageInfo<Bili> listByPage(Bili req) {
        PageHelper.startPage(req.getPageNo(), req.getPageSize());
        return new PageInfo<>(biliDao.selectByCriteria(buildCriteria(req)));
    }

    /**
     * 查询list
     * @param req
     * @return 
     */
    @Override
    public List<Bili> getList(Bili req) {
        return biliDao.selectByCriteria(buildCriteria(req));
    }

    /**
     * 单个查询
     * @param req
     * @return 
     */
    @Override
    public Bili getOne(Bili req) {
        List<Bili> list = getList(req);
        if(CollectionUtils.isNotEmpty(list)) {return list.get(0);}
        return null;
    }

    /**
     * 新增
     * @param record
     * @return 
     */
    @Override
    public int insert(Bili record) {
        return biliDao.insertSelective(record);
    }

    /**
     * 根据主键更新不为空的值
     * @param record
     * @return 
     */
    @Override
    public int update(Bili record) {
        return biliDao.updateByPrimaryKeySelective(record);
    }

    /**
     * 根据主键删除该记录
     * @param id
     * @return 
     */
    @Override
    public int delete(Integer id) {
        return biliDao.deleteByPrimaryKey(id);
    }

    /**
     * 构建查询条件
     * @param req
     * @return 
     */
    private BiliCriteria buildCriteria(Bili req) {
        BiliCriteria biliCriteria= new BiliCriteria();
        BiliCriteria.Criteria criteria = biliCriteria.createCriteria();
        if (req != null) {
            if (req.getId() != null) {criteria.andIdEqualTo(req.getId());}
            if (req.getDeyu() != null) {criteria.andDeyuEqualTo(req.getDeyu());}
            if (req.getXueye() != null) {criteria.andXueyeEqualTo(req.getXueye());}
            if (req.getWenti() != null) {criteria.andWentiEqualTo(req.getWenti());}
            if (req.getQita() != null) {criteria.andQitaEqualTo(req.getQita());}
            
        }
        return biliCriteria;
    }
}