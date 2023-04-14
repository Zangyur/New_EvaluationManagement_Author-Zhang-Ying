package com.inc.admin.controller.biz;

import com.inc.admin.controller.sys.BaseController;
import com.inc.admin.domain.biz.Xueqi;
import com.inc.admin.service.biz.XueqiService;
import com.inc.admin.utils.R;
import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 学期Controller类
 * 
 * @author tanzibiao
 * @date 2021/12/16
 *
 * @mbg.generated 2021/12/16
 */
@RequestMapping("/xueqi")
@RestController
@Slf4j
public class XueqiController extends BaseController {
    @Resource
    private XueqiService xueqiService;

    /**
     * 分页查询
     * @return
     */
    @PostMapping("/list")
    public R listByPage() {
        return R.ok().put("list", xueqiService.getList(new Xueqi()));
    }

    /**
     * 添加
     * @param req
     * @return 
     */
    @PostMapping("/insert")
    public R insert(@RequestBody Xueqi req) {
        return R.operate(xueqiService.insert(req)>0);
    }

    /**
     * 删除
     * @param id
     * @return 
     */
    @PostMapping("/delete")
    public R delete(@Validated @NotNull(message = "编号不能为空") @RequestParam("id") @RequestBody String id) {
        return R.operate(xueqiService.delete(id)>0);
    }
}