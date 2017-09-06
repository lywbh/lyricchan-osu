package com.lyricchan.osu.request;

/**
 * 向osu!API服务器发起获取用户请求的参数封装在此。
 * @author Lyric
 * @since 20170904
 */
public class UserRequest {

    /** API key. */
    private String k;

    /** Specify a user_id or a username to return metadata from (required). */
    private String u;

    /** Mode (0 = osu!, 1 = Taiko, 2 = CtB, 3 = osu!mania). Optional, default value is 0. */
    private int m;

    /** Specify if u is a user_id or a username. Use string for usernames or id for user_ids. Optional, default behaviour is automatic recognition (may be problematic for usernames made up of digits only). */
    private String type;

    /** Max number of days between now and last event date. Range of 1-31. Optional, default value is 1. */
    private Short event_days;

    public String getK() {
        return k;
    }

    public void setK(String k) {
        this.k = k;
    }

    public String getU() {
        return u;
    }

    public void setU(String u) {
        this.u = u;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Short getEvent_days() {
        return event_days;
    }

    public void setEvent_days(Short event_days) {
        this.event_days = event_days;
    }
}
