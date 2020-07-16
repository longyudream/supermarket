package com.czl.supermarket.product.dao;

import com.czl.supermarket.product.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 * 
 * @author chenzhenglong
 * @email sunlightcs@gmail.com
 * @date 2020-07-16 08:33:37
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {
	
}
