package com.boo.robot;

import java.util.List;

/**
 * Created by 波妞 on 2017/5/8.
 */

public class InfosDto {
    private List<Infos> infosList;
    private String nextPageUrl;

    public List<Infos> getInfoList() {
        return this.infosList;
    }
    public void setInfoList(List<Infos> infosList) {
        this.infosList = infosList;
    }

    public String getNextPageUrl() {
        return this.nextPageUrl;
    }
    public void setNextPageUrl(String nextPageUrl) {
        this.nextPageUrl = nextPageUrl;
    }
}