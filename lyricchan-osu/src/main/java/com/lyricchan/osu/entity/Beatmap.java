package com.lyricchan.osu.entity;

/**
 * A beatmap (not a mapset).
 * @author Lyric
 * @since 20170901
 * @version 20170901
 */
public final class Beatmap implements java.io.Serializable {

    private static final long serialVersionUID = 6L;

    /** beatmap_id is per difficulty */
    private long beatmap_id;

    /** beatmapset_id groups difficulties into a set */
    private long beatmapset_id;

    /** 4 = loved, 3 = qualified, 2 = approved, 1 = ranked, 0 = pending, -1 = WIP, -2 = graveyard */
    private Integer approved;

    /** date ranked, UTC+8 for now */
    private String approved_date;

    /** last update date, timezone same as above. May be after approved_date if map was unranked and reranked */
    private String last_update;

    private String artist;

    private double bpm;

    private String creator;

    /** the amount of stars the map would have ingame and on the website */
    private double difficultyrating;

    /** CS */
    private double diff_size;

    /** AR */
    private double diff_approach;

    /** OD */
    private double diff_overall;

    /** HP */
    private double diff_drain;

    /** seconds from first note to last note not including breaks */
    private int hit_length;

    /** seconds from first note to last note including breaks */
    private int total_length;

    private String source;

    /** 0 = any, 1 = unspecified, 2 = video game, 3 = anime, 4 = rock, 5 = pop, 6 = other, 7 = novelty, 9 = hip hop, 10 = electronic (note that there's no 8) */
    private Integer genre_id;

    /** 0 = any, 1 = other, 2 = english, 3 = japanese, 4 = chinese, 5 = instrumental, 6 = korean, 7 = french, 8 = german, 9 = swedish, 10 = spanish, 11 = italian */
    private Integer language_id;

    /** song name */
    private String title;

    /** difficulty name */
    private String version;

    /** md5 hash of the beatmap */
    private String file_md5;

    /** game mod */
    private Integer mode;

    /** beatmap tags separated by spaces */
    private String tags;

    /** number of times the beatmap was favourited */
    private Integer favourite_count;

    /** number of times the beatmap was played */
    private Integer playcount;

    /** number of times the beatmap was passed, completed (the user didn't fail or retry) */
    private Integer passcount;

    /** the maximum combo a user can reach playing this beatmap */
    private Integer max_combo;

    public long getBeatmap_id() {
        return beatmap_id;
    }

    public void setBeatmap_id(long beatmap_id) {
        this.beatmap_id = beatmap_id;
    }

    public long getBeatmapset_id() {
        return beatmapset_id;
    }

    public void setBeatmapset_id(long beatmapset_id) {
        this.beatmapset_id = beatmapset_id;
    }

    public Integer getApproved() {
        return approved;
    }

    public void setApproved(Integer approved) {
        this.approved = approved;
    }

    public String getApproved_date() {
        return approved_date;
    }

    public void setApproved_date(String approved_date) {
        this.approved_date = approved_date;
    }

    public String getLast_update() {
        return last_update;
    }

    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getBpm() {
        return bpm;
    }

    public void setBpm(double bpm) {
        this.bpm = bpm;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public double getDifficultyrating() {
        return difficultyrating;
    }

    public void setDifficultyrating(double difficultyrating) {
        this.difficultyrating = difficultyrating;
    }

    public double getDiff_size() {
        return diff_size;
    }

    public void setDiff_size(double diff_size) {
        this.diff_size = diff_size;
    }

    public double getDiff_approach() {
        return diff_approach;
    }

    public void setDiff_approach(double diff_approach) {
        this.diff_approach = diff_approach;
    }

    public double getDiff_overall() {
        return diff_overall;
    }

    public void setDiff_overall(double diff_overall) {
        this.diff_overall = diff_overall;
    }

    public double getDiff_drain() {
        return diff_drain;
    }

    public void setDiff_drain(double diff_drain) {
        this.diff_drain = diff_drain;
    }

    public int getHit_length() {
        return hit_length;
    }

    public void setHit_length(int hit_length) {
        this.hit_length = hit_length;
    }

    public int getTotal_length() {
        return total_length;
    }

    public void setTotal_length(int total_length) {
        this.total_length = total_length;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(Integer genre_id) {
        this.genre_id = genre_id;
    }

    public Integer getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(Integer language_id) {
        this.language_id = language_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getFile_md5() {
        return file_md5;
    }

    public void setFile_md5(String file_md5) {
        this.file_md5 = file_md5;
    }

    public Integer getMode() {
        return mode;
    }

    public void setMode(Integer mode) {
        this.mode = mode;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Integer getFavourite_count() {
        return favourite_count;
    }

    public void setFavourite_count(Integer favourite_count) {
        this.favourite_count = favourite_count;
    }

    public Integer getPlaycount() {
        return playcount;
    }

    public void setPlaycount(Integer playcount) {
        this.playcount = playcount;
    }

    public Integer getPasscount() {
        return passcount;
    }

    public void setPasscount(Integer passcount) {
        this.passcount = passcount;
    }

    public Integer getMax_combo() {
        return max_combo;
    }

    public void setMax_combo(Integer max_combo) {
        this.max_combo = max_combo;
    }
}
