package org.com.controller;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.com.model.pojo.WxForum;
import org.com.model.response.SimpleResponse;
import org.com.service.WxForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.scanner.ScannerImpl;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
@Api("论坛中心")
public class WxforumController {

    @Resource
    private WxForumService wxForumService;

    @GetMapping("getList")
    public SimpleResponse<List<WxForum>> getLIST(){
        return wxForumService.getList();
    }

    @PostMapping("addForum")
    public SimpleResponse<String> addForum(WxForum forum){
        return wxForumService.insert(forum);
    }

}
