package com.lu.filter.chainOfResponsity;

public class FilterOne extends HttpFilter {
    @Override
    public void doFilter(ApplicationFilterChain chain) {
        System.out.println("1");
        chain.doFilter(); }
}
