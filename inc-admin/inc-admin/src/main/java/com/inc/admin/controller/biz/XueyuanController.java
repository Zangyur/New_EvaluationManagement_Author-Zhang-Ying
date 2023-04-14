package com.inc.admin.controller.biz;

import com.inc.admin.controller.sys.BaseController;
import com.inc.admin.domain.biz.Xueyuan;
import com.inc.admin.service.biz.XueyuanService;
import com.inc.admin.utils.R;
import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 学院Controller类
 * 
 * @author tanzibiao
 * @date 2021/12/16
 *
 * @mbg.generated 2021/12/16
 */
@RequestMapping("/xueyuan")
@RestController
@Slf4j
public class XueyuanController extends BaseController {
    @Resource
    private XueyuanService xueyuanService;

    /**
     * 分页查询
     * @param req
     * @return
     */
    @PostMapping("/list")
    public R listByPage(@RequestBody Xueyuan req) {
        return R.ok().put("list", xueyuanService.getList(req));
    }

    /**
     * 添加
     * @param req
     * @return 
     */
    @PostMapping("/insert")
    public R insert(@RequestBody Xueyuan req) {
        return R.operate(xueyuanService.insert(req)>0);
    }

    /**
     * 更新
     * @param req
     * @return 
     */
    @PostMapping("/update")
    public R update(@RequestBody Xueyuan req) {
        return R.operate(xueyuanService.update(req)>0);
    }

    /**
     * 删除
     * @param id
     * @return 
     */
    @PostMapping("/delete")
    public R delete(@Validated @NotNull(message = "编号不能为空") @RequestParam("id") @RequestBody Integer id) {
        return R.operate(xueyuanService.delete(id)>0);
    }
}