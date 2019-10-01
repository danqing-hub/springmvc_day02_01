package com.danqing;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/**
 * @author 丹青
 * @date 2019/9/29 - 16:00
 **/
@Controller
@SessionAttributes(value = "msg")  //把msg=美美存入到session域对象中一份
public class AnnoController {
    /**
     * SessionAttributes的注解
     */
    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Model model) {
        System.out.println("testSessionAttributes……");
        //底层会存储到request域对象当中
        model.addAttribute("msg", "美美");
        return "success";
    }

    /**
     * 从session中取值
     *
     * @param modelMap
     * @return
     */
    @RequestMapping("/getSessionAttributes")
    public String getSessionAttributes(ModelMap modelMap) {
        System.out.println("testSessionAttributes……");
        String msg = (String) modelMap.get("msg");
        System.out.println(msg);
        return "success";
    }

    /**
     * 从session中删除
     */
    @RequestMapping("/deleteSessionAttributes")
    public String deleteSessionAttributes(SessionStatus sessionStatus) {
        System.out.println("testSessionAttributes……");
        sessionStatus.setComplete();
        return "success";
    }
}
