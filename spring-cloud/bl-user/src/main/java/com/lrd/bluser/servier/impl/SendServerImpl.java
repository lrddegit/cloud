package com.lrd.bluser.servier.impl;

import com.lrd.bluser.servier.SendServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;

/**
 * @author lrd$
 * @version : SendServerImpl$.java, v 0.1 2019/11/11$ 13:51$ lrd$ Exp $
 */
@EnableBinding(Source.class)
public class SendServerImpl implements SendServer {

    @Autowired
    private Source source;

    @Override
    public void sendMsg(String msg) {
        source.output().send(MessageBuilder.withPayload(msg).build());
    }
}
