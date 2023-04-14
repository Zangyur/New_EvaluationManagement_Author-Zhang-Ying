package com.inc.admin.controller.biz;

import com.inc.admin.controller.sys.BaseController;
import com.inc.admin.domain.biz.Banji;
import com.inc.admin.domain.biz.Kecheng;
import com.inc.admin.service.biz.KechengService;
import com.inc.admin.service.sys.UserService;
import com.inc.admin.utils.R;
import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 课程Controller类
 * 
 * @author tanzibiao
 * @date 2021/12/14
 *
 * @mbg.generated 2021/12/14
 */
@RequestMapping("/kecheng")
@RestController
@Slf4j
public class KechengController extends BaseController {
    @Resource
    private KechengService kechengService;
    @Resource
    private UserService userService;

    /**
     * 分页查询
     * @param req
     * @return 
     */
    @PostMapping("/listByPage")
    public R listByPage(@RequestBody Kecheng req) {
        return R.ok().put("page", kechengService.listByPage(req));
    }

    /**
     * 添加
     * @param req
     * @return 
     */
    @PostMapping("/insert")
    public R insert(@RequestBody Kecheng req) {
        if(req.getLaoshiId()!=null){
            req.setLaoshiName(userService.get(Long.valueOf(req.getLaoshiId())).getName());
        }
        return R.operate(kechengService.insert(req)>0);
    }

    /**
     * 更新
     * @param req
     * @return 
     */
    @PostMapping("/update")
    public R update(@RequestBody Kecheng req) {
        if(req.getLaoshiId()!=null){
            req.setLaoshiName(userService.get(Long.valueOf(req.getLaoshiId())).getName());
        }
        return R.operate(kechengService.update(req)>0);
    }

    /**
     * 删除
     * @param id
     * @return 
     */
    @PostMapping("/delete")
    public R delete(@Validated @NotNull(message = "编号不能为空") @RequestParam("kechengId") @RequestBody Integer id) {
        return R.operate(kechengService.delete(id)>0);
    }

    /**
     * 批量添加
     * @param list
     * @return
     */
    @PostMapping("/insertBatch")
    public R insertBatch(@RequestBody List<Kecheng> list) {
        int i = kechengService.insertBatch(list);
        return R.operate(i>0);
    }
}