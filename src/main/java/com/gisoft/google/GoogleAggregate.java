package com.gisoft.google;

import com.gisoft.iterator.pattern.Aggregate;
import com.gisoft.iterator.pattern.Iterator;

public class GoogleAggregate implements Aggregate{

    private GoogleUser[] users;
    
    public GoogleAggregate(GoogleUser[] users) {
        this.users = users;
    }
    
    @Override
    public Iterator createIterator() {
        return new GoogleIterator(this.users);
    }
}
