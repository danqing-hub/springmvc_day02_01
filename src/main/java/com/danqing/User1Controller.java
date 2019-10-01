package com.danqing;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 丹青
 * @date 2019/9/27 - 23:06
 **/
@Controller
public class User1Controller {
    /**
     * 接收页面请求的JSON数据，并返回JSON格式结果
     */

    @RequestMapping("/totestJson")
    public String toTestJson(){
        return "testJson";
    }

    @RequestMapping("/testJson")
    public @ResponseBody User1 testJson(@RequestBody User1 user1){
        //打印接收的JSON格式数据
        System.out.println(user1);
        //返回JSON格式的响应
        return user1;
    }
}
