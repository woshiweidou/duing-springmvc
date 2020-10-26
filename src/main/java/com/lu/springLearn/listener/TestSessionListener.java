package com.lu.springLearn.listener;

import javax.servlet.http.*;

public class TestSessionListener implements HttpSessionAttributeListener, HttpSessionListener {
    @Override
    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("添加了一个session域对象 ");
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("销毁了一个session域对象");
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("修改了一个session域对象");
    }

    //---------------------------------------------------------------
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {

        System.out.println("session域对象产生了");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        System.out.println("session域对象销毁了");
    }
}
