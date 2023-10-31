package com.gisoft.facebook;

import com.gisoft.iterator.pattern.Iterator;
import java.util.List;

public class FacebookIterator implements Iterator<FacebookUser> {

    private List<FacebookUser> users;

    private int currentPosition = 0;

    public FacebookIterator(List<FacebookUser> users) {
        this.users = users;
    }

    @Override
    public FacebookUser next() {
        if (!isDone()) {
            return users.get(currentPosition++);
        }
        return null;
    }

    @Override
    public boolean isDone() {
        return (this.currentPosition) == users.size();
    }
}
