package com.czl.supermarket.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.czl.common.utils.PageUtils;
import com.czl.supermarket.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author chenzhenglong
 * @email longyu820729@163.com
 * @date 2020-07-16 18:21:00
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

