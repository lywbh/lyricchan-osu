package com.lyricchan.osu.mapper;

import org.springframework.stereotype.Repository;

import com.lyricchan.osu.entity.WebUser;

import tk.mybatis.mapper.common.Mapper;

@Repository
public interface WebUserMapper extends Mapper<WebUser> {
}
