package com.czl.supermarket.ware.dao;

import com.czl.supermarket.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author chenzhenglong
 * @email longyu820729@163.com
 * @date 2020-07-21 11:18:48
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
