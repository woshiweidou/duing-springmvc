package com.lu;

import java.util.HashMap;
import java.util.Map;

public  class  ThreadLocalManager {
    private static Map<String,ThreadLocal> threadLocalMap = new HashMap<>();

    public static ThreadLocal getThreadLocal(String key){
        ThreadLocal threadLocal = threadLocalMap.get(key);
        if(threadLocal == null){
            threadLocal = new ThreadLocal();
            threadLocalMap.put(key,threadLocal);
        }
        return threadLocal;
    }

    public static void setThreadLocalMap(String key,ThreadLocal threadLocal){
        threadLocalMap.put(key,threadLocal);
    }


}
