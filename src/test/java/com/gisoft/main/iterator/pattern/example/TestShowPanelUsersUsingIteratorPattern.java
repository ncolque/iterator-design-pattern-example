package com.gisoft.main.iterator.pattern.example;
import org.junit.Before;
import org.junit.Test;

public class TestShowPanelUsersUsingIteratorPattern {
    
    private ShowPanelUsersUsingIteratorPattern panel;
    
    public TestShowPanelUsersUsingIteratorPattern() {}
    
    @Before
    public void setUp(){
        this.panel = new ShowPanelUsersUsingIteratorPattern();
    }
    
    @Test
    public void testShowGoogleUsers(){
        System.out.println("showGoogleUsers");
        this.panel.showGoogleUsers();
    }

    @Test
    public void testShowFacebookUsers() {
        System.out.println("showFacebookUsers");
        this.panel.showFacebookUsers();
    }
    
    @Test
    public void testShowCreUsers() {
        System.out.println("showCreUsers");
        this.panel.showCreUsers();
    }
}
