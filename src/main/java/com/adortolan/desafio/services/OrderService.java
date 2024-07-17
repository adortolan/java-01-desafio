package com.adortolan.desafio.services;

import com.adortolan.desafio.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    ShippingService shippingService;

    public OrderService(){

    }

    public Double total(Order order) {
        return order.getBasic() - (order.getBasic() * (order.getDiscount() / 100))
                + shippingService.shipment(order);
    }
}
