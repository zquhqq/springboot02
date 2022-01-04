package org.com.service;


import org.com.model.pojo.WxForum;
import org.com.model.response.SimpleResponse;

import java.util.List;

public interface WxForumService {

    SimpleResponse<String> insert(WxForum forum);

    SimpleResponse<List<WxForum>> getList();
}
