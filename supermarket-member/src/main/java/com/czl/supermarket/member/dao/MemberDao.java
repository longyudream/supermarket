package com.czl.supermarket.member.dao;

import com.czl.supermarket.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author chenzhenglong
 * @email longyu820729@163.com
 * @date 2020-07-21 11:22:28
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
