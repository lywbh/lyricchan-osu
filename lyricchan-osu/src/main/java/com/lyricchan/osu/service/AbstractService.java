package com.lyricchan.osu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lyricchan.commons.httpclient.HttpClientService;

/**
 * @author Lyric
 */
abstract class AbstractService {

    protected static String osuAPIKey, osuAPIURL;

    @Value("${osu_api_key}")
    private void setOsuAPIKey(String k) {
        osuAPIKey = k;
    }

    @Value("${osu_api_url}")
    private void setOsuAPIURL(String url) {
        osuAPIURL = url;
    }

    @Autowired
    protected HttpClientService httpClientService;

    @Autowired
    protected ObjectMapper objectMapper;
}
