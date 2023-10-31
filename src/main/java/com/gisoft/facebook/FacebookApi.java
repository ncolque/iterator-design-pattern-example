package com.gisoft.facebook;

import java.util.List;

public class FacebookApi {
    public List<FacebookUser> getFacebookUsers(){
        
        var users = List.of(
                new FacebookUser("Paty", "paty@gmail.com"),
                new FacebookUser("fernando", "f@gmail.com"),
                new FacebookUser("pedro", "pedro@gmail.com")
        );
        return users;
    }
}