package com.czl.supermarket.product.dao;

import com.czl.supermarket.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author chenzhenglong
 * @email sunlightcs@gmail.com
 * @date 2020-07-16 08:33:38
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
