package com.example.orderProject.Controller;

import com.example.orderProject.Dto.Entry.OrderEntryDto;
import com.example.orderProject.Dto.Response.OrderResponseDto;
import com.example.orderProject.Service.Implementation.OrderServiceImpl;
import com.example.orderProject.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderContoller {
    @Autowired
    OrderServiceImpl orderService;

    @PostMapping("/addOrder")
    public OrderResponseDto addOrder(@RequestBody OrderEntryDto dto){
        return orderService.addOrder(dto);
    }

    @GetMapping("/getOrder")
    public OrderResponseDto getOrderById(@RequestParam("id") int id){
        return orderService.getOrder(id);
    }

}
