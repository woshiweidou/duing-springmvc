package com.lu.filter.chainOfResponsity;

public class FilterTwo extends HttpFilter {
    @Override
    public void doFilter(ApplicationFilterChain chain) {
        System.out.println(2);
        chain.doFilter();
    }
}
