package com.yyl.film.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/8/18.
 */
@Controller
public class MapController {

    @RequestMapping("/api/map")
    public String map(){
        return  "/map.html";
    }
}
