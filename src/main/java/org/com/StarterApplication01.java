package org.com;

import com.github.xiaoymin.knife4j.spring.annotations.EnableSwaggerBootstrapUi;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import java.util.*;

/**
 * Spring Boot 启动类
 *
 */
@SpringBootApplication
@EnableCaching               // 启动分布式缓存Ehcache
@MapperScan("org.com.mapper")   // 扫描接口
@EnableSwaggerBootstrapUi
public class StarterApplication01 {
    public static void main(String[] args) {
        SpringApplication.run(StarterApplication01.class);
    }
}
