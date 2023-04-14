package com.inc.admin.controller.biz;

import com.inc.admin.controller.sys.BaseController;
import com.inc.admin.domain.biz.Banji;
import com.inc.admin.service.biz.BanjiService;
import com.inc.admin.utils.R;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 班级Controller类
 * 
 * @author tanzibiao
 * @date 2021/12/13
 *
 * @mbg.generated 2021/12/13
 */
@RequestMapping("/banji")
@RestController
@Slf4j
public class BanjiController extends BaseController {
    @Resource
    private BanjiService banjiService;

    /**
     * 分页查询
     * @param req
     * @return 
     */
    @PostMapping("/listByPage")
    public R ChengjiControllerlistByPage(@RequestBody Banji req) {
        return R.ok().put("page", banjiService.listByPage(req));
    }

    /**
     * 添加
     * @param req
     * @return 
     */
    @PostMapping("/insert")
    public R insert(@RequestBody Banji req) {
        return R.operate(banjiService.insert(req)>0);
    }

    /**
     * 批量添加
     * @param list
     * @return
     */
    @PostMapping("/insertBatch")
    public R insertBatch(@RequestBody List<Banji> list) {
        int i = banjiService.insertBatch(list);
        return R.operate(i>0);
    }

    /**
     * 更新
     * @param req
     * @return 
     */
    @PostMapping("/update")
    public R update(@RequestBody Banji req) {
        return R.operate(banjiService.update(req)>0);
    }

    /**
     * 删除
     * @param id
     * @return 
     */
    @PostMapping("/delete")
    public R delete(@RequestParam("id") @RequestBody Integer id) {
        return R.operate(banjiService.delete(id)>0);
    }
}