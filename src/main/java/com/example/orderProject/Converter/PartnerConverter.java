package com.example.orderProject.Converter;

import com.example.orderProject.Dto.Entry.PartnerEntryDto;
import com.example.orderProject.Dto.Response.PartnerResponseDto;
import com.example.orderProject.Model.DeliveryPartner;
import lombok.experimental.UtilityClass;

@UtilityClass
public class PartnerConverter {
    public DeliveryPartner dtoToEntity(PartnerEntryDto dto){
        return DeliveryPartner.builder()
                .name(dto.getName())
                .phone(dto.getPhone())
                .build();
    }

    public PartnerResponseDto entityToDto(DeliveryPartner deliveryPartner){
        return PartnerResponseDto.builder()
                .id(deliveryPartner.getId())
                .name(deliveryPartner.getName())
                .phone(deliveryPartner.getPhone())
                .build();
    }
}
