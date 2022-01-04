package org.com.Exception;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.com.util.ResultInfo;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *  全局异常处理类
 */
//@ControllerAdvice  // spring提供的一个异常处理类
@ApiModel(value = "全局异常处理类", description = "全局异常处理类")
public class GlobalExceptionHandler {

    /**
     * 处理系统异常
     * @param e
     * @return: resultInfo
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody // 返回json数据
    public ResultInfo ExceptionResolve(Exception e){
        ResultInfo resultInfo = new ResultInfo();
        // 如果有异常，则设置系统异常信息
        resultInfo.setCode(300);
        resultInfo.setMsg("系统出错啦！");
        return resultInfo;
    }
    /**
     *  处理自定义异常
     * @param p
     * @return: resultInfo
     */
    @ExceptionHandler(value = ParamsException.class)
    @ResponseBody // 返回json数据
    public ResultInfo ExceptionResolve01(ParamsException p){
        ResultInfo resultInfo = new ResultInfo();
        // 如果有异常，则设置自定义异常信息
        resultInfo.setCode(p.getCode());
        resultInfo.setMsg(p.getMsg());
        return resultInfo;
    }
    /**
     *  绑定异常
     * @param p
     * @return: resultInfo
     */
    @ExceptionHandler(value = BindException.class)
    @ResponseBody
    public ResultInfo bindExceptionResolve01(BindException p){
        ResultInfo resultInfo = new ResultInfo();
        // 如果有异常，则设置自定义异常信息
        resultInfo.setCode(300);
        resultInfo.setMsg(p.getBindingResult().getFieldError().getDefaultMessage());
        return resultInfo;
    }
}
