package com.java.antd.demo.controller;

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

    @RequestMapping("/today/{rank}")
    public List<TodayPlanEntity> getTodayPalnList(@PathVariable(value = "rank") Integer rank){
        return todayPlanService.findAllByRank(1);
    }

    @RequestMapping(value = "/today/save",method = RequestMethod.POST)
    public TodayPlanEntity save( TodayPlanEntity TodayPlanEntity ){
        return todayPlanService.save(TodayPlanEntity);

    }
}
