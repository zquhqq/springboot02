package org.com.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.com.model.pojo.WxForum;
import org.com.model.pojo.WxForumExample;

public interface WxForumMapper {

    long countByExample(WxForumExample example);

    int deleteByExample(WxForumExample example);

    int insert(WxForum record);

    int insertSelective(WxForum record);

    List<WxForum> selectByExampleWithRowbounds(WxForumExample example, RowBounds rowBounds);

    List<WxForum> selectByExample(WxForumExample example);

    int updateByExampleSelective(@Param("record") WxForum record, @Param("example") WxForumExample example);

    int updateByExample(@Param("record") WxForum record, @Param("example") WxForumExample example);
}