package com.inc.admin.service.biz.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.inc.admin.dao.biz.GonggaoDao;
import com.inc.admin.domain.biz.Gonggao;
import com.inc.admin.domain.biz.GonggaoCriteria;
import com.inc.admin.service.biz.GonggaoService;

import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * 公告Service实现类
 * 
 * @author tanzibiao
 * @date 2021/12/16
 *
 * @mbg.generated 2021/12/16
 */
@Service("gonggaoService")
public class GonggaoServiceImpl implements GonggaoService {
    @Resource
    private GonggaoDao gonggaoDao;

    /**
     * 分页查询
     * @param req
     * @return 
     */
    @Override
    public PageInfo<Gonggao> listByPage(Gonggao req) {
        PageHelper.startPage(req.getPageNo(), req.getPageSize());
        return new PageInfo<>(gonggaoDao.selectByCriteria(buildCriteria(req)));
    }

    /**
     * 查询list
     * @param req
     * @return 
     */
    @Override
    public List<Gonggao> getList(Gonggao req) {
        return gonggaoDao.selectByCriteria(buildCriteria(req));
    }

    /**
     * 单个查询
     * @param req
     * @return 
     */
    @Override
    public Gonggao getOne(Gonggao req) {
        List<Gonggao> list = getList(req);
        if(CollectionUtils.isNotEmpty(list)) {return list.get(0);}
        return null;
    }

    /**
     * 新增
     * @param record
     * @return 
     */
    @Override
    public int insert(Gonggao record) {
        record.setTime(new Date());
        return gonggaoDao.insertSelective(record);
    }

    /**
     * 根据主键更新不为空的值
     * @param record
     * @return 
     */
    @Override
    public int update(Gonggao record) {
        return gonggaoDao.updateByPrimaryKeySelective(record);
    }

    /**
     * 根据主键删除该记录
     * @param id
     * @return 
     */
    @Override
    public int delete(Integer id) {
        return gonggaoDao.deleteByPrimaryKey(id);
    }

    /**
     * 构建查询条件
     * @param req
     * @return 
     */
    private GonggaoCriteria buildCriteria(Gonggao req) {
        GonggaoCriteria gonggaoCriteria= new GonggaoCriteria();
        GonggaoCriteria.Criteria criteria = gonggaoCriteria.createCriteria();
        if (req != null) {
            if (req.getMsg() != null) {criteria.andMsgLike(req.getMsg());}
        }
        return gonggaoCriteria;
    }
}