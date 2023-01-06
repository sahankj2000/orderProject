package com.example.orderProject.Dto.Response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class PartnerResponseDto {
    int id;
    String name;
    String phone;
}
