package com.example.orderProject.Controller;

import com.example.orderProject.Dto.Entry.PartnerEntryDto;
import com.example.orderProject.Dto.Response.PartnerResponseDto;
import com.example.orderProject.Service.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PartnerController {
    @Autowired
    PartnerService partnerService;

    @PostMapping("/addPartner")
    public PartnerResponseDto addPartner(@RequestBody PartnerEntryDto dto){
        return partnerService.addPartner(dto);
    }

    @GetMapping("/getPartner")
    public PartnerResponseDto getPartner(@RequestParam(name = "id") int id){
        return partnerService.getPartnerById(id);
    }

    @PostMapping("/addPair")
    public void addPair(@RequestParam(name = "partnerId") int partnerId,@RequestParam(name = "orderId") int orderId){
        partnerService.createPair(partnerId,orderId);
    }
}
