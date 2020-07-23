package com.czl.supermarket.order.dao;

import com.czl.supermarket.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author chenzhenglong
 * @email longyu820729@163.com
 * @date 2020-07-16 18:20:59
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
