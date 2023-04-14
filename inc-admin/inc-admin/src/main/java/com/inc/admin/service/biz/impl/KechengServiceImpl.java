package com.inc.admin.service.biz.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.inc.admin.dao.biz.KechengDao;
import com.inc.admin.domain.biz.Banji;
import com.inc.admin.domain.biz.Kecheng;
import com.inc.admin.domain.biz.KechengCriteria;
import com.inc.admin.service.biz.KechengService;
import java.util.List;
import javax.annotation.Resource;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * 课程Service实现类
 * 
 * @author tanzibiao
 * @date 2021/12/14
 *
 * @mbg.generated 2021/12/14
 */
@Service("kechengService")
public class KechengServiceImpl implements KechengService {
    @Resource
    private KechengDao kechengDao;

    /**
     * 分页查询
     * @param req
     * @return 
     */
    @Override
    public PageInfo<Kecheng> listByPage(Kecheng req) {
        PageHelper.startPage(req.getPageNo(), req.getPageSize());
        return new PageInfo<>(kechengDao.selectByCriteria(buildCriteria(req)));
    }

    /**
     * 查询list
     * @param req
     * @return 
     */
    @Override
    public List<Kecheng> getList(Kecheng req) {
        return kechengDao.selectByCriteria(buildCriteria(req));
    }

    /**
     * 单个查询
     * @param req
     * @return 
     */
    @Override
    public Kecheng getOne(Kecheng req) {
        List<Kecheng> list = getList(req);
        if(CollectionUtils.isNotEmpty(list)) {return list.get(0);}
        return null;
    }

    /**
     * 新增
     * @param record
     * @return 
     */
    @Override
    public int insert(Kecheng record) {
        return kechengDao.insertSelective(record);
    }

    /**
     * 根据主键更新不为空的值
     * @param record
     * @return 
     */
    @Override
    public int update(Kecheng record) {
        return kechengDao.updateByPrimaryKeySelective(record);
    }

    /**
     * 根据主键删除该记录
     * @param kechengId
     * @return 
     */
    @Override
    public int delete(Integer kechengId) {
        return kechengDao.deleteByPrimaryKey(kechengId);
    }

    @Override
    public int insertBatch(List<Kecheng> list) {
        return kechengDao.insertBatch(list);
    }
    /**
     * 构建查询条件
     * @param req
     * @return 
     */
    private KechengCriteria buildCriteria(Kecheng req) {
        KechengCriteria kechengCriteria= new KechengCriteria();
        KechengCriteria.Criteria criteria = kechengCriteria.createCriteria();
        if (req != null) {
            if (req.getKechengId() != null) {criteria.andKechengIdEqualTo(req.getKechengId());}
            if (StringUtils.isNotBlank(req.getKechengName())) {criteria.andKechengNameLike(req.getKechengName());}
            if (req.getLaoshiId() != null) {criteria.andLaoshiIdEqualTo(req.getLaoshiId());}
            if (StringUtils.isNotBlank(req.getLaoshiName())) {criteria.andLaoshiNameEqualTo(req.getLaoshiName());}
            if (StringUtils.isNotBlank(req.getXueqi())) {criteria.andXueqiEqualTo(req.getXueqi());}
            if (StringUtils.isNotBlank(req.getXueyuan())) {criteria.andXueyuanEqualTo(req.getXueyuan());}
            
        }
        return kechengCriteria;
    }
}