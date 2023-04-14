package com.inc.admin.service.biz.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.inc.admin.dao.biz.XueyuanDao;
import com.inc.admin.domain.biz.Xueyuan;
import com.inc.admin.domain.biz.XueyuanCriteria;
import com.inc.admin.service.biz.XueyuanService;
import java.util.List;
import javax.annotation.Resource;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * 学院Service实现类
 * 
 * @author tanzibiao
 * @date 2021/12/16
 *
 * @mbg.generated 2021/12/16
 */
@Service("xueyuanService")
public class XueyuanServiceImpl implements XueyuanService {
    @Resource
    private XueyuanDao xueyuanDao;

    /**
     * 分页查询
     * @param req
     * @return 
     */
    @Override
    public PageInfo<Xueyuan> listByPage(Xueyuan req) {
        PageHelper.startPage(req.getPageNo(), req.getPageSize());
        return new PageInfo<>(xueyuanDao.selectByCriteria(buildCriteria(req)));
    }

    /**
     * 查询list
     * @param req
     * @return 
     */
    @Override
    public List<Xueyuan> getList(Xueyuan req) {
        return xueyuanDao.selectByCriteria(buildCriteria(req));
    }

    /**
     * 单个查询
     * @param req
     * @return 
     */
    @Override
    public Xueyuan getOne(Xueyuan req) {
        List<Xueyuan> list = getList(req);
        if(CollectionUtils.isNotEmpty(list)) {return list.get(0);}
        return null;
    }

    /**
     * 新增
     * @param record
     * @return 
     */
    @Override
    public int insert(Xueyuan record) {
        return xueyuanDao.insertSelective(record);
    }

    /**
     * 根据主键更新不为空的值
     * @param record
     * @return 
     */
    @Override
    public int update(Xueyuan record) {
        return xueyuanDao.updateByPrimaryKeySelective(record);
    }

    /**
     * 根据主键删除该记录
     * @param xueyuanId
     * @return 
     */
    @Override
    public int delete(Integer xueyuanId) {
        return xueyuanDao.deleteByPrimaryKey(xueyuanId);
    }

    /**
     * 构建查询条件
     * @param req
     * @return 
     */
    private XueyuanCriteria buildCriteria(Xueyuan req) {
        XueyuanCriteria xueyuanCriteria= new XueyuanCriteria();
        XueyuanCriteria.Criteria criteria = xueyuanCriteria.createCriteria();
        if (req != null) {
            if (req.getXueyuanId() != null) {criteria.andXueyuanIdEqualTo(req.getXueyuanId());}
            if (StringUtils.isNotBlank(req.getXueyuanName())) {criteria.andXueyuanNameEqualTo(req.getXueyuanName());}
            if (StringUtils.isNotBlank(req.getXueyuanLingdao())) {criteria.andXueyuanLingdaoEqualTo(req.getXueyuanLingdao());}
            if (req.getXueyuanLingdaoId() != null) {criteria.andXueyuanLingdaoIdEqualTo(req.getXueyuanLingdaoId());}
            
        }
        return xueyuanCriteria;
    }
}