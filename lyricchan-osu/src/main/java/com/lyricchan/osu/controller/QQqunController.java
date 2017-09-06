package com.lyricchan.osu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lyricchan.osu.entity.QQqun;
import com.lyricchan.osu.service.QQqunService;

@Controller
@RequestMapping("/qqqun")
public class QQqunController {

    private static final String QQQUN_NUMBER_REGEX = "[0-9]{4,14}";
    private static final String QQQUN_VISIT_SUCCESS = "/qqqun/index";
    private static final String QQQUN_VISIT_FAIL = "/qqqun/fail";

    @Autowired
    private QQqunService qqqunService;

    @RequestMapping(value="{number}", method=RequestMethod.GET)
    public ModelAndView getUser(@PathVariable("number") String number) {
        final ModelAndView mv = new ModelAndView(QQQUN_VISIT_FAIL);
        if (number == null || (number = number.trim()).isEmpty()) {
            return mv.addObject("error", "无群号");
        }
        if (!number.matches(QQQUN_NUMBER_REGEX)) {
            return mv.addObject("error", "非法参数");
        }
        QQqun qun;
        try {
            qun = qqqunService.findQQqunByNumber(number);
            if (qun == null) {
                return mv.addObject("error", "不存在该群");
            }
            mv.setViewName(QQQUN_VISIT_SUCCESS);
            mv.addObject("qqqun", qun);
            return mv.addObject("error", null);
        } catch (Exception e) {
        }
        return mv.addObject("error", "未知错误");
    }
}
