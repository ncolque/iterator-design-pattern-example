package com.gisoft.main.iterator.pattern.example;

import org.junit.Test;
import org.junit.Before;

public class TestShowUsersPanel {

    private ShowUsersPanel panel;

    public TestShowUsersPanel() {
    }

    @Before
    public void setUp() {
        this.panel = new ShowUsersPanel();
    }

    @Test
    public void testShowGoogleUsers() {
        System.out.println("showGoogleUsers");
        this.panel.showGoogleUsers();
    }

    @Test
    public void testShowFaceboookUsers() {
        System.out.println("showFaceboookUsers");
        this.panel.showFaceboookUsers();
    }

    @Test
    public void testShowCreUsers() {
        System.out.println("showCreUsers");
        this.panel.showCreUsers();
    }
}