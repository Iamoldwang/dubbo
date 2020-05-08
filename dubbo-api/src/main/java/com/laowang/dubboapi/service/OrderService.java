package com.laowang.dubboapi.service;

/**
 * Copyright (C), 2017-2020, 老王搞BUG
 * ClassName: StockService
 * Author:   WangPan
 * Date:     2020/5/5 20:57
 * Version: 1.0
 * Description: 订单接口
 */
public interface OrderService {

    /**
     * 根据订单ID查询库存
     * @param orderId
     * @return 返回库存
     */
    Integer searchOrder(Long orderId);
}
