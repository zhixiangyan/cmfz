package com.baizhi.cmfz.controller;

import com.baizhi.cmfz.entity.Menu;
import com.baizhi.cmfz.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MenuController {

    @Autowired
    private MenuService menuService;

    @RequestMapping("/getAllMenu")
    public @ResponseBody Map getAllMenu(){

        Map map=new HashMap();

        List<Menu> list= menuService.getAllMenu();

        System.out.println("***********"+list+"*******");

        map.put("list",list);
        return map;
    }

}
