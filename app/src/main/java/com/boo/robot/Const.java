package com.boo.robot;

import android.os.Environment;

/**
 * Created by 波妞 on 2017/5/8.
 */

public class Const {

    public static final String FILE_IMG_CACHE = Environment.getExternalStorageDirectory() + "/qrobot/images/cache/";
    public static final String FILE_VOICE_CACHE = Environment.getExternalStorageDirectory() + "/qrobot/voice/";
    public static final String FILE_DOWNLOAD = Environment.getExternalStorageDirectory() + "/qrobot/download/";

    public static final String XF_VOICE_APPID="573945a6";//讯飞语音appid
    public static final String XF_AD_APPID="573a6ddc";//讯飞广告appid
    public final static String XF_SET_VOICE_RECORD="VOICE_RECORD";//录音语言
    public final static String XF_SET_VOICE_READ="XF_SET_VOICE_READ";//朗读语言

     //登录手机号
    public final static String LOGIN_PHONE = "LOGIN_PHONE";
     //登录密码
    public final static String LOGIN_PWD = "LOGIN_PWD";
    //默认横坐标
    public final static double LOC_LONGITUDE = 116.403119;
    //默认纵坐标
    public final static double LOC_LATITUDE = 39.915378;
    // 实时定位地址
    public final static String ADDRESS = "ADDRESS";
    // 实时定位城市
    public final static String CITY = "CITY";
    //实时定位坐标
    public final static String LOCTION = "LOCTION";

    //静态地图API
    public static  final String LOCATION_URL_S = "http://api.map.baidu.com/staticimage?width=320&height=240&zoom=17&center=";
    public static  final String LOCATION_URL_L = "http://api.map.baidu.com/staticimage?width=480&height=800&zoom=17&center=";

    public static final String MSG_TYPE_TEXT="msg_type_text";//文本消息
    public static final String MSG_TYPE_IMG="msg_type_img";//图片
    public static final String MSG_TYPE_VOICE="msg_type_voice";//语音
    public static final String MSG_TYPE_LOCATION="msg_type_location";//位置

    //机器人api，注意key为本人所有，使用时请到图灵机器人官网注册http://www.tuling123.com
    public static final String ROBOT_URL="http://www.tuling123.com/openapi/api";
    public static final String ROBOT_KEY="24cf362cd4b88f7b8ef3cdf207c8765f";

    //分隔符
    public final static String  SPILT = "☆";
}