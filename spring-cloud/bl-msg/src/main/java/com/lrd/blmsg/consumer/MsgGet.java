package com.lrd.blmsg.consumer;

import com.rabbitmq.client.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author lrd$
 * @version : MsgGet$.java, v 0.1 2019/11/4$ 13:16$ lrd$ Exp $
 */
@Component
public class MsgGet {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RabbitListener(queues = "FanoutQueue")
    @RabbitHandler
    public void consumer(String content, Message message, Channel channel) {
        logger.info("接收处理队列B当中的消息： " + content);
        try {
            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
