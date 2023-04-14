package com.inc.admin.controller.biz;

import com.inc.admin.controller.sys.BaseController;
import com.inc.admin.domain.biz.Yiyi;
import com.inc.admin.service.biz.YiyiService;
import com.inc.admin.utils.R;
import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 消息Controller类
 * 
 * @author tanzibiao
 * @date 2022/01/24
 *
 * @mbg.generated 2022/01/24
 */
@RequestMapping("/yiyi")
@RestController
@Slf4j
public class YiyiController extends BaseController {
    @Resource
    private YiyiService yiyiService;

    /**
     * 分页查询
     * @param req
     * @return 
     */
    @PostMapping("/listByPage")
    public R listByPage(@RequestBody Yiyi req) {
        return R.ok().put("page", yiyiService.listByPage(req));
    }

    /**
     * 添加
     * @param req
     * @return 
     */
    @PostMapping("/insert")
    public R insert(@RequestBody Yiyi req) {
        return R.operate(yiyiService.insert(req)>0);
    }

    /**
     * 更新
     * @param req
     * @return 
     */
    @PostMapping("/update")
    public R update(@RequestBody Yiyi req) {
        return R.operate(yiyiService.update(req)>0);
    }

    /**
     * 删除
     * @param id
     * @return 
     */
    @PostMapping("/delete")
    public R delete(@Validated @NotNull(message = "编号不能为空") @RequestParam("id") @RequestBody Integer id) {
        return R.operate(yiyiService.delete(id)>0);
    }
}