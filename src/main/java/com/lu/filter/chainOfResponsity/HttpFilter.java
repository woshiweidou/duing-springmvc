package com.lu.filter.chainOfResponsity;

public abstract class HttpFilter implements Filter{
    @Override
    public abstract void doFilter(ApplicationFilterChain chain) ;
}
