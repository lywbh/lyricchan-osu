package com.lyricchan.osu.service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.lyricchan.commons.util.URLBuilder;
import com.lyricchan.osu.constant.OsuAPIMethod;
import com.lyricchan.osu.entity.User;
import com.lyricchan.osu.request.UserRequest;

/**
 * osu!用户信息业务。
 * @author Lyric
 */
@Service
public class UserService extends AbstractService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);
    private static final String GET_USER = OsuAPIMethod.GET_USER.toString();

    public User getUser(UserRequest userRequest) throws ClientProtocolException, IOException {
        String username = userRequest.getU();
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("k", osuAPIKey);
        params.put("u", username);
        params.put("mode", userRequest.getM()); // default to 0
        String url = URLBuilder.build(osuAPIURL + GET_USER, params);
        LOGGER.info("get user: " + url);
        long start = System.currentTimeMillis();
        String jsonArray = httpClientService.doGet(url);
        long end = System.currentTimeMillis();
        User[] users = objectMapper.readValue(jsonArray, User[].class);
        if (users != null) {
            LOGGER.info("found {} user(s) in {} seconds", users.length, (end - start) / 1000.0);
            return (users.length < 1) ? null : users[0];
        }
        return null;
    }
}
