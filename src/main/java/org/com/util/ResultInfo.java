package org.com.util;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 封装类，消息返回类型
 */
@Data
@ApiModel(value = "基础封装类",description = "基础封装类")
public class ResultInfo {

    @ApiModelProperty(value = "状态码",example = "200")
    private Integer code = 200;

    @ApiModelProperty(value = "提示信息",example = "成功")
    private String msg = "操作成功";

    @ApiModelProperty(value = "数据对象")
    private Object result = null;

}
