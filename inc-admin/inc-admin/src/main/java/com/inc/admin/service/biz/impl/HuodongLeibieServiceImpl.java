package com.inc.admin.service.biz.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.inc.admin.dao.biz.HuodongLeibieDao;
import com.inc.admin.domain.biz.HuodongLeibie;
import com.inc.admin.domain.biz.HuodongLeibieCriteria;
import com.inc.admin.service.biz.HuodongLeibieService;
import java.util.List;
import javax.annotation.Resource;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * 活动类别Service实现类
 * 
 * @author tanzibiao
 * @date 2022/01/22
 *
 * @mbg.generated 2022/01/22
 */
@Service("huodongLeibieService")
public class HuodongLeibieServiceImpl implements HuodongLeibieService {
    @Resource
    private HuodongLeibieDao huodongLeibieDao;

    /**
     * 分页查询
     * @param req
     * @return 
     */
    @Override
    public PageInfo<HuodongLeibie> listByPage(HuodongLeibie req) {
        PageHelper.startPage(req.getPageNo(), req.getPageSize());
        return new PageInfo<>(huodongLeibieDao.selectByCriteria(buildCriteria(req)));
    }

    /**
     * 查询list
     * @param req
     * @return 
     */
    @Override
    public List<HuodongLeibie> getList(HuodongLeibie req) {
        return huodongLeibieDao.selectByCriteria(buildCriteria(req));
    }

    /**
     * 单个查询
     * @param req
     * @return 
     */
    @Override
    public HuodongLeibie getOne(HuodongLeibie req) {
        List<HuodongLeibie> list = getList(req);
        if(CollectionUtils.isNotEmpty(list)) {return list.get(0);}
        return null;
    }

    /**
     * 新增
     * @param record
     * @return 
     */
    @Override
    public int insert(HuodongLeibie record) {
        return huodongLeibieDao.insertSelective(record);
    }

    /**
     * 根据主键更新不为空的值
     * @param record
     * @return 
     */
    @Override
    public int update(HuodongLeibie record) {
        return huodongLeibieDao.updateByPrimaryKeySelective(record);
    }

    /**
     * 根据主键删除该记录
     * @param huodongleibieId
     * @return 
     */
    @Override
    public int delete(Integer huodongleibieId) {
        return huodongLeibieDao.deleteByPrimaryKey(huodongleibieId);
    }

    /**
     * 构建查询条件
     * @param req
     * @return 
     */
    private HuodongLeibieCriteria buildCriteria(HuodongLeibie req) {
        HuodongLeibieCriteria huodongLeibieCriteria= new HuodongLeibieCriteria();
        HuodongLeibieCriteria.Criteria criteria = huodongLeibieCriteria.createCriteria();
        if (req != null) {
            if (req.getHuodongleibieId() != null) {criteria.andHuodongleibieIdEqualTo(req.getHuodongleibieId());}
            if (StringUtils.isNotBlank(req.getHuodongleibieName())) {criteria.andHuodongleibieNameLike(req.getHuodongleibieName());}
            if (req.getHuodongleibieFen() != null) {criteria.andHuodongleibieFenEqualTo(req.getHuodongleibieFen());}
            
        }
        return huodongLeibieCriteria;
    }
}