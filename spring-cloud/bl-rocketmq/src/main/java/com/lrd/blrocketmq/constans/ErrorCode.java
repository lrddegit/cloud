package com.lrd.blrocketmq.constans;

import java.io.Serializable;

/**
 * @author lrd$
 * @version : ErrorCode$.java, v 0.1 2019/11/5$ 14:26$ lrd$ Exp $
 */
public interface ErrorCode extends Serializable {

    /**
     * 错误码
     *
     * @return
     */
     String getCode();

    /**
     * 错误信息
     *
     * @return
     */
    String getMsg();

}
