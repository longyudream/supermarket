package com.czl.supermarket.order.dao;

import com.czl.supermarket.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author chenzhenglong
 * @email longyu820729@163.com
 * @date 2020-07-16 18:21:00
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
