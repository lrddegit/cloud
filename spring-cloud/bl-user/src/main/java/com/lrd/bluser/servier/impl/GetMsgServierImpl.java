package com.lrd.bluser.servier.impl;

import com.lrd.bluser.servier.GetMsgServier;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Component;

/**
 * @author lrd$
 * @version : GetMsgServierImpl$.java, v 0.1 2019/11/1$ 17:31$ lrd$ Exp $
 */
@Component
public class GetMsgServierImpl implements GetMsgServier {

    @Override
    //注解设置服务降级时间
    @HystrixCommand(commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "30000")
    })
    public String getMsg(String msg) {
        System.out.println("人家不响应超时，真失败！");
        return "人家不响应超时，真失败！";
    }
}
