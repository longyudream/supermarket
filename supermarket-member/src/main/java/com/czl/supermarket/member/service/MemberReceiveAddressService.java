package com.czl.supermarket.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.czl.common.utils.PageUtils;
import com.czl.supermarket.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author chenzhenglong
 * @email longyu820729@163.com
 * @date 2020-07-21 11:22:28
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

