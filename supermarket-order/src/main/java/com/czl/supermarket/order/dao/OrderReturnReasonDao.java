package com.czl.supermarket.order.dao;

import com.czl.supermarket.order.entity.OrderReturnReasonEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 * 
 * @author chenzhenglong
 * @email longyu820729@163.com
 * @date 2020-07-16 18:21:00
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReasonEntity> {
	
}
