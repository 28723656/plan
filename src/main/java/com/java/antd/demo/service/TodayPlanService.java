package com.java.antd.demo.service;

import com.java.antd.demo.entity.TodayPlanEntity;

import java.util.List;

/**
 * @author 风往西边吹丶
 * @create 2019-05-28 21:37
 */


public interface TodayPlanService {

    List<TodayPlanEntity> findAllByRank(Integer rank);

    TodayPlanEntity save(TodayPlanEntity todayPlanEntity);
}
