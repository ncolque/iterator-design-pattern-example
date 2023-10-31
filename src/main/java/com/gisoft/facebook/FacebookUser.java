package com.gisoft.facebook;

public class FacebookUser {
    private String fbName;
    private String fbUrl;

    public FacebookUser(String fbName, String fbUrl) {
        this.fbName = fbName;
        this.fbUrl = fbUrl;
    }

    public String getFbName() {
        return fbName;
    }

    public String getFbUrl() {
        return fbUrl;
    }   
}