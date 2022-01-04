package org.com.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.com.model.pojo.WxUser;
import org.com.model.pojo.WxUserExample;

public interface WxUserMapper {
    long countByExample(WxUserExample example);

    int deleteByExample(WxUserExample example);

    int insert(WxUser record);

    int insertSelective(WxUser record);

    List<WxUser> selectByExampleWithRowbounds(WxUserExample example, RowBounds rowBounds);

    List<WxUser> selectByExample(WxUserExample example);

    int updateByExampleSelective(@Param("record") WxUser record, @Param("example") WxUserExample example);

    int updateByExample(@Param("record") WxUser record, @Param("example") WxUserExample example);

    WxUser getUserByOpenid(String openid);
}