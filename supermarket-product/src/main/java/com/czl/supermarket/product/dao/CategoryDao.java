package com.czl.supermarket.product.dao;

import com.czl.supermarket.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author chenzhenglong
 * @email sunlightcs@gmail.com
 * @date 2020-07-16 08:33:38
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
