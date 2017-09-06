package com.lyricchan.osu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lyricchan.osu.entity.User;
import com.lyricchan.osu.request.UserRequest;
import com.lyricchan.osu.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

    private static final String USERNAME_REGEX = "[A-Za-z0-9_\\s\\[\\]\\-]{3,32}";
    private static final String USER_INDEX = "/user/index";
    private static final String USER_INFO = "/user/info";

    @Autowired
    private UserService userService;

    @GetMapping("index")
    public String index() {
        return USER_INDEX;
    }

    /**
     * 模式：默认返回INDEX页面，只有当查询成功才会跳到INFO页。
     */
    @RequestMapping(value="info", method=RequestMethod.POST)
    public ModelAndView getUser(UserRequest userRequest) {
        final ModelAndView mv = new ModelAndView(USER_INDEX);
        if (userRequest == null || userRequest.getU() == null) {
            return mv.addObject("error", "参数错误");
        }
        final String username = userRequest.getU();
        if (!username.matches(USERNAME_REGEX)) {
            return mv.addObject("error", "用户名非法");
        }
        User u;
        try {
            u = userService.getUser(userRequest);
            if (u == null) {
                return mv.addObject("error", "不存在该用户");
            }
            mv.setViewName(USER_INFO);
            mv.addObject("user", u);
            return mv.addObject("error", null);
        } catch (org.apache.http.conn.ConnectTimeoutException e) {
            return mv.addObject("error", "访问超时 可能是PPY的小霸王又进泡面了吧");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mv.addObject("error", "未知错误");
    }
}
