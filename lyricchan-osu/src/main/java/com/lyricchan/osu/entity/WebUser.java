package com.lyricchan.osu.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * lyricchan.com的用户。
 * @author Lyric
 * @since 20170905
 */
@Entity
@Table(name="web_user")
public class WebUser implements java.io.Serializable {

    private static final long serialVersionUID = 8888888888888888L;

    private Long id; // 主键
    private String name; // 名
    private String username; // 用户名
    private String password; // 密码
    @Transient
    private QQUser qq; // QQ号 数据库对应qq_number
    private String qq_number;
    @Transient
    private User osu; // osu帐号 数据库对应osu_uid
    private Long osu_uid;
    @Transient
    private String osu_id;
    @Transient
    private List<QQqun> quns; // 加入的QQ群
    @Transient
    private BeatmapCollaboration current; // 当前合作的图 数据库对应current_bmcollab_id
    private Long current_bmcollab_id;
    @Transient
    private List<BeatmapCollaboration> collabs; // 合作的图们
    @Transient
    private List<Beatmap> beatmaps; // 官网的图们
    private Byte status; // 用户状态
    private String ip; // IP
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public QQUser getQq() {
        return qq;
    }
    public void setQq(QQUser qq) {
        this.qq = qq;
    }
    public User getOsu() {
        return osu;
    }
    public void setOsu(User osu) {
        this.osu = osu;
    }
    public List<QQqun> getQuns() {
        return quns;
    }
    public void setQuns(List<QQqun> quns) {
        this.quns = quns;
    }
    public BeatmapCollaboration getCurrent() {
        return current;
    }
    public void setCurrent(BeatmapCollaboration current) {
        this.current = current;
    }
    public List<BeatmapCollaboration> getCollabs() {
        return collabs;
    }
    public void setCollabs(List<BeatmapCollaboration> collabs) {
        this.collabs = collabs;
    }
    public List<Beatmap> getBeatmaps() {
        return beatmaps;
    }
    public void setBeatmaps(List<Beatmap> beatmaps) {
        this.beatmaps = beatmaps;
    }
    public Byte getStatus() {
        return status;
    }
    public void setStatus(Byte status) {
        this.status = status;
    }
    public String getQq_number() {
        return qq_number;
    }
    public void setQq_number(String qq_number) {
        final QQUser qq = new QQUser();
        qq.setNumber(qq_number);
        this.qq_number = qq_number;
        this.qq = qq;
    }
    public Long getOsu_uid() {
        return osu_uid;
    }
    public void setOsu_uid(Long osu_uid) {
        final User user = new User();
        user.setUser_id(osu_uid);
        this.osu_uid = osu_uid;
        this.osu = user;
    }
    public Long getCurrent_bmcollab_id() {
        return current_bmcollab_id;
    }
    public void setCurrent_bmcollab_id(Long current_bmcollab_id) {
        final BeatmapCollaboration bc = new BeatmapCollaboration();
        bc.setId(current_bmcollab_id);
        this.current_bmcollab_id = current_bmcollab_id;
        this.current = bc;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getOsu_id() {
        return osu_id;
    }
    public void setOsu_id(String osu_id) {
        this.osu_id = osu_id;
    }
}
