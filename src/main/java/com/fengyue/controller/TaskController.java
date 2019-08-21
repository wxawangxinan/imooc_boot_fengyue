package com.fengyue.controller;

import com.fengyue.service.AsyncTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;

@RestController
@RequestMapping("tasks")
public class TaskController {

    @Autowired
    private AsyncTask asyncTask;

    @RequestMapping("async")
    public String async() throws Exception{
        long start = System.currentTimeMillis();
        Future<Boolean> a = asyncTask.doTask_one();
        Future<Boolean> b = asyncTask.doTask_two();
        Future<Boolean> c = asyncTask.doTask_three();

        while (!a.isDone() || !b.isDone() || !c.isDone()){
            if(a.isDone() && b.isDone() && c.isDone()){
                break;
            }
        }
        long end = System.currentTimeMillis();

        String res = "任务总耗时 ：  "+(end - start)+"";
        return res;
    }
}
