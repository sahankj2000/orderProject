package com.example.orderProject.Service;

import com.example.orderProject.Dto.Entry.PartnerEntryDto;
import com.example.orderProject.Dto.Response.PartnerResponseDto;

public interface PartnerService {
    public PartnerResponseDto addPartner(PartnerEntryDto dto);
    public PartnerResponseDto getPartnerById(int id);
    public void createPair(int partnerId,int orderId);
}
