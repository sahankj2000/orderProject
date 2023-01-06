package com.example.orderProject.Converter;

import com.example.orderProject.Dto.Entry.OrderEntryDto;
import com.example.orderProject.Dto.Response.OrderResponseDto;
import com.example.orderProject.Model.Order;
import lombok.experimental.UtilityClass;

@UtilityClass
public class OrderConverter {
    public Order dtoToEntity(OrderEntryDto dto){
        return Order.builder()
                .name(dto.getName())
                .date(dto.getDate())
                .build();
    }

    public OrderResponseDto entityToDto(Order order){
        return OrderResponseDto.builder()
                .date(order.getDate())
                .id(order.getId())
                .name(order.getName())
                .build();
    }
}
