package com.lrd.bluser.servier;

import com.lrd.bluser.servier.impl.GetMsgServierImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lrd$
 * @version : GetMsgServier$.java, v 0.1 2019/11/1$ 17:29$ lrd$ Exp $
 */
@FeignClient(value = "bl-msg", fallback = GetMsgServierImpl.class)
public interface GetMsgServier {

    /**
     * spring cloud调用
     * @param msg
     * @return
     */
    @RequestMapping(value = "/msg/getMsgAll", method = RequestMethod.POST, consumes = "application/json")
    String getMsg(@RequestParam("msg") String msg);
}
