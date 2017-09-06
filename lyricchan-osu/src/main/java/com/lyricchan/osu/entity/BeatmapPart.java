package com.lyricchan.osu.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * 图的一个分段，一般用于Collab。
 * @author Lyric
 * @since 20170905
 */
@Entity
@Table(name="beatmap_part")
public class BeatmapPart implements java.io.Serializable {
    private static final long serialVersionUID = 3L;
    private Long id; // 主键
    private String value; // 值
    @Transient
    private WebUser worker; // 谁来做 数据库对应worker_id
    private Long worker_id;
    private String remark; // 备注
    private Byte status; // 状态
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public WebUser getWorker() {
        return worker;
    }
    public void setWorker(WebUser worker) {
        this.worker = worker;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getWorker_id() {
        return worker_id;
    }
    public void setWorker_id(Long worker_id) {
        final WebUser wu = new WebUser();
        wu.setId(worker_id);
        this.worker_id = worker_id;
        this.worker = wu;
    }
    public Byte getStatus() {
        return status;
    }
    public void setStatus(Byte status) {
        this.status = status;
    }
}
