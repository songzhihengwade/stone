package com.stone.stone.controller;

import com.stone.stone.services.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @Autowired
    public IndexService indexService;
    @RequestMapping("/index")
    public String toIndex(){
        return "index";
    }
}
