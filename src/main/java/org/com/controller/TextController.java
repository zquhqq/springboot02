package org.com.controller;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.com.mapper.WxUserMapper;
import org.com.model.pojo.Love;
import org.com.model.pojo.WxUser;
import org.com.model.response.SimpleResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RestController
@Slf4j
@RequestMapping("test")
public class TextController {

    @Autowired
    private RedisTemplate redisTemplate;
    @Resource
    private WxUserMapper wxUserMapper;

    @GetMapping("isNumber")
    @ApiOperation(value = "判断用户是否已经点赞",notes = "")
    //@ApiImplicitParam(name = "username",value = "用户名称",required = true,dataType = "String",paramType = "路径参数")
    public Integer queryUserByName(@RequestParam String openid,@RequestParam String forum_id){
        log.info("判断用户" + openid +"是否已经点赞,{}",forum_id);
        // 检查集合中是否包含value
        Boolean flag  = redisTemplate.opsForSet().isMember( forum_id, openid );
        System.out.println(flag);
        if (flag){
            return 200;
        }
        return 400;
    }

    @GetMapping("remove")
    @ApiOperation(value = "用户取消点赞",notes = "用户名称不能为空")
    //@ApiImplicitParam(name = "username",value = "用户名称",required = true,dataType = "String",paramType = "路径参数")
    public SimpleResponse<List<Love>> queryUserByName1(@RequestParam String openid, @RequestParam String forum_id ){
        log.info("用户" + openid +"取消点赞");
        // 从集合key中移除value变量值
        redisTemplate.opsForSet().remove(forum_id,openid);
        // 获取集合列表
        Set<String> set2  = redisTemplate.opsForSet().members(forum_id);
        List<Love> list = new ArrayList<>();
        for (String s : set2){
            Love love = new Love();
            WxUser user = wxUserMapper.getUserByOpenid(s);
            love.setImage(user.getAvatorurl());
            love.setNickname(s);
            list.add(love);
        }
        System.out.println(list);
        return SimpleResponse.success("200","请求成功",list);
    }

    @GetMapping("add")
    @ApiOperation(value = "用户点赞",notes = "用户名称不能为空")
    //@ApiImplicitParam(name = "username",value = "用户名称",required = true,dataType = "String",paramType = "路径参数")
    public SimpleResponse<List<Love>> queryUserByName2( @RequestParam String openid, @RequestParam String forum_id ){
        log.info("用户" + openid +"点赞");
        redisTemplate.opsForSet().add(forum_id,openid);
        // 获取集合列表
        Set<String> set2  = redisTemplate.opsForSet().members(forum_id);
        List<Love> list = new ArrayList<>();
        for (String s : set2){
            Love love = new Love();
            love.setNickname(s);
            WxUser user = wxUserMapper.getUserByOpenid(s);
            love.setImage(user.getAvatorurl());
            list.add(love);
        }
        System.out.println(set2);
        return SimpleResponse.success("200","请求成功",list);
    }
}
