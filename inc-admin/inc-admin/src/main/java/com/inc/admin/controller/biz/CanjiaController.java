package com.inc.admin.controller.biz;

import com.inc.admin.context.FilterContextHandler;
import com.inc.admin.controller.sys.BaseController;
import com.inc.admin.domain.biz.*;
import com.inc.admin.domain.sys.UserDO;
import com.inc.admin.service.biz.*;
import com.inc.admin.service.sys.UserService;
import com.inc.admin.utils.R;
import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * 活动参与Controller类
 * 
 * @author tanzibiao
 * @date 2022/01/21
 *
 * @mbg.generated 2022/01/21
 */
@RequestMapping("/canjia")
@RestController
@Slf4j
public class CanjiaController extends BaseController {
    @Resource
    private CanjiaService canjiaService;
    @Autowired
    private MsgService msgService;
    @Autowired
    private UserService userService;
    @Autowired
    private BanjiService banjiService;
    @Autowired
    private HuodongService huodongService;
    @Autowired
    private ChengjiService chengjiService;
    @Autowired
    private BiliService biliService;
    /**
     * 分页查询
     * @param req
     * @return 
     */
    @PostMapping("/listByPage")
    public R listByPage(@RequestBody Canjia req) {
        Map<String, Object> map = new HashMap<>();
        map.put("userId",FilterContextHandler.getUserID4Int());
        Map res = userService.xuesheng(map);
        List<UserDO> list = (List<UserDO>) res.get("list");
        if(list!=null && list.size()>0){
            req.setStudentId(FilterContextHandler.getUserID4Int());
        }
        return R.ok().put("page", canjiaService.listByPage(req));
    }

    /**
     * 添加
     * @param req
     * @return 
     */
    @PostMapping("/insert")
    public R insert(@RequestBody Canjia req) {
        req.setXiaonei(1);//校外1 校内0
        req.setCanjiaStatus(0);
        req.setStudentId(FilterContextHandler.getUserID4Int());
        return R.operate(canjiaService.insert(req)>0);
    }

    /**
     * 添加
     * @param req
     * @return
     */
    @PostMapping("/canjia")
    public R canjia(@RequestBody Canjia req) {
        req.setStudentId(FilterContextHandler.getUserID4Int());
        Canjia one = canjiaService.getOne(req);
        if(one!=null){
            return R.error("请勿重复参加");
        }
        return R.operate(canjiaService.insert(req)>0);
    }

    /**
     * 更新
     * @param req
     * @return 
     */
    @PostMapping("/update")
    public R update(@RequestBody Canjia req) {
        //如果是同意加入活动或者审核通过，则生成成绩
        return R.operate(canjiaService.update(req)>0);
    }

    @PostMapping("/updateStatus")
    public R updateStatus(@RequestBody Canjia req) {
        Canjia canjia  = new Canjia();
        canjia.setId(req.getId());
        canjia = canjiaService.getOne(canjia);
        if(canjia !=null && canjia.getCanjiaStatus() == req.getCanjiaStatus()){
            return R.error("不可重复操作");
        }
        //如果是同意加入活动或者审核通过，则生成成绩
        if(req.getCanjiaStatus()==1){
            Chengji cjRq = new Chengji();
            cjRq.setXueshengId(req.getStudentId());
            Chengji cj = chengjiService.getOne(cjRq);
            UserDO userDO = userService.get(Long.parseLong(req.getStudentId()+""));

            Huodong hdRq = new Huodong();
            Huodong huodong = null;
            if(req.getHuodongId()==null){
                huodong = new Huodong();
                huodong.setHuodongFen(Double.parseDouble(canjia.getFen()+""));
                huodong.setHuodongLeibieName(canjia.getHuodongLeibie());
            }else {
                hdRq.setHuodongId(req.getHuodongId());
                huodong = huodongService.getOne(hdRq);
            }

            Bili bili = biliService.getList(new Bili()).get(0);
            if(cj==null){
                UserDO student = userService.get(Long.valueOf(req.getStudentId()));
                Banji bjRq = new Banji();
                bjRq.setBanjiId(Math.toIntExact(student.getDeptId()));
                Banji banji = banjiService.getOne(bjRq);

                cj = new Chengji();
                cj.setXueyeChengji(userDO.getScore());
                cj.setBanjiId(banji.getBanjiId());
                cj.setBanjiName(banji.getBanjiName());
                cj.setXueqi(banji.getXueqi());
                cj.setXueshengId(Integer.parseInt(student.getUserId()+""));
                cj.setXueshengName(student.getName());
                Double fen = huodong.getHuodongFen() == null?0:huodong.getHuodongFen();
                cj.setDeyuChengji(0d);
                cj.setWentiChengji(0d);
//                cj.setXueyeChengji(0d);
                if(huodong.getHuodongLeibieName().contains("德育")){
                    cj.setDeyuChengji(fen);
                }else if(huodong.getHuodongLeibieName().contains("文体")){
                    cj.setWentiChengji(fen);
                }/*else if(huodong.getHuodongLeibieName().contains("学业")){
                    cj.setXueyeChengji(fen);
                }*/
                cj.setZongceChengji(cj.getDeyuChengji()*bili.getDeyu()
                        +cj.getWentiChengji()*bili.getWenti()
                        +cj.getXueyeChengji()*bili.getXueye());
                chengjiService.insert(cj);
            }else {
                cj.setXueyeChengji(userDO.getScore());
                if(huodong.getHuodongLeibieName().contains("德育")){
                    cj.setDeyuChengji(cj.getDeyuChengji()+huodong.getHuodongFen());
                }else if(huodong.getHuodongLeibieName().contains("文体")){
                    cj.setWentiChengji(cj.getWentiChengji()+huodong.getHuodongFen());
                }/*else if(huodong.getHuodongLeibieName().contains("学业")){
                    cj.setXueyeChengji(cj.getXueyeChengji()+huodong.getHuodongFen());
                }*/
                cj.setZongceChengji(cj.getDeyuChengji()*bili.getDeyu()
                        +cj.getWentiChengji()*bili.getWenti()
                        +cj.getXueyeChengji()*bili.getXueye());
                chengjiService.update(cj);
            }


        }
        return R.operate(canjiaService.update(req)>0);
    }

    /**
     * 删除
     * @param id
     * @return 
     */
    @PostMapping("/delete")
    public R delete(@Validated @NotNull(message = "编号不能为空") @RequestParam("id") @RequestBody Integer id) {
        return R.operate(canjiaService.delete(id)>0);
    }

    /**
     * 批量添加
     * @param list
     * @return
     */
    @PostMapping("/insertBatch")
    public R insertBatch(@RequestBody List<Canjia> list) {
        for (Canjia canjia : list) {
            canjia.setStudentId(FilterContextHandler.getUserID4Int());
        }
        int i = canjiaService.insertBatch(list);
        return R.operate(i>0);
    }
}