package org.com.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.com.model.pojo.ForumImgUrl;
import org.com.model.pojo.ForumImgUrlExample;

public interface ForumImgUrlMapper {
    long countByExample(ForumImgUrlExample example);

    int deleteByExample(ForumImgUrlExample example);

    int insert(ForumImgUrl record);

    int insertSelective(ForumImgUrl record);

    List<ForumImgUrl> selectByExampleWithRowbounds(ForumImgUrlExample example, RowBounds rowBounds);

    List<ForumImgUrl> selectByExample(ForumImgUrlExample example);

    int updateByExampleSelective(@Param("record") ForumImgUrl record, @Param("example") ForumImgUrlExample example);

    int updateByExample(@Param("record") ForumImgUrl record, @Param("example") ForumImgUrlExample example);
}