package com.czl.supermarket.coupon.dao;

import com.czl.supermarket.coupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author chenzhenglong
 * @email longyu820729@163.com
 * @date 2020-07-21 11:12:08
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
