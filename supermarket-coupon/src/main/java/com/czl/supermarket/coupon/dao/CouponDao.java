package com.czl.supermarket.coupon.dao;

import com.czl.supermarket.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author chenzhenglong
 * @email longyu820729@163.com
 * @date 2020-07-21 11:12:09
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
