package com.inc.admin.controller.biz;

import com.inc.admin.controller.sys.BaseController;
import com.inc.admin.domain.biz.HuodongLeibie;
import com.inc.admin.service.biz.HuodongLeibieService;
import com.inc.admin.utils.R;
import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 活动类别Controller类
 * 
 * @author tanzibiao
 * @date 2022/01/22
 *
 * @mbg.generated 2022/01/22
 */
@RequestMapping("/huodongLeibie")
@RestController
@Slf4j
public class HuodongLeibieController extends BaseController {
    @Resource
    private HuodongLeibieService huodongLeibieService;

    /**
     * 分页查询
     * @param req
     * @return 
     */
    @PostMapping("/listByPage")
    public R listByPage(@RequestBody HuodongLeibie req) {
        return R.ok().put("page", huodongLeibieService.listByPage(req));
    }

    /**
     * 添加
     * @param req
     * @return 
     */
    @PostMapping("/insert")
    public R insert(@RequestBody HuodongLeibie req) {
        return R.operate(huodongLeibieService.insert(req)>0);
    }

    /**
     * 更新
     * @param req
     * @return 
     */
    @PostMapping("/update")
    public R update(@RequestBody HuodongLeibie req) {
        return R.operate(huodongLeibieService.update(req)>0);
    }

    /**
     * 删除
     * @param huodongleibieId
     * @return 
     */
    @PostMapping("/delete")
    public R delete(@Validated @NotNull(message = "编号不能为空") @RequestParam("huodongleibieId") @RequestBody Integer huodongleibieId) {
        return R.operate(huodongLeibieService.delete(huodongleibieId)>0);
    }
}