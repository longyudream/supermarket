package com.czl.supermarket.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.czl.common.utils.PageUtils;
import com.czl.supermarket.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author chenzhenglong
 * @email longyu820729@163.com
 * @date 2020-07-21 11:12:08
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

