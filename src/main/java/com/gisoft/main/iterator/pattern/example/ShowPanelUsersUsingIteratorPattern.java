package com.gisoft.main.iterator.pattern.example;

import com.gisoft.cre.CreAggregate;
import com.gisoft.cre.CreApi;
import com.gisoft.cre.CreIterator;
import com.gisoft.cre.CreUserData;
import com.gisoft.facebook.FacebookAggregate;
import com.gisoft.facebook.FacebookApi;
import com.gisoft.facebook.FacebookIterator;
import com.gisoft.facebook.FacebookUser;
import com.gisoft.google.GoogleAggregate;
import com.gisoft.google.GoogleApi;
import com.gisoft.google.GoogleIterator;
import com.gisoft.google.GoogleUser;

public class ShowPanelUsersUsingIteratorPattern {
   
    private final FacebookAggregate facebookAggregate;
    private final GoogleAggregate googleAggregate;
    private final CreAggregate creAggregate;
    
    public ShowPanelUsersUsingIteratorPattern(){
        this.facebookAggregate = new FacebookAggregate(new FacebookApi().getFacebookUsers());
        this.googleAggregate = new GoogleAggregate(new GoogleApi().getGoogleUsers());
        this.creAggregate = new CreAggregate(new CreApi().getCREinfo());
    }
    
    public void showFacebookUsers(){
        FacebookIterator iterator = (FacebookIterator) this.facebookAggregate.createIterator();
        while (!iterator.isDone()) {            
            FacebookUser user = iterator.next();
            System.out.println("Nombre: " + user.getFbName()+ " - Url: " + user.getFbUrl());
        }
    }
    
    public void showGoogleUsers(){
        GoogleIterator iterator = (GoogleIterator) this.googleAggregate.createIterator();
        while (!iterator.isDone()) {            
            GoogleUser user = iterator.next();
            System.out.println("Nombre: " + user.getName() + " - Email: " + user.getEmail());
        }
    }
    
    public void showCreUsers(){
        CreIterator iterator = (CreIterator) this.creAggregate.createIterator();
        while (!iterator.isDone()) {            
            CreUserData user = iterator.next();
            System.out.println("Nombre: " + user.getName()+ " - Address: " + user.getAddress() + " - Payment: " + user.getPayment());
        }
    }
}