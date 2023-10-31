package com.gisoft.main.iterator.pattern.example;

import com.gisoft.cre.CreApi;
import com.gisoft.cre.CreUserData;
import com.gisoft.facebook.FacebookApi;
import com.gisoft.facebook.FacebookUser;
import com.gisoft.google.GoogleApi;
import com.gisoft.google.GoogleUser;
import java.util.Map;

public class ShowUsersPanel {
    
    private final GoogleApi googleApi;
    private final FacebookApi facebookApi;
    private final CreApi creApi;
    
    public ShowUsersPanel() {
        this.googleApi = new GoogleApi();
        this.facebookApi = new FacebookApi();
        this.creApi = new CreApi();
    }
    
    public void showGoogleUsers(){
        
        var users = this.googleApi.getGoogleUsers();
        
        for (int i = 0; i < users.length; i++) {
            GoogleUser user = users[i];
            System.out.println("Nombre: " + user.getName() + " - Email: " + user.getEmail());
        }
    }
    
    public void showFaceboookUsers(){
        
        var users = this.facebookApi.getFacebookUsers();
        
        for (FacebookUser facebookUser : users) {
            FacebookUser user = facebookUser;
            System.out.println("Nombre: " + user.getFbName()+ " - Url: " + user.getFbUrl());
        }
    }
    
    public void showCreUsers(){
        var users = this.creApi.getCREinfo();
        
        for (Map.Entry<Integer,CreUserData> user : users.entrySet()) {
            
            var userData = user.getValue();
            System.out.println("Nombre: " + userData.getName()+ " - Address: " + userData.getAddress() + " - Payment: " + userData.getPayment());
        }
    }
}