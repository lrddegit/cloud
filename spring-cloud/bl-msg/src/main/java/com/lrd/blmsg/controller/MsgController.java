package com.lrd.blmsg.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lrd$
 * @version : MsgController$.java, v 0.1 2019/11/1$ 17:22$ lrd$ Exp $
 */
@RestController
@RequestMapping("/msg")
public class MsgController {

    @RequestMapping("/getMsg")
    public void getMsg() {
        System.out.println("得到你的回应了！");
    }

    @RequestMapping("/getMsgAll")
    public String getMsgAll(@RequestParam(name = "msg") String msg) {
        System.out.println(msg + "得到你的回应了！");

        return msg + "得到了BL的回应了!";
    }
}
