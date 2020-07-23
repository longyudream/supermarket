package com.czl.supermarket.order.dao;

import com.czl.supermarket.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author chenzhenglong
 * @email longyu820729@163.com
 * @date 2020-07-16 18:20:59
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
