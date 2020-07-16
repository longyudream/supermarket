package com.czl.supermarket.product.dao;

import com.czl.supermarket.product.entity.SpuCommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author chenzhenglong
 * @email sunlightcs@gmail.com
 * @date 2020-07-16 08:33:37
 */
@Mapper
public interface SpuCommentDao extends BaseMapper<SpuCommentEntity> {
	
}
