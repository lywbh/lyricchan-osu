package com.lyricchan.osu.mapper;

import org.springframework.stereotype.Repository;

import com.lyricchan.osu.entity.BeatmapPart;

import tk.mybatis.mapper.common.Mapper;

@Repository
public interface BeatmapPartMapper extends Mapper<BeatmapPart> {
}
