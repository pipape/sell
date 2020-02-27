package com.imooc.sell.service;

import com.imooc.sell.dataaobject.OrderDetail;
import com.imooc.sell.dataaobject.OrderMaster;
import com.imooc.sell.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface OrderService {

    //创建订单
    OrderDTO create(OrderDTO orderDTO);

    //取消订单
    OrderDTO cancel(OrderDTO orderDTO);

    //查询订单列表
    Page<OrderDTO> findList(String BuyerOpenId, Pageable pageable);

    //查询订单
    OrderDTO findOne(String orderId);

    //完结订单
    OrderDTO finished(OrderDTO orderDTO);

    //支付订单
    OrderDTO paid(OrderDTO orderDTO);

}
