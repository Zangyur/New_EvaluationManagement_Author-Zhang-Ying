package com.inc.admin.controller.biz;

import com.inc.admin.controller.sys.BaseController;
import com.inc.admin.domain.biz.Bili;
import com.inc.admin.service.biz.BiliService;
import com.inc.admin.utils.R;
import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 成绩比例Controller类
 * 
 * @author tanzibiao
 * @date 2022/01/24
 *
 * @mbg.generated 2022/01/24
 */
@RequestMapping("/bili")
@RestController
@Slf4j
public class BiliController extends BaseController {
    @Resource
    private BiliService biliService;

    /**
     * 分页查询
     * @param req
     * @return 
     */
    @PostMapping("/listByPage")
    public R listByPage(@RequestBody Bili req) {
        return R.ok().put("page", biliService.listByPage(req));
    }

    /**
     * 添加
     * @param req
     * @return 
     */
    @PostMapping("/insert")
    public R insert(@RequestBody Bili req) {
        return R.operate(biliService.insert(req)>0);
    }

    /**
     * 更新
     * @param req
     * @return 
     */
    @PostMapping("/update")
    public R update(@RequestBody Bili req) {
        return R.operate(biliService.update(req)>0);
    }

    /**
     * 删除
     * @param id
     * @return 
     */
    @PostMapping("/delete")
    public R delete(@Validated @NotNull(message = "编号不能为空") @RequestParam("id") @RequestBody Integer id) {
        return R.operate(biliService.delete(id)>0);
    }
}