package com.lu.filter.chainOfResponsity;

import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

import java.util.ArrayList;

public class ApplicationFilterChain {
    ArrayList<Filter> filters = new ArrayList<>();
    public void addFilter(Filter filter){
        filters.add(filter);
    }
    int index = 0;
    public void doFilter(){
        if(index < filters.size()){
            Filter filter = filters.get(index++);
            filter.doFilter(this);
        }
    }
}
