package com.gisoft.cre;

import com.gisoft.iterator.pattern.Aggregate;
import com.gisoft.iterator.pattern.Iterator;
import java.util.Map;

public class CreAggregate implements Aggregate{

    private Map<Integer, CreUserData> users;

    public CreAggregate(Map<Integer, CreUserData> users) {
        this.users = users;
    }
    
    @Override
    public Iterator createIterator() {
        return new CreIterator(this.users);
    }
}
