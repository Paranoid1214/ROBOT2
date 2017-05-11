package com.boo.robot;

/**
 * Created by 波妞 on 2017/5/8.
 */

//信息条目

public class InfoItem {
    private int infoType;// 类型
    private String title; // 标题
    private String link; // 链接
    private int id;// 标识
    private String date; // 日期
    private String imgLink;// 图片链接
    private String content;// 内容


    //信息类型
    public int getInfoType() {
        return infoType;
    }
    public void setInfoType(int newsType) {
        this.infoType = newsType;
    }
    //标题
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    //链接
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
    //ID
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    //日期
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    //图片链接
    public String getImgLink() {
        return imgLink;
    }
    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }

    //内容
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "InfoItem [id=" + id + ", title=" + title + ", link=" + link + ", date=" + date + ", imgLink=" + imgLink + ", content=" + content + ", infoType=" + infoType + "]";
    }
}