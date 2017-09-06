package com.lyricchan.osu.mapper;

import org.springframework.stereotype.Repository;

import com.lyricchan.osu.entity.BeatmapCollaboration;

import tk.mybatis.mapper.common.Mapper;

@Repository
public interface BeatmapCollaborationMapper extends Mapper<BeatmapCollaboration> {
}
