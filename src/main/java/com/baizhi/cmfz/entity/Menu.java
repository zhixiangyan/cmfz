package com.baizhi.cmfz.entity;

import java.io.Serializable;
import java.util.List;

public class Menu implements Serializable {

    private int id;
    private String title;
    private String iconCls;
    private int parentid;
    private String url;
    private List<Menu> menuList;

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", iconCls='" + iconCls + '\'' +
                ", parentid=" + parentid +
                ", url='" + url + '\'' +
                ", menuList=" + menuList +
                '}';
    }

    public Menu(int id, String title, String iconCls, int parentid, String url, List<Menu> menuList) {
        this.id = id;
        this.title = title;
        this.iconCls = iconCls;
        this.parentid = parentid;
        this.url = url;
        this.menuList = menuList;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public Menu(int id, String title, String iconCls, int parentid, String url) {
        this.id = id;
        this.title = title;
        this.iconCls = iconCls;
        this.parentid = parentid;
        this.url = url;
    }

    public Menu() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
