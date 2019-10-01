package com.danqing;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 丹青
 * @date 2019/9/24 - 12:31
 **/
@Controller
public class HelloController {
    @RequestMapping(path = "/hello")
    public String sayhello(){
        System.out.println("Hello StringMVC");
        return "success";
    }
}
