package org.com.jobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.SimpleDateFormat;

/**
 * 定时调度任务:
 *     Job: 通过Scheduler执行任务，任务类需要实现接口
 */
public class MyFirstJob implements Job {

    // 日志打印
    private Logger logger = LoggerFactory.getLogger(MyFirstJob.class);

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("定时任务....");
        logger.info("当前时间：{}",sdf);
    }
}
