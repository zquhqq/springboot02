package org.com.service.impl;

import org.apache.ibatis.session.RowBounds;
import org.com.mapper.WxForumMapper;
import org.com.mapper.WxUserMapper;
import org.com.model.pojo.Love;
import org.com.model.pojo.WxForum;
import org.com.model.pojo.WxForumExample;
import org.com.model.pojo.WxUser;
import org.com.model.response.SimpleResponse;
import org.com.service.WxForumService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class WxForumServiceImpl implements WxForumService {

    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private WxForumMapper wxForumMapper;

    @Resource
    private WxUserMapper wxUserMapper;

    /** 新增论坛 **/
    @Override
    public SimpleResponse<String> insert(WxForum forum) {
        Assert.notNull(forum,"请求参数不能为空");
        forum.setForumId((UUID.randomUUID()).toString());
        forum.setCreateTime(new Date());
        wxForumMapper.insertSelective(forum);
        return SimpleResponse.success("200","成功");
    }

    /** 获取论坛列表 **/
    @Override
    //@Cacheable(value = "forums")
    public SimpleResponse<List<WxForum>> getList() {
        System.out.println("走数据库");
        WxForumExample example =  new WxForumExample();
        example.setOrderByClause("create_time desc");
        WxForumExample.Criteria criteria = example.createCriteria();
        List<WxForum> list = wxForumMapper.selectByExample(example);
        if (list == null || list.isEmpty()){
            return SimpleResponse.failure("论坛列表空空如也");
        }
        for (WxForum wx : list){
            // 获取集合列表
            Set<String> set2  = redisTemplate.opsForSet().members(wx.getForumId());
            List<Love> list1 = new ArrayList<>();
            for (String s : set2){
                Love love = new Love();
                WxUser user = wxUserMapper.getUserByOpenid(s);
                love.setImage(user.getAvatorurl());
                love.setNickname(s);
                list1.add(love);
            }
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
            //wx.setCreateTime(sdf.format((wx.getCreateTime())));
            wx.setEnjoynum(list1.size());
            wx.setLove(list1);
        }
        return SimpleResponse.success("200","请求成功",list);
    }

    public static void main(String[] args) {
        System.out.println(new Date());
    }

}
