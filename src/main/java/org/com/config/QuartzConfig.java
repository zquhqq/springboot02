package org.com.config;

import org.com.jobs.MyFirstJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *  定时调度配置类
 */
//@Configuration   // 注释掉了之后定时调度任务就不会执行
public class QuartzConfig {
    // 创建JobDetail实例
    @Bean
    public JobDetail getJobDetail(){
        // JobBuilder: 定义和创建JobDetail实例
        return JobBuilder.newJob(MyFirstJob.class).storeDurably().build();
    }

    // 创建触发器
    @Bean
    public Trigger trigger01(){
        // 创建 SimpleScheduleBuilder
        SimpleScheduleBuilder simpleScheduleBuilder = SimpleScheduleBuilder.simpleSchedule()
                // 每 1 秒钟 执行一次
                .withIntervalInSeconds(12*60*60)
                // 永久循环
                .repeatForever();

        // 定义和创建TriggerBuilder实例接口
        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("trigger01","group01")
                .withSchedule(simpleScheduleBuilder)
                .forJob(getJobDetail())
                .build();
        return trigger;
    }
}
