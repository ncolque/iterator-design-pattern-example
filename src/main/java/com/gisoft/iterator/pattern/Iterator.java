package com.gisoft.iterator.pattern;

public interface Iterator<T> {
    T next();
    boolean isDone();
}