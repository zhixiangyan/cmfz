package com.baizhi.cmfz.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Menu implements Serializable {

    private int id;
    private String title;
    private String iconCls;
    private int parentid;
    private String url;
    private List<Menu> menuList;

}
