package com.lyricchan.osu.entity;

/**
 * An osu! user (player).
 * @author Lyric
 * @since 20170901
 * @version 20170901
 */
public final class User implements java.io.Serializable {

    private static final long serialVersionUID = 73L;

    private long user_id;
    private String username;

    /* Total amount for all ranked, approved, and loved beatmaps played. */
    private Long count300;
    private Long count100;
    private Long count50;

    /** Only counts ranked, approved, and loved beatmaps. */
    private Integer playcount;

    /** Counts the best individual score on each ranked, approved, and loved beatmaps. */
    private Long ranked_score;

    /** Counts every score on ranked, approved, and loved beatmaps. */
    private Long total_score;

    private Long pp_rank;

    private Double level;

    /** For inactive players this will be 0 to purge them from leaderboards. */
    private Double pp_raw;

    private Double accuracy;

    /* Counts for SS/S/A ranks on maps. */
    private Integer count_rank_ss;
    private Integer count_rank_s;
    private Integer count_rank_a;

    /**
     * Uses the ISO3166-1 alpha-2 country code naming.<br>
     * See this for more information: http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2/
     */
    private String country;

    /** The user's rank in the country. */
    private Long pp_country_rank;

    /** Contains events for this user. */
    private Event[] events;

    public static final class Event {
        private String display_html; // <img src='\/images\/A_small.png'\/>...
        private Long beatmap_id;
        private Long beatmapset_id;
        private String date;

        /** How "epic" this event is (between 1 and 32). */
        private Integer epicfactor;

        public String getDisplay_html() {
            return display_html;
        }

        public void setDisplay_html(String display_html) {
            this.display_html = display_html;
        }

        public Long getBeatmap_id() {
            return beatmap_id;
        }

        public void setBeatmap_id(Long beatmap_id) {
            this.beatmap_id = beatmap_id;
        }

        public Long getBeatmapset_id() {
            return beatmapset_id;
        }

        public void setBeatmapset_id(Long beatmapset_id) {
            this.beatmapset_id = beatmapset_id;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public Integer getEpicfactor() {
            return epicfactor;
        }

        public void setEpicfactor(Integer epicfactor) {
            this.epicfactor = epicfactor;
        }
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getCount300() {
        return count300;
    }

    public void setCount300(Long count300) {
        this.count300 = count300;
    }

    public Long getCount100() {
        return count100;
    }

    public void setCount100(Long count100) {
        this.count100 = count100;
    }

    public Long getCount50() {
        return count50;
    }

    public void setCount50(Long count50) {
        this.count50 = count50;
    }

    public Integer getPlaycount() {
        return playcount;
    }

    public void setPlaycount(Integer playcount) {
        this.playcount = playcount;
    }

    public Long getRanked_score() {
        return ranked_score;
    }

    public void setRanked_score(Long ranked_score) {
        this.ranked_score = ranked_score;
    }

    public Long getTotal_score() {
        return total_score;
    }

    public void setTotal_score(Long total_score) {
        this.total_score = total_score;
    }

    public Long getPp_rank() {
        return pp_rank;
    }

    public void setPp_rank(Long pp_rank) {
        this.pp_rank = pp_rank;
    }

    public Double getLevel() {
        return level;
    }

    public void setLevel(Double level) {
        this.level = level;
    }

    public Double getPp_raw() {
        return pp_raw;
    }

    public void setPp_raw(Double pp_raw) {
        this.pp_raw = pp_raw;
    }

    public Double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Double accuracy) {
        this.accuracy = accuracy;
    }

    public Integer getCount_rank_ss() {
        return count_rank_ss;
    }

    public void setCount_rank_ss(Integer count_rank_ss) {
        this.count_rank_ss = count_rank_ss;
    }

    public Integer getCount_rank_s() {
        return count_rank_s;
    }

    public void setCount_rank_s(Integer count_rank_s) {
        this.count_rank_s = count_rank_s;
    }

    public Integer getCount_rank_a() {
        return count_rank_a;
    }

    public void setCount_rank_a(Integer count_rank_a) {
        this.count_rank_a = count_rank_a;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Long getPp_country_rank() {
        return pp_country_rank;
    }

    public void setPp_country_rank(Long pp_country_rank) {
        this.pp_country_rank = pp_country_rank;
    }

    public Event[] getEvents() {
        return events;
    }

    public void setEvents(Event[] events) {
        this.events = events;
    }
}
