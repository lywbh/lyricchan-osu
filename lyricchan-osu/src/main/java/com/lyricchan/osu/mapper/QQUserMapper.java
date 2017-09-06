package com.lyricchan.osu.mapper;

import org.springframework.stereotype.Repository;

import com.lyricchan.osu.entity.QQUser;

import tk.mybatis.mapper.common.Mapper;

@Repository
public interface QQUserMapper extends Mapper<QQUser> {
}
