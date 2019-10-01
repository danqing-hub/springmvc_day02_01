package com.danqing;

import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 丹青
 * @date 2019/9/24 - 19:29
 **/
public class Orders {
     private Integer ordersId;
    private User user;

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
