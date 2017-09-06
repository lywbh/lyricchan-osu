package com.lyricchan.osu.constant;

/**
 * @author Lyric
 * @since 20170904
 */
public enum OsuAPIMethod {

    /** Retrieve general beatmap information. */
    GET_BEATMAPS("/get_beatmaps"),

    /** Retrieve general user information. */
    GET_USER("/get_user"),

    /** Retrieve information about the top 100 scores of a specified beatmap. */
    GET_SCORES("/get_scores"),

    /** Get the top scores for the specified user. */
    GET_USER_BEST("/get_user_best"),

    /** Gets the user's ten most recent plays over the last 24 hours. */
    GET_USER_RECENT("/get_user_recent"),

    /** Retrieve information about multiplayer match. */
    GET_MATCH("/get_match"),

    /** Get the replay data of a user's score on a map. */
    GET_REPLAY("/get_replay");

    private String value;

    private OsuAPIMethod(String method) {
        this.value = method;
    }

    public String toString() {
        return value;
    }
}
