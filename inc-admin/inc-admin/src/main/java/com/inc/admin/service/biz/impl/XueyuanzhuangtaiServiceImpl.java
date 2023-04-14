package com.inc.admin.service.biz.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.inc.admin.dao.biz.XueyuanzhuangtaiDao;
import com.inc.admin.domain.biz.Xueyuanzhuangtai;
import com.inc.admin.domain.biz.XueyuanzhuangtaiCriteria;
import com.inc.admin.service.biz.XueyuanzhuangtaiService;
import java.util.List;
import javax.annotation.Resource;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * 学生状态Service实现类
 * 
 * @author tanzibiao
 * @date 2021/12/16
 *
 * @mbg.generated 2021/12/16
 */
@Service("xueyuanzhuangtaiService")
public class XueyuanzhuangtaiServiceImpl implements XueyuanzhuangtaiService {
    @Resource
    private XueyuanzhuangtaiDao xueyuanzhuangtaiDao;

    /**
     * 分页查询
     * @param req
     * @return 
     */
    @Override
    public PageInfo<Xueyuanzhuangtai> listByPage(Xueyuanzhuangtai req) {
        PageHelper.startPage(req.getPageNo(), req.getPageSize());
        return new PageInfo<>(xueyuanzhuangtaiDao.selectByCriteria(buildCriteria(req)));
    }

    /**
     * 查询list
     * @param req
     * @return 
     */
    @Override
    public List<Xueyuanzhuangtai> getList(Xueyuanzhuangtai req) {
        return xueyuanzhuangtaiDao.selectByCriteria(buildCriteria(req));
    }

    /**
     * 单个查询
     * @param req
     * @return 
     */
    @Override
    public Xueyuanzhuangtai getOne(Xueyuanzhuangtai req) {
        List<Xueyuanzhuangtai> list = getList(req);
        if(CollectionUtils.isNotEmpty(list)) {return list.get(0);}
        return null;
    }

    /**
     * 新增
     * @param record
     * @return 
     */
    @Override
    public int insert(Xueyuanzhuangtai record) {
        return xueyuanzhuangtaiDao.insertSelective(record);
    }

    /**
     * 根据主键更新不为空的值
     * @param record
     * @return 
     */
    @Override
    public int update(Xueyuanzhuangtai record) {
        return xueyuanzhuangtaiDao.updateByPrimaryKeySelective(record);
    }

    /**
     * 根据主键删除该记录
     * @param id
     * @return 
     */
    @Override
    public int delete(Integer id) {
        return xueyuanzhuangtaiDao.deleteByPrimaryKey(id);
    }

    /**
     * 构建查询条件
     * @param req
     * @return 
     */
    private XueyuanzhuangtaiCriteria buildCriteria(Xueyuanzhuangtai req) {
        XueyuanzhuangtaiCriteria xueyuanzhuangtaiCriteria= new XueyuanzhuangtaiCriteria();
        XueyuanzhuangtaiCriteria.Criteria criteria = xueyuanzhuangtaiCriteria.createCriteria();
        if (req != null) {
            if (req.getId() != null) {criteria.andIdEqualTo(req.getId());}
            if (StringUtils.isNotBlank(req.getName())) {criteria.andNameEqualTo(req.getName());}
            
        }
        return xueyuanzhuangtaiCriteria;
    }
}