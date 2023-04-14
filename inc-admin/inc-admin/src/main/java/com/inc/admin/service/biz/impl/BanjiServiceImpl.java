package com.inc.admin.service.biz.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.inc.admin.dao.biz.BanjiDao;
import com.inc.admin.domain.biz.Banji;
import com.inc.admin.domain.biz.BanjiCriteria;
import com.inc.admin.service.biz.BanjiService;
import java.util.List;
import javax.annotation.Resource;

import com.inc.admin.service.sys.UserService;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * 班级Service实现类
 * 
 * @author tanzibiao
 * @date 2021/12/13
 *
 * @mbg.generated 2021/12/13
 */
@Service("banjiService")
public class BanjiServiceImpl implements BanjiService {
    @Resource
    private BanjiDao banjiDao;
    @Resource
    private UserService userService;
    /**
     * 分页查询
     * @param req
     * @return 
     */
    @Override
    public PageInfo<Banji> listByPage(Banji req) {
        PageHelper.startPage(req.getPageNo(), req.getPageSize());
        return new PageInfo<>(banjiDao.selectByCriteria(buildCriteria(req)));
    }

    /**
     * 查询list
     * @param req
     * @return 
     */
    @Override
    public List<Banji> getList(Banji req) {
        return banjiDao.selectByCriteria(buildCriteria(req));
    }

    /**
     * 单个查询
     * @param req
     * @return 
     */
    @Override
    public Banji getOne(Banji req) {
        List<Banji> list = getList(req);
        Banji banji = null;
        if(CollectionUtils.isNotEmpty(list)) {
            for (Banji item : list) {
                if (item.getBanjiId().equals(req.getBanjiId())){
                    banji = item;
                }
            }
            return banji;
        }
        return null;
    }

    /**
     * 新增
     * @param record
     * @return 
     */
    @Override
    public int insert(Banji record) {
        if(record.getBanzhurenId()!=null){
            record.setBanzhurenName(userService.get(Long.valueOf(record.getBanzhurenId())).getName());
        }
        if(record.getFudaoyuanId()!=null){
            record.setFudaoyuanName(userService.get(Long.valueOf(record.getFudaoyuanId())).getName());
        }
        return banjiDao.insertSelective(record);
    }

    @Override
    public int insertBatch(List<Banji> list) {
        return banjiDao.insertBatch(list);
    }
    /**
     * 根据主键更新不为空的值
     * @param record
     * @return 
     */
    @Override
    public int update(Banji record) {
        if(record.getBanzhurenId()!=null){
            record.setBanzhurenName(userService.get(Long.valueOf(record.getBanzhurenId())).getName());
        }
        if(record.getFudaoyuanId()!=null){
            record.setFudaoyuanName(userService.get(Long.valueOf(record.getFudaoyuanId())).getName());
        }
        return banjiDao.updateByPrimaryKeySelective(record);
    }

    /**
     * 根据主键删除该记录
     * @param banjiId
     * @return 
     */
    @Override
    public int delete(Integer banjiId) {
        return banjiDao.deleteByPrimaryKey(banjiId);
    }

    /**
     * 构建查询条件
     * @param req
     * @return 
     */
    private BanjiCriteria buildCriteria(Banji req) {
        BanjiCriteria banjiCriteria= new BanjiCriteria();
        BanjiCriteria.Criteria criteria = banjiCriteria.createCriteria();
        if (req != null) {
            if (StringUtils.isNotBlank(req.getBanjiName())) {criteria.andBanjiNameLike(req.getBanjiName());}
        }
        return banjiCriteria;
    }
}