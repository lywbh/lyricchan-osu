package com.lyricchan.osu.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * QQ群实体。
 * @author Lyric
 * @since 20170905
 */
@Entity
@Table(name="qqqun")
public class QQqun implements java.io.Serializable {
    private static final long serialVersionUID = 6958413L;
    private Long id; // 主键
    private String number; // 群号
    private String name; // 群名称
    private String abbr; // 简称
    private String abbr1; // 简称1
    private String icon; // 群图标
    private String email; // 群邮箱
    private String formday; // 成立日期
    private String introduction; // 群介绍
    private String announcement; // 群公告
    @Transient
    private QQUser moderator; // 群主 数据库对应moderator_id
    private Long moderator_id;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAbbr() {
        return abbr;
    }
    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }
    public String getAbbr1() {
        return abbr1;
    }
    public void setAbbr1(String abbr1) {
        this.abbr1 = abbr1;
    }
    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFormday() {
        return formday;
    }
    public void setFormday(String formday) {
        this.formday = formday;
    }
    public String getIntroduction() {
        return introduction;
    }
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
    public String getAnnouncement() {
        return announcement;
    }
    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }
    public QQUser getModerator() {
        return moderator;
    }
    public void setModerator(QQUser moderator) {
        this.moderator = moderator;
    }
    public Long getModerator_id() {
        return moderator_id;
    }
    public void setModerator_id(Long moderator_id) {
        final QQUser u = new QQUser();
        u.setId(moderator_id);
        this.moderator_id = moderator_id;
        this.moderator = u;
    }
}
