package com.lyricchan.osu.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * 合作图(Collab)。
 * @author Lyric
 * @since 20170905
 */
@Entity
@Table(name="beatmap_collaboration")
public class BeatmapCollaboration implements java.io.Serializable {

    private static final long serialVersionUID = 66L;

    private Long id; // 主键
    @Transient
    private Beatmap beatmap; // 本体 数据库对应beatmap_id字段
    private Long beatmap_id;
    @Transient
    private WebUser creator; // 谁的 数据库对应creator_id字段
    private Long creator_id;
    private String rule; // 规则
    private String des; // 说明
    @Transient
    private List<BeatmapPart> parts; // 分段 一对多 字段在part表一方
    private String remark; // 备注
    private Byte status; // 状态

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Beatmap getBeatmap() {
        return beatmap;
    }
    public void setBeatmap(Beatmap beatmap) {
        this.beatmap = beatmap;
    }
    public WebUser getCreator() {
        return creator;
    }
    public void setCreator(WebUser creator) {
        this.creator = creator;
    }
    public String getRule() {
        return rule;
    }
    public void setRule(String rule) {
        this.rule = rule;
    }
    public String getDes() {
        return des;
    }
    public void setDes(String des) {
        this.des = des;
    }
    public List<BeatmapPart> getParts() {
        return parts;
    }
    public void setParts(List<BeatmapPart> parts) {
        this.parts = parts;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public Byte getStatus() {
        return status;
    }
    public void setStatus(Byte status) {
        this.status = status;
    }
    public Long getBeatmap_id() {
        return beatmap_id;
    }
    public void setBeatmap_id(Long beatmap_id) {
        final Beatmap b = new Beatmap();
        b.setBeatmap_id(beatmap_id);
        this.beatmap_id = beatmap_id;
        this.beatmap = b;
    }
    public Long getCreator_id() {
        return creator_id;
    }
    public void setCreator_id(Long creator_id) {
        final WebUser webUser = new WebUser();
        webUser.setId(creator_id);
        this.creator_id = creator_id;
        this.creator = webUser;
    }
}
