package com.inc.admin;

import com.inc.admin.service.sys.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class incAdminApplicationTests {

    /*public static void main(String[] args) {
        MobileCardCompanyDO cardPayOrderModel = new MobileCardCompanyDO();
        cardPayOrderModel.setCompanyCode("HS");
        cardPayOrderModel.setCompanyDesc("a1231241241awdasdf");
        cardPayOrderModel.setCompanyName("123124dzvsds");
        cardPayOrderModel.setId(2l);
        cardPayOrderModel.setStatus("1");
        CompanyModel companyModel = new CompanyModel();

        *//**
         * 10W次
         * BeanUtils.copyProperties：718
         * beanCopier.copy：56
         *//*

        *//**
         * 100W次
         * BeanUtils.copyProperties：5673
         * beanCopier.copy：70
         *//*

        //BeanUtils性能
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            BeanUtils.copyProperties(cardPayOrderModel, companyModel);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        //BeanCopier性能
        long start1 = System.currentTimeMillis();
        BeanCopier beanCopier = BeanCopier.create(MobileCardCompanyDO.class, CompanyModel.class,
                false);
        for (int i = 0; i < 1000000; i++) {
            beanCopier.copy(cardPayOrderModel, companyModel, null);
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);
    }*/

    @Autowired
    MailService mailService;

    @Test
    public void send(){
        mailService.sendSimpleEmail("jack231@163.com","http://www.baidu.com");
    }
}
