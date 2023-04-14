package com.inc.admin.controller.biz;

import com.github.pagehelper.PageInfo;
import com.inc.admin.context.FilterContextHandler;
import com.inc.admin.controller.sys.BaseController;
import com.inc.admin.domain.biz.Canjia;
import com.inc.admin.domain.biz.Huodong;
import com.inc.admin.domain.biz.HuodongLeibie;
import com.inc.admin.domain.biz.Msg;
import com.inc.admin.domain.sys.UserDO;
import com.inc.admin.service.biz.CanjiaService;
import com.inc.admin.service.biz.HuodongLeibieService;
import com.inc.admin.service.biz.HuodongService;
import com.inc.admin.service.biz.MsgService;
import com.inc.admin.service.sys.UserService;
import com.inc.admin.utils.R;
import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Filter;

/**
 * 活动Controller类
 * 
 * @author inc
 * @date 2022/01/17
 *
 * @mbg.generated 2022/01/17
 */
@RequestMapping("/huodong")
@RestController
@Slf4j
public class HuodongController extends BaseController {
    @Resource
    private HuodongService huodongService;
    @Resource
    private HuodongLeibieService leibieService;
    @Resource
    private UserService userService;
    @Resource
    private CanjiaService canjiaService;
    @Resource
    private MsgService msgService;

    private static final SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    /**
     * 分页查询
     * @param req
     * @return 
     */
    @PostMapping("/listByCurrentUser")
    public R listByCurrentUser(@RequestBody Huodong req) {
        req.setHuodongProducer(FilterContextHandler.getName());
        return R.ok().put("page", huodongService.listByPage(req));
    }

    @PostMapping("/canjiaByCurrentUser")
    public R canjiaByCurrentUser(@RequestBody Huodong req) {
        req.setStudentId(FilterContextHandler.getUserID4Int());
        return R.ok().put("page", huodongService.canjialist(req));
    }

    @PostMapping("/listByPage")
    public R listByPage(@RequestBody Huodong req) throws ParseException {
//        Map<String, Object> map = new HashMap<>();
//        map.put("userId",FilterContextHandler.getUserID4Int());
//        List<UserDO> list = userService.xuesheng(map);
//        if(list!=null){
//            req.setHuodongProducer(FilterContextHandler.getName());
//        }
        PageInfo<Huodong> huodongPageInfo = huodongService.listByPage(req);
        List<Huodong> list = huodongPageInfo.getList();
        String todayStr = df.format(new Date());
        long time = df.parse(todayStr).getTime();
        for (Huodong huodong : list) {
            long time1 = df.parse(huodong.getHuodongTime()).getTime();

            if(time1 >= time){
                huodong.setHuodongStatus("进行中");
            }else{
                huodong.setHuodongStatus("已过期");
            }
        }
        return R.ok().put("page", huodongPageInfo);
    }

    /**
     * 添加
     * @param req
     * @return 
     */
    @PostMapping("/insert")
    public R insert(@RequestBody Huodong req) {
        req.setHuodongProducer(FilterContextHandler.getName());
        HuodongLeibie leibie = new HuodongLeibie();
        leibie.setHuodongleibieId(req.getHuodongLeibie());
        leibie = leibieService.getOne(leibie);
        req.setHuodongLeibieName(leibie.getHuodongleibieName());
        if(req.getHuodongFen()==null){
            req.setHuodongFen(leibie.getHuodongleibieFen());
        }

        /**
         * 消息提醒
         */
        Canjia c = new Canjia();
        c.setHuodongLeibie(req.getHuodongLeibieName());
        List<Canjia> list = canjiaService.getList(c);
        Set<Integer> idSet = new HashSet<>();
        for (Canjia canjia : list) {
            if(!idSet.contains(canjia.getStudentId())){
                idSet.add(canjia.getStudentId());
                UserDO userDO = userService.get(Long.valueOf(canjia.getStudentId()));
                if(userDO!=null && userDO.getMsg()==1){
                    msgService.insert(new Msg(canjia.getStudentId(),"您感兴趣的活动已发布:《"+req.getHuodongName()+"》"));
                }
            }else {
                continue;
            }
        }

        return R.operate(huodongService.insert(req)>0);
    }

    /**
     * 更新
     * @param req
     * @return 
     */
    @PostMapping("/update")
    public R update(@RequestBody Huodong req) {
        if(req.getHuodongFen()==null){
            HuodongLeibie leibie = new HuodongLeibie();
            leibie.setHuodongleibieId(req.getHuodongLeibie());
            leibie = leibieService.getOne(leibie);
            req.setHuodongFen(leibie.getHuodongleibieFen());
            req.setHuodongLeibieName(leibie.getHuodongleibieName());
        }
        return R.operate(huodongService.update(req)>0);
    }

    /**
     * 删除
     * @param huodongId
     * @return 
     */
    @PostMapping("/delete")
    public R delete(@Validated @NotNull(message = "编号不能为空") @RequestParam("huodongId") @RequestBody Integer huodongId) {
        return R.operate(huodongService.delete(huodongId)>0);
    }
}