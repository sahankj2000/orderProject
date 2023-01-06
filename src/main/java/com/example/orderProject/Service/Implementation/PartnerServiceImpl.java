package com.example.orderProject.Service.Implementation;

import com.example.orderProject.Converter.PartnerConverter;
import com.example.orderProject.Dto.Entry.PartnerEntryDto;
import com.example.orderProject.Dto.Response.PartnerResponseDto;
import com.example.orderProject.Model.DeliveryPartner;
import com.example.orderProject.Model.Order;
import com.example.orderProject.Repository.OrderRepository;
import com.example.orderProject.Repository.PartnerRepository;
import com.example.orderProject.Service.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartnerServiceImpl implements PartnerService {

    @Autowired
    PartnerRepository partnerRepository;

    @Autowired
    OrderRepository orderRepository;

    @Override
    public PartnerResponseDto addPartner(PartnerEntryDto dto) {
        DeliveryPartner partner = PartnerConverter.dtoToEntity(dto);
        partnerRepository.save(partner);
        return PartnerConverter.entityToDto(partner);
    }

    @Override
    public PartnerResponseDto getPartnerById(int id) {
        DeliveryPartner partner = partnerRepository.findById(id).orElse(null);
        if(partner == null) return null;
        return PartnerConverter.entityToDto(partner);
    }

    @Override
    public void createPair(int partnerId, int orderId) {
        Order order = orderRepository.findById(orderId).get();
        DeliveryPartner partner = partnerRepository.findById(partnerId).get();
        List<Order> list = partner.getOrders();
        list.add(order);
        partnerRepository.save(partner);
        order.setDeliveryPartner(partner);
        orderRepository.save(order);
    }
}
