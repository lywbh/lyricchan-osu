package com.lyricchan.osu.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller @RequestMapping("/")
public class PageJumpingController {

    /**
     * Go to a page.
     * @param pageName
     */
    @RequestMapping(value="{pageName}", method=RequestMethod.GET)
    public String to(@PathVariable("pageName") String pageName) {
        return pageName;
    }
}
