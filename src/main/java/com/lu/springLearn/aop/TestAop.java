package com.lu.springLearn.aop;

public class TestAop {
    public void beforeMethod(){
        System.out.println("卖东西");
    }
    public void afterReturningMethod(){
        System.out.println("一共52快");
    }
    public  void after(){
        System.out.println("老板您慢走");
    }
}
