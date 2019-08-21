package com.fengyue.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class TaskTest {

    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("HH:mm:ss");


//    @Scheduled(fixedRate = 3000)
    public void reportCurrentTime(){
        System.out.println("现在时间 ：  "+SIMPLE_DATE_FORMAT.format(new Date()));
    }
}
