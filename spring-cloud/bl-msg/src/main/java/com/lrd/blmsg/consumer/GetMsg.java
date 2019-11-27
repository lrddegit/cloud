package com.lrd.blmsg.consumer;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @author lrd$
 * @version : GetMsg$.java, v 0.1 2019/11/11$ 14:03$ lrd$ Exp $
 */
@EnableBinding(Sink.class)
public class GetMsg {

    @StreamListener(Sink.INPUT)
    public void recieve(Object msg) {
        System.out.println("收到了" + msg);
    }
}
