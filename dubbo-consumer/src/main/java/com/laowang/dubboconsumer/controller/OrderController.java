package com.laowang.dubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.laowang.dubboapi.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Copyright (C), 2017-2020, 老王搞BUG
 * ClassName: StockController
 * Author:   WangPan
 * Date:     2020/5/7 12:02
 * Version: 1.0
 * Description: 
 */

@RestController
public class OrderController {

    @Reference(version = "1.0")
    private OrderService orderService;

    @GetMapping(value = "helloDubbo")
    public String helloDubbo() {
        Long orderId = 22l;
        Integer stock = orderService.searchOrder(orderId);
        String msg = "订单ID是：" + orderId + "的剩余库存是" + stock;
        return msg;
    }
}
