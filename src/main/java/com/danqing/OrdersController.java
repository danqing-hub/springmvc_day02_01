package com.danqing;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 丹青
 * @date 2019/9/24 - 19:31
 **/
@Controller
public class OrdersController {
    /**
     * 向订单查询页面跳转
     * @return
     */
    @RequestMapping("/tofindOrderWithUser")
    public String tofindOrdersWithUser(){
        return "orders";
    }
    /**
     * 查询订单和用户信息
     */
    @RequestMapping("/findOrdersWithUser")
    public String findOrdersWithUser(Orders orders){
        Integer orderId = orders.getOrdersId();
        User user = orders.getUser();
        String username = user.getUsername();
        System.out.println("orderId"+orderId);
        System.out.println("username"+username);
        return "success";
    }
}
