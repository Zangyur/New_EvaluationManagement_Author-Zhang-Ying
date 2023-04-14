package com.inc.admin.service.biz.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.inc.admin.dao.biz.ChengjiDao;
import com.inc.admin.domain.biz.Chengji;
import com.inc.admin.domain.biz.ChengjiCriteria;
import com.inc.admin.service.biz.ChengjiService;
import java.util.List;
import javax.annotation.Resource;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * 综测成绩Service实现类
 * 
 * @author tanzibiao
 * @date 2022/01/24
 *
 * @mbg.generated 2022/01/24
 */
@Service("chengjiService")
public class ChengjiServiceImpl implements ChengjiService {
    @Resource
    private ChengjiDao chengjiDao;

    /**
     * 分页查询
     * @param req
     * @return 
     */
    @Override
    public PageInfo<Chengji> listByPage(Chengji req) {
        PageHelper.startPage(req.getPageNo(), req.getPageSize());
        return new PageInfo<>(chengjiDao.selectByCriteria(buildCriteria(req)));
    }

    @Override
    public PageInfo<Chengji> yiyi(Chengji req) {
        PageHelper.startPage(req.getPageNo(), req.getPageSize());
        return new PageInfo<>(chengjiDao.selectByCriteria(buildCriteria2(req)));
    }

    /**
     * 查询list
     * @param req
     * @return 
     */
    @Override
    public List<Chengji> getList(Chengji req) {
        return chengjiDao.selectByCriteria(buildCriteria(req));
    }

    /**
     * 单个查询
     * @param req
     * @return 
     */
    @Override
    public Chengji getOne(Chengji req) {
        List<Chengji> list = getList(req);
        if(CollectionUtils.isNotEmpty(list)) {return list.get(0);}
        return null;
    }

    /**
     * 新增
     * @param record
     * @return 
     */
    @Override
    public int insert(Chengji record) {
        return chengjiDao.insertSelective(record);
    }

    /**
     * 根据主键更新不为空的值
     * @param record
     * @return 
     */
    @Override
    public int update(Chengji record) {
        return chengjiDao.updateByPrimaryKeySelective(record);
    }

    /**
     * 根据主键删除该记录
     * @param zongceId
     * @return 
     */
    @Override
    public int delete(Integer zongceId) {
        return chengjiDao.deleteByPrimaryKey(zongceId);
    }

    /**
     * 构建查询条件
     * @param req
     * @return 
     */
    private ChengjiCriteria buildCriteria(Chengji req) {
        ChengjiCriteria chengjiCriteria= new ChengjiCriteria();
        ChengjiCriteria.Criteria criteria = chengjiCriteria.createCriteria();
        if (req != null) {
            if (req.getZongceId() != null) {criteria.andZongceIdEqualTo(req.getZongceId());}
            if (StringUtils.isNotBlank(req.getXueqi())) {criteria.andXueqiEqualTo(req.getXueqi());}
            if (StringUtils.isNotBlank(req.getXueyuan())) {criteria.andXueyuanEqualTo(req.getXueyuan());}
            if (req.getBanjiId() != null) {criteria.andBanjiIdEqualTo(req.getBanjiId());}
            if (StringUtils.isNotBlank(req.getBanjiName())) {criteria.andBanjiNameEqualTo(req.getBanjiName());}
            if (req.getXueshengId() != null) {criteria.andXueshengIdEqualTo(req.getXueshengId());}
            if (StringUtils.isNotBlank(req.getXueshengName())) {criteria.andXueshengNameEqualTo(req.getXueshengName());}
            if (req.getDeyuChengji() != null) {criteria.andDeyuChengjiEqualTo(req.getDeyuChengji());}
            if (req.getXueyeChengji() != null) {criteria.andXueyeChengjiEqualTo(req.getXueyeChengji());}
            if (req.getWentiChengji() != null) {criteria.andWentiChengjiEqualTo(req.getWentiChengji());}
            if (req.getZongceChengji() != null) {criteria.andZongceChengjiEqualTo(req.getZongceChengji());}
            if (req.getYiyiStatus() != null) {criteria.andYiyiStatusEqualTo(req.getYiyiStatus());}
            if (StringUtils.isNotBlank(req.getYiyiDesc())) {criteria.andYiyiDescEqualTo(req.getYiyiDesc());}
            
        }
        return chengjiCriteria;
    }

    private ChengjiCriteria buildCriteria2(Chengji req) {
        ChengjiCriteria chengjiCriteria= new ChengjiCriteria();
        ChengjiCriteria.Criteria criteria = chengjiCriteria.createCriteria();
        criteria.andYiyiStatusGreaterThan(1);
        return chengjiCriteria;
    }
}