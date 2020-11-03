package com.landa.nameplatesystem.utils;

import java.util.ResourceBundle;

public class Constants {
    public static String SYSTEMNAME = "铭牌打印记录登记系统";
    public static String ONLINEUSERS = "ONLINEUSERS";

    public Constants() {
        ResourceBundle bundle=ResourceBundle.getBundle("config");
        SYSTEMNAME = bundle.getString("systemName").trim();
    }
}
