package com.inc.admin.controller.biz;

import com.github.pagehelper.PageInfo;
import com.inc.admin.context.FilterContextHandler;
import com.inc.admin.controller.sys.BaseController;
import com.inc.admin.domain.biz.Bili;
import com.inc.admin.domain.biz.Chengji;
import com.inc.admin.domain.sys.Tree;
import com.inc.admin.domain.sys.UserDO;
import com.inc.admin.service.biz.BiliService;
import com.inc.admin.service.biz.ChengjiService;
import com.inc.admin.service.sys.UserService;
import com.inc.admin.utils.R;
import javax.annotation.Resource;
import javax.validation.constraints.NotNull;

import com.inc.admin.vo.X;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.list.TreeList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * 综测成绩Controller类
 * 
 * @author tanzibiao
 * @date 2022/01/24
 *
 * @mbg.generated 2022/01/24
 */
@RequestMapping("/chengji")
@RestController
@Slf4j
public class ChengjiController extends BaseController {
    @Resource
    private ChengjiService chengjiService;
    @Autowired
    private BiliService biliService;
    @Autowired
    private UserService userService;
    /**
     * 分页查询
     * @param req
     * @return 
     */
    @PostMapping("/listByPage")
    public R listByPage(@RequestBody Chengji req) {
        Bili bili = biliService.getList(new Bili()).get(0);
        Map<String, Object> map = new HashMap<>();
        map.put("userId",FilterContextHandler.getUserID4Int());
        Map res = userService.xuesheng(map);
        List<UserDO> list = (List<UserDO>) res.get("list");
        if(list!=null && list.size()>0){
            req.setXueshengId(FilterContextHandler.getUserID4Int());
        }
        Map jiaoshi = userService.jiaoshi(map);
        List<UserDO> list2 = (List<UserDO>) jiaoshi.get("list");
        if(list2!=null && list2.size()>0){
            req.setBanjiId(Integer.parseInt(list2.get(0).getDeptId()+""));
        }
        PageInfo<Chengji> page = chengjiService.listByPage(req);
        for (Chengji cj : page.getList()) {
            cj.setZongceChengji(cj.getDeyuChengji()*bili.getDeyu()
                    +cj.getWentiChengji()*bili.getWenti()
                    +cj.getXueyeChengji()*bili.getXueye());
        }
        return R.ok().put("page", page);
    }

    @PostMapping("/person/listByPage")
    public R listByPagePerson(@RequestBody Chengji req) {
        Bili bili = biliService.getList(new Bili()).get(0);
        req.setXueshengId(FilterContextHandler.getUserID4Int());
        PageInfo<Chengji> page = chengjiService.listByPage(req);
        for (Chengji cj : page.getList()) {
            cj.setZongceChengji(cj.getDeyuChengji()*bili.getDeyu()
                    +cj.getWentiChengji()*bili.getWenti()
                    +cj.getXueyeChengji()*bili.getXueye());
        }
        return R.ok().put("page", page);
    }

    @PostMapping("/yiyi")
    public R yiyilistByPage(@RequestBody Chengji req) {
        return R.ok().put("page", chengjiService.yiyi(req));
    }

    /**
     * 分数分布
     * @return
     */
    @GetMapping("/fsfb")
    public R fenshufenbu(Chengji req){
        Bili bili = biliService.getList(new Bili()).get(0);
        List<Chengji> list = chengjiService.getList(req);
        Float c60 = 0f,c70 = 0f,c80 = 0f,c90 = 0f,c100 = 0f;
        for (Chengji cj : list) {
            cj.setZongceChengji(cj.getDeyuChengji()*bili.getDeyu()
                    +cj.getWentiChengji()*bili.getWenti()
                    +cj.getXueyeChengji()*bili.getXueye());
            if(cj.getZongceChengji()<60){
                c60++;
            }else if(cj.getZongceChengji()<70){
                c70++;
            }else if(cj.getZongceChengji()<80){
                c80++;
            }else if(cj.getZongceChengji()<90){
                c90++;
            }else{
                c100++;
            }
        }
        Float total = list==null?0:Float.valueOf(list.size());
        List<X> res = new ArrayList<>();
        res.add(new X("0~60",(Float)(c60/total)));
        res.add(new X("60~70",(Float)(c70/total)));
        res.add(new X("70~80",(Float)(c80/total)));
        res.add(new X("80~90",(Float)(c90/total)));
        res.add(new X("90~100",(Float)(c100/total)));
        return R.ok(res);
    }

    @GetMapping("/person/fsfb")
    public R fenshufenbugeren(String xueqi){
        Chengji req = new Chengji();
        req.setXueshengId(FilterContextHandler.getUserID4Int());
        req.setXueqi(xueqi);
        Bili bili = biliService.getList(new Bili()).get(0);
        List<Chengji> list = chengjiService.getList(req);
        Float c60 = 0f,c70 = 0f,c80 = 0f,c90 = 0f,c100 = 0f;
        for (Chengji cj : list) {
            cj.setZongceChengji(cj.getDeyuChengji()*bili.getDeyu()
                    +cj.getWentiChengji()*bili.getWenti()
                    +cj.getXueyeChengji()*bili.getXueye());

        }
        Float total = list==null?0:Float.valueOf(list.size());
        List<X> res = new ArrayList<>();
        res.add(new X("0~60",(Float)(c60/total)));
        res.add(new X("60~70",(Float)(c70/total)));
        res.add(new X("70~80",(Float)(c80/total)));
        res.add(new X("80~90",(Float)(c90/total)));
        res.add(new X("90~100",(Float)(c100/total)));
        return R.ok(res);
    }

    /**
     * top5
     * @return
     */
    @GetMapping("/top5")
    public R top5OfBanji(Chengji req){
        Bili bili = biliService.getList(new Bili()).get(0);
        List<Chengji> list = chengjiService.getList(req);
        for (Chengji cj : list) {
            cj.setZongceChengji(cj.getDeyuChengji() * bili.getDeyu()
                    + cj.getWentiChengji() * bili.getWenti()
                    + cj.getXueyeChengji() * bili.getXueye());
        }
        list.sort(new Comparator<Chengji>() {
            @Override
            public int compare(Chengji o1, Chengji o2) {
                return (int) (o2.getZongceChengji() - o1.getZongceChengji());
            }
        });
        TreeList<String> cat = new TreeList<>();
        TreeList<Double> val = new TreeList<>();
        for (int i = 0; i < list.size()&&i<5; i++) {
            cat.add(list.get(i).getXueshengName());
            val.add(list.get(i).getZongceChengji());
        }
        Map<String,Object> map = new HashMap<>();
        map.put("cat",cat);
        map.put("val",val);
        return R.ok(map);
    }


    /**
     * 添加
     * @param req
     * @return 
     */
    @PostMapping("/insert")
    public R insert(@RequestBody Chengji req) {
        return R.operate(chengjiService.insert(req)>0);
    }

    /**
     * 更新
     * @param req
     * @return 
     */
    @PostMapping("/update")
    public R update(@RequestBody Chengji req) {
        return R.operate(chengjiService.update(req)>0);
    }

    /**
     * 删除
     * @param id
     * @return 
     */
    @PostMapping("/delete")
    public R delete(@Validated @NotNull(message = "编号不能为空") @RequestParam("id") @RequestBody Integer id) {
        return R.operate(chengjiService.delete(id)>0);
    }
}