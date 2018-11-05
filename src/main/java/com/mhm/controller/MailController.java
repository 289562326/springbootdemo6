package com.mhm.controller;

import com.mhm.mail.MailService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 测试发送邮件
 * Created by MHM on 2018/11/5.
 */
@RestController
public class MailController {

    @Resource
    private MailService mailService;
    @RequestMapping(value = "/sendMail")
    public String sendMail(@RequestParam(value = "mailAddress", required = true) String mailAddress,@RequestParam(value = "title", required = true) String title,
    @RequestParam(value = "content", required = true) String content){
        mailService.sendSimpleMail(mailAddress,title,content);
        return "success";
    }
}
