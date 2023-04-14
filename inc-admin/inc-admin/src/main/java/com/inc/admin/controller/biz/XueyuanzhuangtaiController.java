package com.inc.admin.controller.biz;

import com.inc.admin.controller.sys.BaseController;
import com.inc.admin.domain.biz.Xueyuanzhuangtai;
import com.inc.admin.service.biz.XueyuanzhuangtaiService;
import com.inc.admin.utils.R;
import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 学生状态Controller类
 * 
 * @author tanzibiao
 * @date 2021/12/16
 *
 * @mbg.generated 2021/12/16
 */
@RequestMapping("/xueyuanzhuangtai")
@RestController
@Slf4j
public class XueyuanzhuangtaiController extends BaseController {
    @Resource
    private XueyuanzhuangtaiService xueyuanzhuangtaiService;

    /**
     * 分页查询
     * @param req
     * @return 
     */
    @PostMapping("/listByPage")
    public R listByPage(@RequestBody Xueyuanzhuangtai req) {
        return R.ok().put("page", xueyuanzhuangtaiService.listByPage(req));
    }

    /**
     * 添加
     * @param req
     * @return 
     */
    @PostMapping("/insert")
    public R insert(@RequestBody Xueyuanzhuangtai req) {
        return R.operate(xueyuanzhuangtaiService.insert(req)>0);
    }

    /**
     * 更新
     * @param req
     * @return 
     */
    @PostMapping("/update")
    public R update(@RequestBody Xueyuanzhuangtai req) {
        return R.operate(xueyuanzhuangtaiService.update(req)>0);
    }

    /**
     * 删除
     * @param id
     * @return 
     */
    @PostMapping("/delete")
    public R delete(@Validated @NotNull(message = "编号不能为空") @RequestParam("id") @RequestBody Integer id) {
        return R.operate(xueyuanzhuangtaiService.delete(id)>0);
    }
}