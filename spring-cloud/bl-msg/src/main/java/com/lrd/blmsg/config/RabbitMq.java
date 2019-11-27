package com.lrd.blmsg.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lrd$
 * @version : RabbitMq$.java, v 0.1 2019/11/4$ 13:16$ lrd$ Exp $
 */
@Configuration
public class RabbitMq {

    /**
     * 队列 起名：FanoutQueue
     */
    @Bean(name = "FanoutQueue")
    public Queue TestFanoutQueue() {
        //true 是否持久
        return new Queue("FanoutQueue", true);
    }

    /**
     * Fanout交换机 起名：FanoutExchange
     */
    @Bean
    FanoutExchange TestFanoutExchange() {
        return new FanoutExchange("FanoutExchange");
    }

    @Bean
    Binding bindingFanout() {
        return BindingBuilder.bind(TestFanoutQueue()).to(TestFanoutExchange());
    }
}
