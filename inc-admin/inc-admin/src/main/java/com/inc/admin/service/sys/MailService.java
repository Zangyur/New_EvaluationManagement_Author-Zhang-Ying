package com.inc.admin.service.sys;

import com.inc.admin.domain.sys.UserDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MailService {
    @Autowired
    private JavaMailSenderImpl mailSender;

    protected final String baseMaillAddr = "1011026000@qq.com";

    public void sendSimpleEmail(String email, String result) {
        try {
            SimpleMailMessage message=new SimpleMailMessage();
            message.setFrom(baseMaillAddr);
            message.setTo(email);
            message.setSubject("综测系统邮箱找回密码");
            message.setText("重置密码链接："+result);
            mailSender.send(message);

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("发送简单文本文件-发生异常");
        }
    }
}