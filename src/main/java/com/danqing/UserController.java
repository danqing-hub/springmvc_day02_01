package com.danqing;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * @author 丹青
 * @date 2019/9/24 - 18:55
 **/
@Controller
public class UserController {
    /**
     * 向用户注册页面跳转
     */
    @RequestMapping("/toRegister")
    public String toRegister(){
        return "register";
    }

    /**
     * 接收用户注册信息
     */
    @RequestMapping("/registerUser")
    public String registerUser(User user){
        String username = user.getUsername();
        Integer password = user.getPassword();
        System.out.println("username="+username);
        System.out.println("password="+password);
        return "success";
    }
    @RequestMapping("/toUser")
    public String selectUser(){
        return "user";
    }
    @RequestMapping("/deleteUsers")
    public String deleteUsers(Integer[] ids){
        if(ids!=null){
            for(Integer id: ids){
                System.out.println("删除了id为"+id+"的用户！");
            }
        }else {
            System.out.println("ids=null");
        }
        return "success";
    }
}
