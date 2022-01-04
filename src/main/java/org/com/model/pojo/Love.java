package org.com.model.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Love {

    @ApiModelProperty(value = "头像",hidden = true)
    private String image;
    @ApiModelProperty(value = "昵称",hidden = true)
    private String nickname;

}
