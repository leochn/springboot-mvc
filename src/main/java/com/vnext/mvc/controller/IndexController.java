package com.vnext.mvc.controller;

import com.vnext.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 页面跳转
 * @author leo
 * @version 1.0.0
 * @date 2018-07-27 06:42:28
 */
@Controller
public class IndexController {
    @RequestMapping("/pageIndex")
    public String pageIndex() {
        return "pageIndex";
    }
}