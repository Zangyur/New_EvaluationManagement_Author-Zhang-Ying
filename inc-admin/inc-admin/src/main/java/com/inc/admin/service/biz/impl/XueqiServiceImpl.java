package com.inc.admin.service.biz.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.inc.admin.dao.biz.XueqiDao;
import com.inc.admin.domain.biz.Kecheng;
import com.inc.admin.domain.biz.KechengCriteria;
import com.inc.admin.domain.biz.Xueqi;
import com.inc.admin.domain.biz.XueqiCriteria;
import com.inc.admin.service.biz.XueqiService;
import java.util.List;
import javax.annotation.Resource;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * 学期Service实现类
 * 
 * @author tanzibiao
 * @date 2021/12/16
 *
 * @mbg.generated 2021/12/16
 */
@Service("xueqiService")
public class XueqiServiceImpl implements XueqiService {
    @Resource
    private XueqiDao xueqiDao;

    /**
     * 分页查询
     * @param req
     * @return 
     */
    @Override
    public PageInfo<Xueqi> listByPage(Xueqi req) {
        PageHelper.startPage(req.getPageNo(), req.getPageSize());
        return new PageInfo<>(xueqiDao.selectByCriteria(buildCriteria(req)));
    }

    /**
     * 构建查询条件
     * @param req
     * @return
     */
    private XueqiCriteria buildCriteria(Xueqi req) {
        XueqiCriteria kechengCriteria= new XueqiCriteria();
        XueqiCriteria.Criteria criteria = kechengCriteria.createCriteria();
        if (req != null) {
            if (StringUtils.isNotBlank(req.getXueqi())) {criteria.andXueqiEqualTo(req.getXueqi());}
        }
        return kechengCriteria;
    }

    /**
     * 查询list
     * @param req
     * @return 
     */
    @Override
    public List<Xueqi> getList(Xueqi req) {
        return xueqiDao.selectByCriteria(buildCriteria(req));
    }

    /**
     * 单个查询
     * @param req
     * @return 
     */
    @Override
    public Xueqi getOne(Xueqi req) {
        List<Xueqi> list = getList(req);
        if(CollectionUtils.isNotEmpty(list)) {return list.get(0);}
        return null;
    }

    /**
     * 新增
     * @param record
     * @return 
     */
    @Override
    public int insert(Xueqi record) {
        return xueqiDao.insertSelective(record);
    }

    /**
     * 根据主键删除该记录
     * @param xueqi
     * @return 
     */
    @Override
    public int delete(String xueqi) {
        return xueqiDao.deleteByPrimaryKey(xueqi);
    }
}