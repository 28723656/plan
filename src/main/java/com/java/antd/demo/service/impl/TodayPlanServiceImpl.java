package com.java.antd.demo.service.impl;

import com.java.antd.demo.dao.TodayPlanDao;
import com.java.antd.demo.entity.TodayPlanEntity;
import com.java.antd.demo.service.TodayPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author 风往西边吹丶
 * @create 2019-05-28 21:39
 */

@Service
public class TodayPlanServiceImpl implements TodayPlanService {

    @Autowired
    private TodayPlanDao todayPlanDao;

    @Override
    public List<TodayPlanEntity> findAllByRank(Integer rank) {
        return todayPlanDao.findAllByRank(rank);
    }

    @Override
    public TodayPlanEntity save(TodayPlanEntity todayPlanEntity){
        todayPlanEntity.setStartTime(new Date());
        TodayPlanEntity newEntity = todayPlanDao.save(todayPlanEntity);
        return newEntity;
    }

}
