package com.fengyue.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

@Component
public class AsyncTask {

    @Async
    public Future<Boolean> doTask_one() throws Exception{
        long start = System.currentTimeMillis();
        Thread.sleep(1000);
        long end = System.currentTimeMillis();
        System.out.println("任务one耗时："+ (end - start) +"毫秒");
        return new AsyncResult<>(true);
    }

    @Async
    public Future<Boolean> doTask_two() throws Exception{
        long start = System.currentTimeMillis();
        Thread.sleep(300);
        long end = System.currentTimeMillis();
        System.out.println("任务two耗时："+ (end - start) +"毫秒");
        return new AsyncResult<>(true);
    }

    @Async
    public Future<Boolean> doTask_three() throws Exception{
        long start = System.currentTimeMillis();
        Thread.sleep(500);
        long end = System.currentTimeMillis();
        System.out.println("任务three耗时："+ (end - start) +"毫秒");
        return new AsyncResult<>(true);
    }
}
