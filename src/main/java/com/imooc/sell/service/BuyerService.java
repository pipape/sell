package com.imooc.sell.service;

import com.imooc.sell.dto.OrderDTO;

public interface BuyerService {

    public OrderDTO findOrderOne(String openid, String orderId);

    public OrderDTO cancelOrder(String openid, String orderId);
}
