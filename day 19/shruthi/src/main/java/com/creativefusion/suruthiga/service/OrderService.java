package com.creativefusion.suruthiga.service;

import java.util.List;

import com.creativefusion.suruthiga.dto.request.OrderRequest;
import com.creativefusion.suruthiga.dto.response.CountResponse;
import com.creativefusion.suruthiga.dto.response.OrderResponse;

public interface OrderService {

    boolean saveOrder(OrderRequest request);

    List<OrderResponse> getOrders(Long uid);

    CountResponse orderCount();

}
