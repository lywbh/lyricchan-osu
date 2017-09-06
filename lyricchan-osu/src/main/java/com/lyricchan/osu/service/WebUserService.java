package com.lyricchan.osu.service;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.lyricchan.commons.util.SimpleMD5Util;
import com.lyricchan.osu.entity.User;
import com.lyricchan.osu.entity.WebUser;
import com.lyricchan.osu.mapper.WebUserMapper;
import com.lyricchan.osu.request.UserRequest;

/**
 * lyricchan.com用户业务。
 * @author Lyric
 * @since 20170906
 */
@Service
public class WebUserService extends AbstractService {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebUserService.class);

    @Autowired
    private WebUserMapper webUserMapper;

    @Autowired
    private UserService userService;

    @Value("${web_user_enc_token}")
    private String encToken;

    /**
     * 加密。
     */
    private String enc(String orig) {
        final String s = encToken;
        String md5 = SimpleMD5Util.md5(orig + s);
        return SimpleMD5Util.md5(s + md5);
    }

    public WebUser register(WebUser wu) throws Exception {
        String username = wu.getUsername();
        WebUser record = new WebUser();
        record.setUsername(username);
        WebUser one = webUserMapper.selectOne(record);
        if (one != null) {
            return null;
        }
        String origPw = wu.getPassword();
        String pw = enc(origPw);
        String osuId = wu.getOsu_id();
        LOGGER.info("osu!ID for register: " + osuId);
        if (osuId != null && !(osuId.isEmpty())) {
            UserRequest req = new UserRequest();
            req.setU(osuId);
            req.setType("string");
            req.setK(osuAPIKey);
            req.setEvent_days((short)1);
            User user = userService.getUser(req);
            if (user != null) {
                wu.setOsu_uid(user.getUser_id());
            }
            wu.setOsu(user);
        }
        wu.setPassword(pw);
        wu.setId(null);
        webUserMapper.insertSelective(wu);
        wu.setPassword(null);
        return wu;
    }

    /**
     * 按IP寻找。
     */
    public WebUser selectByIP(String ip) {
        WebUser record = new WebUser();
        record.setIp(ip);
        return webUserMapper.selectOne(record);
    }

    public WebUser login(final WebUser wu) throws Exception {
        if (wu == null) return null;
        String origPw = wu.getPassword();
        String pw = enc(origPw);
        wu.setPassword(pw);
        WebUser wu0 = webUserMapper.selectOne(wu);
        wu0.setOsu(requestOsuUserByUID(wu0.getOsu_uid()));
        return wu0;
    }

    private User requestOsuUserByUID(Long uid) throws ClientProtocolException, IOException {
        if (uid != null && uid > 0L) {
            UserRequest req = new UserRequest();
            req.setU(Long.toString(uid.longValue()));
            req.setType("id");
            req.setK(osuAPIKey);
            req.setEvent_days((short)1);
            return userService.getUser(req);
        }
        return null;
    }
}
