package com.tl.flasher.monitor.job;

import java.util.Map;

/*
 * ━━━━━━如来保佑━━━━━━
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　┻　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━━━永无BUG━━━━━━
 * 源码学院-Monkey老师
 * bat.ke.qq.com
 * Monkey老师QQ：2625273792
 */
public class MonitorExecutorJob implements Runnable {
    private Map<String,Object> context;

    private MonitorExecutorJob(){}
    public MonitorExecutorJob(Map<String,Object> context){
        this.context = context;
    }
    @Override
    public void run() {
        MonitorJob.doJob(context);
    }
}
