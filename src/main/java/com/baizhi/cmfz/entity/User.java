package com.baizhi.cmfz.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private int id;
    private String phoneNum;
    private String username;
    private String password;
    private int salt;
    private String dharmaName;
    private String province;
    private String city;
    private int sex;
    private String sign;
    private String headPic;
    private int status;
    private Date date;

}
