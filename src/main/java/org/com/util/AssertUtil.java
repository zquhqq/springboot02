package org.com.util;

import org.com.Exception.ParamsException;

public class AssertUtil {
    /**
     * 判断结果是否为 ture
     *     如果结果为 true，则抛出自定义异常
     * @param flag
     * @param msg
     */
    public static void isTure(Boolean flag,String msg){
        if(flag){
            throw new ParamsException(msg);
        }
    }
}
