package com.lu.filter.chainOfResponsity;

public class Test {
    public static void main(String[] args){
        ApplicationFilterChain chain = new ApplicationFilterChain();
        chain.addFilter(new FilterOne());
        chain.addFilter(new FilterTwo());
        chain.doFilter();
    }
}
