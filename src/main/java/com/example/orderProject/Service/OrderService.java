package com.example.orderProject.Service;

import com.example.orderProject.Dto.Entry.OrderEntryDto;
import com.example.orderProject.Dto.Response.OrderResponseDto;

public interface OrderService {
    public OrderResponseDto addOrder(OrderEntryDto dto);
    public OrderResponseDto getOrder(int id);
}
