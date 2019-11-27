package com.lrd.bluser.controller;

import com.lrd.bluser.servier.GetMsgServier;
import com.lrd.bluser.servier.SendServer;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author lrd$
 * @version : UserController$.java, v 0.1 2019/11/1$ 15:50$ lrd$ Exp $
 */
@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * 发送几次mq
     */
    @Value("${mq.send.number}")
    private int number;

    @Resource
    private GetMsgServier getMsgServier;

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Autowired
    private SendServer sendServer;

    @Value("${word}")
    private String word;

    @RequestMapping("/getUserAll")
    public String getUserAll() {
        System.out.println("得到你了！");
        return getMsgServier.getMsg("hehe");
    }

    @RequestMapping("/sendUserMessage/{msg}")
    public String sendUserMessage(@PathVariable(name = "msg") String msg) {
        System.out.println("送给你信息!");
        for (int i = 1; i <= number; i++) {
            amqpTemplate.convertAndSend("FanoutExchange", "test", msg);
        }
        return "发送成功!";
    }

    @RequestMapping("/sendMsg/{msg}")
    public String sendMsg(@PathVariable(name = "msg") String msg) {
        sendServer.sendMsg(msg);
        return "secceed";
    }

    @RequestMapping("/getConfig")
    public void getConfigServer() {
        System.out.println(word);
    }
}
