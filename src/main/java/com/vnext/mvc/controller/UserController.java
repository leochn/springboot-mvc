package com.vnext.mvc.controller;

import com.vnext.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * restfulAPI
 * @author leo
 * @version 1.0.0
 * @date 2018-07-27 06:42:56
 */
@RestController
public class UserController {




    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user", produces = "text/html;charset=UTF-8")
    public String index() {
        return userService.index();
    }


}