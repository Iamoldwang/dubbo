package com.laowang.dubboprovider.service.impl;

import com.laowang.dubboapi.service.OrderService;
import org.springframework.stereotype.Service;


/**
 * Copyright (C), 2017-2020, 老王搞BUG
 * ClassName: StockServiceImpl
 * Author:   WangPan
 * Date:     2020/5/5 23:03
 * Version: 1.0
 * Description: 
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {


    //假如现在库存是33
    private Integer num = 33;
    /**
     * 根据订单ID查询库存
     * @param orderId
     * @return 返回库存
     */
    @Override
    public Integer searchOrder(Long orderId) {
        num = num + 1;
        return num;
    }
}
