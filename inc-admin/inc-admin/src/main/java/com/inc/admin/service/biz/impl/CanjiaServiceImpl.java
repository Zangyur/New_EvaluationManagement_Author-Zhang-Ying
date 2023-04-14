package com.inc.admin.service.biz.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.inc.admin.context.FilterContextHandler;
import com.inc.admin.dao.biz.CanjiaDao;
import com.inc.admin.domain.biz.Banji;
import com.inc.admin.domain.biz.Canjia;
import com.inc.admin.domain.biz.CanjiaCriteria;
import com.inc.admin.service.biz.CanjiaService;
import java.util.List;
import javax.annotation.Resource;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * 活动参与Service实现类
 * 
 * @author tanzibiao
 * @date 2022/01/21
 *
 * @mbg.generated 2022/01/21
 */
@Service("canjiaService")
public class CanjiaServiceImpl implements CanjiaService {
    @Resource
    private CanjiaDao canjiaDao;

    /**
     * 分页查询
     * @param req
     * @return 
     */
    @Override
    public PageInfo<Canjia> listByPage(Canjia req) {
        PageHelper.startPage(req.getPageNo(), req.getPageSize());
        return new PageInfo<>(canjiaDao.selectByCriteria(buildCriteria(req)));
    }
    @Override
    public PageInfo<Canjia> selfPage(Canjia req) {
        req.setStudentId(FilterContextHandler.getUserID4Int());
        PageHelper.startPage(req.getPageNo(), req.getPageSize());
        return new PageInfo<>(canjiaDao.selectByCriteria(buildCriteria(req)));
    }

    /**
     * 查询list
     * @param req
     * @return 
     */
    @Override
    public List<Canjia> getList(Canjia req) {
        return canjiaDao.selectByCriteria(buildCriteria(req));
    }

    /**
     * 单个查询
     * @param req
     * @return 
     */
    @Override
    public Canjia getOne(Canjia req) {
        List<Canjia> list = getList(req);
        if(CollectionUtils.isNotEmpty(list)) {return list.get(0);}
        return null;
    }

    /**
     * 新增
     * @param record
     * @return 
     */
    @Override
    public int insert(Canjia record) {
        return canjiaDao.insertSelective(record);
    }

    /**
     * 根据主键更新不为空的值
     * @param record
     * @return 
     */
    @Override
    public int update(Canjia record) {
        return canjiaDao.updateByPrimaryKeySelective(record);
    }

    /**
     * 根据主键删除该记录
     * @param id
     * @return 
     */
    @Override
    public int delete(Integer id) {
        return canjiaDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insertBatch(List<Canjia> list) {
        return canjiaDao.insertBatch(list);
    }

    /**
     * 构建查询条件
     * @param req
     * @return 
     */
    private CanjiaCriteria buildCriteria(Canjia req) {
        CanjiaCriteria canjiaCriteria= new CanjiaCriteria();
        CanjiaCriteria.Criteria criteria = canjiaCriteria.createCriteria();
        if (req != null) {
            if (req.getId() != null) {criteria.andIdEqualTo(req.getId());}
            if (req.getStudentId() != null) {criteria.andStudentIdEqualTo(req.getStudentId());}
            if (req.getHuodongId() != null) {criteria.andHuodongIdEqualTo(req.getHuodongId());}
            if (StringUtils.isNotBlank(req.getHuodongLeibie())) {criteria.andhuodongLeibieEqualTo(req.getHuodongLeibie());}
            if (req.getCanjiaStatus() != null) {criteria.andCanjiaStatusEqualTo(req.getCanjiaStatus());}
            if (req.getFen() != null) {criteria.andFenEqualTo(req.getFen());}
            
        }
        canjiaCriteria.setOrderByClause("canjia_status ASC");
        return canjiaCriteria;
    }
}