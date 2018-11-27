package com.baizhi.cmfz.controller;

import com.baizhi.cmfz.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class AdminController {

        @Autowired
        private AdminService adminService;


        @RequestMapping("/login")
        public String login(String username, String password, HttpSession session,
                            String code) {
           return adminService.login(username,password,code);

        }

}
