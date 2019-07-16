package com.example.zuul.controller;

import com.example.zuul.domain.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model) {
        Msg msg = new Msg("测试标题", "测试内容", "欢迎来到HOME页面,您拥有 ROLE_HOME 权限");
        model.addAttribute("msg", msg);
        return "home.html";
    }

    @RequestMapping("/login")
    @ResponseBody
    public String login(Model model) {

        return "login.html";
//        return "请先登录";
    }

    @RequestMapping("/admin")
    @ResponseBody
    public String hello() {
        return "hello admin";
    }
}
