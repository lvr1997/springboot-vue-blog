package com.xgsxd.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/message")
public class MessageController {

    @RequestMapping("/list")
    public String selectMessageList() {

        return "comment";
    }
}
