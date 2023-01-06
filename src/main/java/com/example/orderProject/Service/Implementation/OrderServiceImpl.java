package com.example.orderProject.Service.Implementation;

import com.example.orderProject.Converter.OrderConverter;
import com.example.orderProject.Dto.Entry.OrderEntryDto;
import com.example.orderProject.Dto.Response.OrderResponseDto;
import com.example.orderProject.Model.Order;
import com.example.orderProject.Repository.OrderRepository;
import com.example.orderProject.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public OrderResponseDto addOrder(OrderEntryDto dto) {
        Order order = OrderConverter.dtoToEntity(dto);
        orderRepository.save(order);
        return OrderConverter.entityToDto(order);
    }

    @Override
    public OrderResponseDto getOrder(int id) {
        Order order = orderRepository.findById(id).orElse(null);
        if(order == null) return null;
        return OrderConverter.entityToDto(order);
    }
}
