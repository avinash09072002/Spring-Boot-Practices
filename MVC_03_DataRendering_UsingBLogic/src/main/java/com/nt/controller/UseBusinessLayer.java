package com.nt.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.nt.service.SeasonService;

@Controller
public class UseBusinessLayer {

    @Autowired
    private SeasonService service;

    @RequestMapping("/")
    public String usingBlayer() {
        return "welcome";
    }

    @RequestMapping("/sea")
    public String getSeason(Map<String, Object> map) {
        String msgString = service.getSession();
        map.put("msg", msgString);
        return "season";
    }
}
