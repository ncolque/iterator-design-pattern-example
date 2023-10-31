
package com.gisoft.google;

import com.gisoft.iterator.pattern.Iterator;

public class GoogleIterator implements Iterator<GoogleUser>{

    private GoogleUser[] users;
    private int currentPosition = 0;

    public GoogleIterator(GoogleUser[] users) {
        this.users = users;
    }
    
    @Override
    public GoogleUser next() {
        if(!isDone()){
            return this.users[currentPosition++];
        }
        return null;
    }

    @Override
    public boolean isDone() {
        return this.currentPosition == this.users.length;
    }
}
