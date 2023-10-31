
package com.gisoft.cre;

import com.gisoft.iterator.pattern.Iterator;
import java.util.Map;

public class CreIterator implements Iterator<CreUserData>{

    private Map<Integer, CreUserData> users;
    private int currentPosition = 0;

    public CreIterator(Map<Integer, CreUserData> users) {
        this.users = users;
    }
    
    @Override
    public CreUserData next() {
        if (!isDone()) {
            return this.users.get(this.currentPosition++);
        }
        return null;
    }

    @Override
    public boolean isDone() {
        return this.currentPosition == this.users.size();
    }
    
}
