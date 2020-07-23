package com.czl.supermarket.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.czl.common.utils.PageUtils;
import com.czl.supermarket.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author chenzhenglong
 * @email longyu820729@163.com
 * @date 2020-07-21 11:18:48
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

