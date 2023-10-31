package com.gisoft.google;

public class GoogleApi {
    public GoogleUser[] getGoogleUsers(){
        GoogleUser[] users = new GoogleUser[3];
        users[0] = new GoogleUser("alejandra", "alemurillo104@gmail.com");
        users[1] = new GoogleUser("cristhian", "c@gmail.com");
        users[2] = new GoogleUser("nicolas", "n@gmail.com");
        return users;
    }   
}