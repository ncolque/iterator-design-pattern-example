package com.gisoft.google;

public class GoogleUser {
    private String name;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    private String email;

    public GoogleUser(String name, String email) {
        this.name = name;
        this.email = email;
    }
}