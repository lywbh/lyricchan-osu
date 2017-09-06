package com.lyricchan.osu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lyricchan.osu.entity.WebUser;
import com.lyricchan.osu.service.WebUserService;

@Controller
@RequestMapping("/webuser")
public class WebUserController {

    private static final String USERNAME_REGEX = "[A-Za-z0-9]{3,30}";
    // private static final String NAME_REGEX = "";
    private static final String LOGIN = "/webuser/login";
    private static final String REGISTER = "/webuser/register";
    private static final String BMCOLLAB = "/bmcollab/index";

    @Autowired
    private WebUserService webUserService;

    @GetMapping("register")
    public String toRegister() {
        return REGISTER;
    }

    @GetMapping("login")
    public String toLogin() {
        return LOGIN;
    }

    /**
     * 注册。
     */
    @RequestMapping(value="doregister", method=RequestMethod.POST)
    public ModelAndView register(WebUser wu, HttpServletRequest request) {
        final ModelAndView mv = new ModelAndView(REGISTER);
        if (wu == null) {
            return mv.addObject("error", "非法参数");
        }
        final String username = wu.getUsername();
        if (!username.matches(USERNAME_REGEX)) {
            return mv.addObject("error", "用户名只能是英文和数字");
        }
        String name = wu.getUsername();
        if (name != null) {
            if ((name = name.trim()).length() > 24)
                return mv.addObject("error", "名字最长24个字符");
        }
        final String ip = request.getHeader("X-Real-IP");
        WebUser user = webUserService.selectByIP(ip);
        if (user != null) {
            return mv.addObject("error", "你已注册过");
        }
        wu.setIp(ip);
        WebUser wu0;
        try {
            wu0 = webUserService.register(wu);
            if (wu0 == null) {
                return mv.addObject("error", "注册出错");
            }
            mv.setViewName(LOGIN);
            mv.addObject("web_user", wu0);
            return mv.addObject("error", "注册成功 请登录");
        } catch (Exception e) {
        }
        return mv.addObject("error", "未知错误");
    }

    /**
     * 登录。
     */
    @PostMapping("dologin")
    public ModelAndView login(WebUser wu) {
        final ModelAndView mv = new ModelAndView(LOGIN);
        WebUser wu0;
        try {
            wu0 = webUserService.login(wu);
            if (wu0 == null) {
                return mv.addObject("error", "登录失败");
            }
            mv.setViewName(BMCOLLAB);
            mv.addObject("web_user", wu0);
            return mv.addObject("error", null);
        } catch (Exception e) {
        }
        return mv.addObject("error", "未知错误");
    }
}
