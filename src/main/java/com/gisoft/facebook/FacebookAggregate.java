package com.gisoft.facebook;

import com.gisoft.iterator.pattern.Aggregate;
import com.gisoft.iterator.pattern.Iterator;
import java.util.List;

public class FacebookAggregate implements Aggregate{

    private List<FacebookUser> users;

    public FacebookAggregate(List<FacebookUser> users) {
        this.users = users;
    }
    
    @Override
    public Iterator createIterator() {
        return new FacebookIterator(this.users);
    }
}