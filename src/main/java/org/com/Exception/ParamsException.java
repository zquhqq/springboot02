package org.com.Exception;

import lombok.Data;

/**
 * 自定义异常ParamsException继承RuntimeException
 *   1. 返回参数code: 300(默认)
 *   2. 返回参数msg: "参数异常"
 */
@Data
public class ParamsException extends RuntimeException{

    private Integer code = 300;
    private String msg = "参数异常";

    public ParamsException(){
        super("参数异常!");
    }

    public ParamsException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public ParamsException(Integer code) {
        super("参数异常");
        this.code = code;
    }

    public ParamsException(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
