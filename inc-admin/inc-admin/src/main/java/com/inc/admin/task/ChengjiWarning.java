package com.inc.admin.task;

import com.inc.admin.dao.sys.TokenPrinciple;
import com.inc.admin.domain.biz.Banji;
import com.inc.admin.domain.biz.Bili;
import com.inc.admin.domain.biz.Chengji;
import com.inc.admin.domain.biz.Msg;
import com.inc.admin.domain.sys.UserDO;
import com.inc.admin.service.biz.BanjiService;
import com.inc.admin.service.biz.BiliService;
import com.inc.admin.service.biz.ChengjiService;
import com.inc.admin.service.biz.MsgService;
import com.inc.admin.service.sys.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ChengjiWarning {
    @Autowired
    SimpMessagingTemplate template;
    @Autowired
    ChengjiService chengjiService;
    @Autowired
    BiliService biliService;
    @Autowired
    MsgService msgService;
    @Autowired
    BanjiService banjiService;
    @Autowired
    UserService userService;

    //@Scheduled(cron = "0/4 * * * * ? "0 0 0/5 * * ?)
    public void TestSocket() {
        log.info("-----socket testing!!!");
        //template.convertAndSendToUser(new TokenPrinciple("admin").toString(), "/queue/notifications", "新消息：" + "给admin的消息");
        template.convertAndSend("/topic/trip/message/1", "您当前的综测成绩不及格，请及时参与活动进行加分哟！");
    }

    @Scheduled(cron = "0/10 * * * * ?")
    public void chengji(){

        Bili bili = biliService.getList(new Bili()).get(0);
        List<Chengji> list = chengjiService.getList(new Chengji());
        for (Chengji cj : list) {
            cj.setZongceChengji(cj.getDeyuChengji() * bili.getDeyu()
                    + cj.getWentiChengji() * bili.getWenti()
                    + cj.getXueyeChengji() * bili.getXueye());
            if(cj.getZongceChengji()<60){
                UserDO xuesheng = userService.get(Long.valueOf(cj.getXueshengId()));
                if(xuesheng!=null && xuesheng.getMsg()==1) {
                    //websocket 消息提醒
                    template.convertAndSend("/topic/trip/message/"+cj.getXueshengId(), "您当前的综测成绩不及格，请及时参与活动进行加分哟！");
                    msgService.insert(new Msg(cj.getXueshengId(), "您当前的综测成绩不及格，请及时参与活动进行加分哟！"));
                }
                Banji bjrq= new Banji();
                bjrq.setBanjiId(cj.getBanjiId());
                Banji one = banjiService.getOne(bjrq);
                if(one!=null){
                    UserDO userDO = userService.get(Long.valueOf(one.getBanzhurenId()));
                    if(userDO!=null && userDO.getMsg()==1) {
                        template.convertAndSend("/topic/trip/message/"+one.getBanzhurenId(), cj.getXueshengName()+"综合测试成绩不及格，请及时提醒该学生参与活动进行加分！");
                        msgService.insert(new Msg(one.getBanzhurenId(), cj.getXueshengName() + "综合测试成绩不及格，请及时提醒该学生参与活动进行加分！"));
                    }
                }
            }
        }

    }
}
