package com.inc.admin.service.biz.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.inc.admin.dao.biz.HuodongDao;
import com.inc.admin.domain.biz.Huodong;
import com.inc.admin.domain.biz.HuodongCriteria;
import com.inc.admin.service.biz.HuodongService;
import java.util.List;
import javax.annotation.Resource;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * 活动Service实现类
 * 
 * @author inc
 * @date 2022/01/17
 *
 * @mbg.generated 2022/01/17
 */
@Service("huodongService")
public class HuodongServiceImpl implements HuodongService {
    @Resource
    private HuodongDao huodongDao;

    /**
     * 分页查询
     * @param req
     * @return 
     */
    @Override
    public PageInfo<Huodong> listByPage(Huodong req) {
        PageHelper.startPage(req.getPageNo(), req.getPageSize());
        return new PageInfo<>(huodongDao.selectByCriteria(buildCriteria(req)));
    }
    @Override
    public PageInfo<Huodong> canjialist(Huodong req) {
        PageHelper.startPage(req.getPageNo(), req.getPageSize());
        return new PageInfo<>(huodongDao.canjialist(buildCriteria(req)));
    }

    /**
     * 查询list
     * @param req
     * @return 
     */
    @Override
    public List<Huodong> getList(Huodong req) {
        return huodongDao.selectByCriteria(buildCriteria(req));
    }

    /**
     * 单个查询
     * @param req
     * @return 
     */
    @Override
    public Huodong getOne(Huodong req) {
        List<Huodong> list = getList(req);
        if(CollectionUtils.isNotEmpty(list)) {return list.get(0);}
        return null;
    }

    /**
     * 新增
     * @param record
     * @return 
     */
    @Override
    public int insert(Huodong record) {
        return huodongDao.insertSelective(record);
    }

    /**
     * 根据主键更新不为空的值
     * @param record
     * @return 
     */
    @Override
    public int update(Huodong record) {
        return huodongDao.updateByPrimaryKeySelective(record);
    }

    /**
     * 根据主键删除该记录
     * @param huodongId
     * @return 
     */
    @Override
    public int delete(Integer huodongId) {
        return huodongDao.deleteByPrimaryKey(huodongId);
    }

    /**
     * 构建查询条件
     * @param req
     * @return 
     */
    private HuodongCriteria buildCriteria(Huodong req) {
        HuodongCriteria huodongCriteria= new HuodongCriteria();
        HuodongCriteria.Criteria criteria = huodongCriteria.createCriteria();
        if (req != null) {
            if (req.getHuodongId() != null) {criteria.andHuodongIdEqualTo(req.getHuodongId());}
            if (req.getStudentId() != null) {criteria.andStudentIdEqualTo(req.getStudentId());}
            if (StringUtils.isNotBlank(req.getHuodongName())) {criteria.andHuodongNameLike(req.getHuodongName());}
            if (req.getHuodongLeibie() != null) {criteria.andHuodongLeibieEqualTo(req.getHuodongLeibie());}
            if (StringUtils.isNotBlank(req.getHuodongDesc())) {criteria.andHuodongDescEqualTo(req.getHuodongDesc());}
            if (StringUtils.isNotBlank(req.getHuodongPlace())) {criteria.andHuodongPlaceEqualTo(req.getHuodongPlace());}
            if (StringUtils.isNotBlank(req.getHuodongProducer())) {criteria.andHuodongProducerEqualTo(req.getHuodongProducer());}
            if (req.getHuodongFen() != null) {criteria.andHuodongFenEqualTo(req.getHuodongFen());}
            if (StringUtils.isNotBlank(req.getHuodongZhengming())) {criteria.andHuodongZhengmingEqualTo(req.getHuodongZhengming());}
            if (req.getHuodongTime() != null) {criteria.andHuodongTimeEqualTo(req.getHuodongTime());}
            
        }
        huodongCriteria.setOrderByClause("huodong_time desc");
        return huodongCriteria;
    }
}