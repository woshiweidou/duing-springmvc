package com.lu.controller;

import com.lu.ThreadLocalManager;
import com.lu.entity.User;
import com.lu.mapper.UserMapper;
import com.lu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TestController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/show")
    @ResponseBody
    public String saa(){
        List<User> list = userMapper.findUserAll();
        return list.toString();
    }

    @Autowired
    UserService userService;
    @RequestMapping("/welcome")
    public ModelAndView aaa(User user){
        ModelAndView modelAndView = new ModelAndView();
        if(userService.login(user)){
            ThreadLocal threadLocal = ThreadLocalManager.getThreadLocal(user.getUsername());
            String name = (String) threadLocal.get();
            String  info = "欢迎您" + name;
            modelAndView.addObject("welcome",info);
        }else {
            String info = "账号或密码错误";
            modelAndView.addObject("welcome",info);
        }
        modelAndView.setViewName("welcome.jsp");
        return modelAndView;
    }
}
