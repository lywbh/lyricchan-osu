package com.lyricchan.osu.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * QQ用户。
 * @author Lyric
 * @since 20170905
 */
@Entity
@Table(name="qq_user")
public class QQUser implements java.io.Serializable {
    private static final long serialVersionUID = 8475L;
    private Long id; // 主键
    private String number; // QQ号
    private String nick; // 昵称
    private String signature; // 签名
    private String portrait; // 头像
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
    public String getNick() {
        return nick;
    }
    public void setNick(String nick) {
        this.nick = nick;
    }
    public String getSignature() {
        return signature;
    }
    public void setSignature(String signature) {
        this.signature = signature;
    }
    public String getPortrait() {
        return portrait;
    }
    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }
}
