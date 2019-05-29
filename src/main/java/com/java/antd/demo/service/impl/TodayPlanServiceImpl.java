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

        TodayPlanEntity result = new TodayPlanEntity();

        //如果id为空，保存
        if(todayPlanEntity.getId() == null){
            result = todayPlanDao.save(todayPlanEntity);
        }else{
            // 非空，修改
            TodayPlanEntity  tempResult = todayPlanDao.findOne(todayPlanEntity.getId());
            if(todayPlanEntity.getEndTime()!=null){
                tempResult.setEndTime(todayPlanEntity.getEndTime());
            }
            if(todayPlanEntity.getFinished()!=null){
                tempResult.setFinished(todayPlanEntity.getFinished());
            }
            if(todayPlanEntity.getName()!=null){
                tempResult.setName(todayPlanEntity.getName());
            }
            if(todayPlanEntity.getRank()!=null){
                tempResult.setRank(todayPlanEntity.getRank());
            }
            if(todayPlanEntity.getScore()!=null){
                tempResult.setScore(todayPlanEntity.getScore());
            }
            if(todayPlanEntity.getStartTime()!=null){
                tempResult.setStartTime(todayPlanEntity.getStartTime());
            }
            if(todayPlanEntity.getTimeInterval()!=null){
                tempResult.setTimeInterval(todayPlanEntity.getTimeInterval());
            }

            result = todayPlanDao.save(tempResult);
        }
        return result;
    }

    @Override
    public TodayPlanEntity findById(Integer id) {
        return todayPlanDao.findOne(id);
    }


}
