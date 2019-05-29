package com.java.antd.demo.controller;

import com.java.antd.demo.entity.Result;
import com.java.antd.demo.entity.StatusCode;
import com.java.antd.demo.entity.TodayPlanEntity;
import com.java.antd.demo.service.TodayPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 风往西边吹丶
 * @create 2019-05-28 21:35
 */

@RestController
public class TodayPlanController {

    @Autowired
    private TodayPlanService todayPlanService;

    @GetMapping("/today/{rank}")
    public Result getTodayPalnList(@PathVariable(value = "rank") Integer rank){
        return new Result(true, StatusCode.OK,"成功",todayPlanService.findAllByRank(rank));

    }

    @PutMapping( "/today/save")
    public Result save( TodayPlanEntity todayPlanEntity ){
        return new Result(true,StatusCode.OK,"成功",todayPlanService.save(todayPlanEntity));
    }



}
