package com.baizhi.cmfz.service.impl;

import com.baizhi.cmfz.dao.AdminDao;
import com.baizhi.cmfz.entity.Admin;
import com.baizhi.cmfz.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class AdminServiceImpl  implements AdminService {

    @Autowired
    private AdminDao adminDao;
    @Autowired
    private HttpSession session;

    @Override
    public String login(String username, String password,String code) {

        String sessioncode = (String) session.getAttribute("code");

        if (!sessioncode.equalsIgnoreCase(code)) {

            return "login";
        }

        Admin admin = adminDao.login(username, password);

        if (admin != null) {

            session.setAttribute("admin", admin);

            return "redirect:/main/main.jsp";

        }

        return "login";

    }
}
