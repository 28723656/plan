package com.java.antd.demo.dao;


import com.java.antd.demo.entity.TodayPlanEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 风往西边吹丶
 * @create 2019-05-28 21:40
 */
public interface TodayPlanDao extends JpaRepository<TodayPlanEntity,Integer> {

    // 通过 rank查询所有的
     List<TodayPlanEntity> findAllByRank(Integer Rank);

}
